package com.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pattern.behavior.observer.consumer.IConsumer;
import com.pattern.behavior.observer.producer.Product;

/**
 *	�۲���ģʽ/����-����ģʽ
 *	�̵��У������ߣ�����Ա��Ⱥ�壨�۲���/��Ϣ�������ߣ�����Ʒ�ļ۸�������ϼܵ���Ʒʮ�����У���һ���µ���Ʒ�ϼ�ʱ��������Ʒ�ļ۸����䶯ʱ
 *	���Ƕ����һʱ��õ���Ϣ�����Է���������������Ʒ����Ʒ�ļ۸�ı䣨��Ϣ�������ߣ������Ǿ���Ҫ֪ͨ��Щ�۲��ߡ�
 * @author yuyz
 *
 */
public class Store {
	private List<IConsumer> observers = new ArrayList<>();
	
	private Map<String, Product> products = new HashMap<>();
	
	//ע��۲���
	public void addObserver(IConsumer consumer) {
		this.observers.add(consumer);
	}
	
	//ȡ���۲���
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
