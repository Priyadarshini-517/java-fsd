package accessmodifierstest;
public class default2 {
public static void main(String[] args) {
	defaulttest d= new defaulttest();
	d.method2();
	d.method3();
	
}
public void display() {
	System.out.println("public method: accessed inside and outside of the package");
}
}
