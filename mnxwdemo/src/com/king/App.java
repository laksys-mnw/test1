package com.king;

public class App {
	public static void main(String[] args) {
		System.out.println("hello world!");
		
		new Thread(()->{
			for(int i=0; i<10; i++)
				System.out.println("worker thread...");
		}).start();
	}
}
