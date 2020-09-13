package com.pattern.behavior.observer;

import com.pattern.behavior.observer.consumer.Admin;
import com.pattern.behavior.observer.consumer.Customer;

/**
 * 	�۲���/����-����ģʽ��������������
 * @author yuyz
 *
 */
public class Main {

	public static void main(String[] args) {
		Store store = new Store();
		
		store.addObserver(new Customer());
		store.addObserver(new Admin());
		
		store.addNewProduct("����", 4.2);
		store.addNewProduct("ţ��", 3.8);
		store.setProductPrice("����", 4.5);
	}

}
