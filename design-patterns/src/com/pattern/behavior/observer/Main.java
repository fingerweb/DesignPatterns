package com.pattern.behavior.observer;

import com.pattern.behavior.observer.consumer.Admin;
import com.pattern.behavior.observer.consumer.Customer;

/**
 * 	观察者/发布-订阅模式，启动的主函数
 * @author yuyz
 *
 */
public class Main {

	public static void main(String[] args) {
		Store store = new Store();
		
		store.addObserver(new Customer());
		store.addObserver(new Admin());
		
		store.addNewProduct("鸡蛋", 4.2);
		store.addNewProduct("牛奶", 3.8);
		store.setProductPrice("鸡蛋", 4.5);
	}

}
