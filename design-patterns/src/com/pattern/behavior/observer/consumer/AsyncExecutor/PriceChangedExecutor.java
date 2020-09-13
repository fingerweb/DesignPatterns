package com.pattern.behavior.observer.consumer.AsyncExecutor;

import java.util.Date;

import com.pattern.behavior.observer.producer.Product;

/**
 * 	��Ʒ�۸�䶯ʱ���첽���õ�ʵ�֡�
 * 	ͬ������ʱ�����ܻ������Ϣ�����Ŀ����ԡ�
 * @author yuyz
 *
 */
public class PriceChangedExecutor  implements Runnable{
	private String observerName;
	private double originalPrice;
	private Product product;
	public PriceChangedExecutor(String observerName, double originalPrice, Product product) {
		this.observerName = observerName;
		this.originalPrice = originalPrice;
		this.product = product;
	}
	@Override
	public void run() {
		System.out.println(new Date() + " : " +  observerName + " listener price change, "
				+ "product name:" + product.getName() + ", original price:" + originalPrice + ", new price" + product.getPrice());
	}
	
}
