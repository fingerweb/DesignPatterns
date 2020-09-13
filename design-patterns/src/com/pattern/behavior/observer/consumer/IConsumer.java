package com.pattern.behavior.observer.consumer;

import com.pattern.behavior.observer.producer.Product;

/**
 * 	观察者/消费者接口
 * @author yuyz
 *
 */
public interface IConsumer {
	void onPublished(Product product);
	void onPriceChanged(double originalPrice, Product product);
}
