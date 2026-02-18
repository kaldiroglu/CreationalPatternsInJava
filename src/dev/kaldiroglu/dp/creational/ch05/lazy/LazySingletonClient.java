package dev.kaldiroglu.dp.creational.ch05.lazy;

import dev.kaldiroglu.dp.creational.ch05.threadedLazy.ThreadedLazySingleton;

public class LazySingletonClient {

	public static void main(String[] args) {
		for (int i = 0; i<100; i++){
			LazySingleton s = LazySingleton.getInstance();
			s.printName();
		}
		System.out.println("Number of objects: " + LazySingleton.getInstanceCount());
	}
}
