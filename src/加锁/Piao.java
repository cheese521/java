package 加锁;

import javax.swing.plaf.SliderUI;

public class Piao implements Runnable{
	int count=30;
	Object lock=new Object();
	
	public synchronized void xiaoshou() {
		if(count>0) {
			System.out.println(Thread.currentThread().getName()+"卖出第"+count+"张");
			count--;
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		while(count>0) {
			xiaoshou();
		}
	}
	
}
