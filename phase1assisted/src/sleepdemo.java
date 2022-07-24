
public class sleepdemo extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		 currentThread().setName("waiting thread");
		 
		 try {
			 Object a=new Object();
			 a.wait(1000);
		 }
		 catch(Exception e)
		 {
				System.out.println("waiting thread");
		}
			
		}
		public static void main(String[] args) {
			sleepdemo mt=new sleepdemo();
			Thread t=new Thread(mt);
			t.start();
			try{
			t.sleep(1000);
			for(int j=0;j<10;j++) {
				System.out.println(mt.getName()+" "+j);
			}}
			catch(InterruptedException e) {
				System.out.println("sleep thread");
			}
			
		}
		}


