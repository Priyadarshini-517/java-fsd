
public class multithreads extends Thread {
public void run() {
for (int i=0;i<10;i++) {
		System.out.println(i);
	}
	
}
public static void main(String[] args) {
	multithreads mt=new multithreads();
	mt.start();
	System.out.println(mt.getName());
}
}
