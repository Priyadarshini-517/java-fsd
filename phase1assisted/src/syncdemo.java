
public class syncdemo {
 synchronized void demo(String s) {
	System.out.println("message is "+s);	
}
 public static void main(String[] args) {
	syncdemo d=new syncdemo();
	syncdemo f=new syncdemo();
	d.demo("hello");
	f.demo("bye");
	
}}