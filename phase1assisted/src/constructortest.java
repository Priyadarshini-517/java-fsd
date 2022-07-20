
public class constructortest {
	constructortest() {
		System.out.println("constructor with no arguments");
	}

	constructortest(int a) {
		System.out.println("constructor with one argument" + a);
	}

	constructortest(int a,double b) {
		System.out.println("constructor with two arguments" + a + " " + b);
	}

	constructortest(char a,int b) {
		System.out.println("constructor with two arguments with different data types" + a + " " + b);
	}

	public static void main(String[] args) {
		constructortest ct = new constructortest();
		constructortest ct1 = new constructortest(5);
		constructortest ct2 = new constructortest(10,16.6);
		constructortest ct3 = new constructortest('a',15);
		System.out.println("constructor test");
	}
}
