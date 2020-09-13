package com.pattern.behavior.observer.consumer.AsyncExecutor;

import java.util.Date;

import com.pattern.behavior.observer.producer.Product;

/**
 * 	商品发布，发布消息的观察者/消费者的实现
 * @author yuyz
 *
 */
public class PublishedExecutor implements Runnable{
	private String observerName;
	private Product product;
	public PublishedExecutor(String observerName, Product product) {
		this.observerName = observerName;
		this.product = product;
	}
	@Override
	public void run() {
		System.out.println(new Date() + " : " +  observerName + 
				" listener published, product name:" + product.getName() + ", product price: " + product.getPrice());
	}
}
