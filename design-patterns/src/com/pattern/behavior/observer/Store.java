package com.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pattern.behavior.observer.consumer.IConsumer;
import com.pattern.behavior.observer.producer.Product;

/**
 *	观察者模式/发布-订阅模式
 *	商店中，消费者，管理员等群体（观察者/消息的消费者）对商品的价格，最近新上架的商品十分敏感；当一个新的商品上架时，或者商品的价格发生变动时
 *	他们都想第一时间得到消息。所以发生上述发布新商品，商品的价格改变（消息的生产者），我们就需要通知这些观察者。
 * @author yuyz
 *
 */
public class Store {
	private List<IConsumer> observers = new ArrayList<>();
	
	private Map<String, Product> products = new HashMap<>();
	
	//注册观察者
	public void addObserver(IConsumer consumer) {
		this.observers.add(consumer);
	}
	
	//取消观察者
	public void removeObserver(IConsumer consumer) {
		this.observers.remove(consumer);
	}
	
	public void addNewProduct(String name, double price) {
		Product product = new Product(name, price);
		products.put(product.getName(), product);
		
		observers.forEach(o->o.onPublished(product));
	}
	
	public void setProductPrice(String name, double price) {
		Product product = products.get(name);
		double originalPrice = product.getPrice();
		product.setPrice(price);
		
		observers.forEach(o->o.onPriceChanged(originalPrice, product));
	}
}
