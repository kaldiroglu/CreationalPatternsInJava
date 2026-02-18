
package dev.kaldiroglu.dp.creational.ch05.simple;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private static int count;
	private String name;

	private Singleton() {
		name = "Singleton-" + count;
		count++;
	}

	public static Singleton getInstance() {
		return singleton;
	}

	public void printName() {
		System.out.println(name);
	}

	public static int getInstanceCount() {
		return count;
	}
}
