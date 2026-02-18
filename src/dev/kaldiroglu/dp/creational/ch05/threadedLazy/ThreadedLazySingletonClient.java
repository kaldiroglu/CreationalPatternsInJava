package dev.kaldiroglu.dp.creational.ch05.threadedLazy;

public class ThreadedLazySingletonClient extends Thread {

	public static void main(String[] args) {
		for(int i = 0; i < 1000; i++){
			new ThreadedLazySingletonClient().start();
		}
		System.out.println("Number of objects: " + ThreadedLazySingleton.getInstanceCount());
	}
	
	public void run(){
		ThreadedLazySingleton ls = ThreadedLazySingleton.getInstance();
		ls.printName();
	}
}
