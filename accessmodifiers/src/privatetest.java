
public class privatetest {
 private void method1() {
	 System.out.println("it is a private method:canbe accessed with in the class");
 }
public static void main(String[] args) {
	privatetest p= new privatetest();
	p.method1();
	
}
}
