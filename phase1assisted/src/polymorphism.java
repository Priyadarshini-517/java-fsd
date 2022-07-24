
public class polymorphism {
 int sum() {
	 int a=10;
	 int b=6;
	 return a+b;
 }
 int sum(int a, int b,int c) {
	 return a+b+c;
 }
 public static void main(String[] args) {
	polymorphism p= new polymorphism();
	System.out.println(p.sum());
	System.out.println(p.sum(5,4,9));
	System.out.println("one method with two different functionalities");
}
}
