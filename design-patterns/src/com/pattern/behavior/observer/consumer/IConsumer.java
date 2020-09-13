package com.pattern.behavior.observer.consumer;

import com.pattern.behavior.observer.producer.Product;

/**
 * 	�۲���/�����߽ӿ�
 * @author yuyz
 *
 */
public interface IConsumer {
	void onPublished(Product product);
	void onPriceChanged(double originalPrice, Product product);
}
