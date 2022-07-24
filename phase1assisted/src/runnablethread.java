
public class runnablethread implements Runnable {
public void run() {
	String tname=Thread.currentThread().getName();
	System.out.println(tname);
}
public static void main(String[] args) {
	runnablethread rt=new runnablethread();
	Thread t=new Thread(rt);
	t.start();
	System.out.println(Thread.currentThread().getName());
}
}
