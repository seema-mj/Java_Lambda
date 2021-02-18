package com.java.lambda;

/*Without using lambda
 * class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("child thread");
		}
		
	}
	
}*/


//with using lambda expression
public class LambdaTest {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i =0; i< 10 ;i++) {
				System.out.println("child thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Main thread");
		}
		

	}

}
