package com.pattern.behavior.observer.consumer;

import com.pattern.behavior.observer.consumer.AsyncExecutor.PriceChangedExecutor;
import com.pattern.behavior.observer.consumer.AsyncExecutor.PublishedExecutor;
import com.pattern.behavior.observer.producer.Product;

/**
 * 	Ïû·ÑÕß
 * @author yuyz
 *
 */
public class Admin implements IConsumer{
	private String name;
	public Admin() {
		this.name = "admin";
	}
	@Override
	public void onPublished(Product product) {
		new Thread(new PublishedExecutor(name, product)).start();
	}
	@Override
	public void onPriceChanged(double originalPrice, Product product) {
		new Thread(new PriceChangedExecutor(name, originalPrice, product)).start();	
	}
}