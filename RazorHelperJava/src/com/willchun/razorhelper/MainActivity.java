package com.willchun.razorhelper;

import java.util.List;

import com.willchun.razorhelper.model.Channel;
import com.willchun.razorhelper.model.ChannelProduct;
import com.willchun.razorhelper.model.Product;
import com.willchun.razorhelper.service.ChannelProductService;
import com.willchun.razorhelper.service.ChannelService;
import com.willchun.razorhelper.service.ConfigService;
import com.willchun.razorhelper.service.ProductService;

public class MainActivity {
	public static final void main(String args[]){
		
/*		System.out.println("----------- channel------start------");
		ChannelService channelService = new ChannelService();
		List<Channel> l = channelService.queryAll();
		for(Channel c : l){
			System.out.println(c.toString());
		}
		System.out.println("----------- channel------end------");
		
		System.out.println("----------- ProductDao ------start------");
		ProductService dao2 = new ProductService();
		List<Product> l2 = dao2.findAll();
		for(Product c2 : l2){
			System.out.println(c2.toString());
		}
		System.out.println("----------- ProductDao ------end------");
		
		System.out.println("----------- ChannelProduct------start------");
		ChannelProductService channelProductService = new ChannelProductService();
		List<ChannelProduct> l3 = channelProductService.queryAll();
		for(ChannelProduct c3 : l3){
			System.out.println(c3.toString());
		}
		System.out.println("----------- ChannelProduct------end------");
		System.out.println("----------- Config ------start------");
		ConfigService dao4 = new ConfigService();
		List<com.willchun.razorhelper.model.Config> l4 = dao4.queryAll();
		for(com.willchun.razorhelper.model.Config c4 : l4){
			System.out.println(c4.toString());
		}
		System.out.println("----------- Config ------end------");*/
		business();
		
	}
	
	public static void business(){
		System.out.println("----------- start ----------");
		//1.获取应用列表 并且应用必须是Android平台的应用
		ProductService productService = new ProductService();
		List<Product> products = productService.queryAndroidAll();
		/*for(Product p : products){
			System.out.println(p.toString());
		}*/
		//2.获取Android渠道列表 
		ChannelService channelService = new ChannelService();
		List<Channel> channels = channelService.queryAndroidAll();
		/*for(Channel c : channels){
			System.out.println(c.toString());
		}*/
		//3.获取繁杂的渠道列表
		//a.如果存在 是否需要修改
		//b.如果不存在 添加
		ChannelProductService channelProductService = new ChannelProductService();
		//List<ChannelProduct> channelProducts = channelProductService.queryAll();
		/*for(ChannelProduct cp : channelProducts){
			System.out.println(cp.toString());
		}*/
		
		System.out.println("----------- 应用渠道  start ----------");
		for(Product p : products){
			//应用id
			int product_id = p.getId();
			//应用key
			String umeng_key = p.getUmeng_key();
			for(Channel c : channels){
				//渠道英文名
				int channel_id = c.getChannel_id();
				String channel_en = c.getChannel_en();
				//生成的key
				String key = umeng_key + "_" + channel_en;
				
				List<ChannelProduct> cps = channelProductService.queryByProductAndChannel(product_id, channel_id);
				int len = cps.size();
				if(len == 0){
					channelProductService.add(product_id, channel_id, key);
					System.out.println("--add--" + key);
				}
				//修改渠道，删除多余的渠道
				for(int i=0; i<len; i++){
					if(i == 0){
						if(!key.equals(cps.get(i).getProductkey())){
							//更新友盟渠道
							channelProductService.updateKeyById(cps.get(i).getCp_id(), key);
							System.out.println("--update--" + key);
						}
					}else {
						channelProductService.deleteById(cps.get(i).getCp_id());
						System.out.println("--delete--" + key);
					}
				}
					
			}
		}
		
		System.out.println("-----------应用渠道 end ----------");
		
		System.out.println("-----------应用配置 start ----------");
		ConfigService configService = new ConfigService();
		for(Product p : products){
			List<com.willchun.razorhelper.model.Config> configs = configService.queryByProduct_id(p.getId());
			int len = configs.size();
			if(len == 0){
				configService.add(p.getId());
				System.out.println("--config add--" + p.getId());
			}
			for(int i=1; i<len; i++){
				configService.delete(configs.get(i).getId());
				System.out.println("--config delete--" + p.getId());
			}
		}
		System.out.println("-----------应用配置 end ----------");
	}
		
	 
}
