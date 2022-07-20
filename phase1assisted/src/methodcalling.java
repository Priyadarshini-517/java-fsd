public class methodcalling {
	void method1() {
		System.out.println("method implementation demo");
	}
	void method1(int a) {
		System.out.println(" method overloading with argument"+a);
	}
public static void main(String[] args) {
	methodcalling mc= new methodcalling();
	mc.method1();
	mc.method1(2);
}
}
