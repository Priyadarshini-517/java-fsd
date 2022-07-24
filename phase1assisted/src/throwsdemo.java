
public class throwsdemo{
	public static void demo() throws ArithmeticException{
		int a=10;
		int b=0;
		int c=a/b;
	}
	
	public static void main(String[] args) {
		try {
			demo();
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception is "+e);
		}
		try {
			throw new ArrayIndexOutOfBoundsException("demo");
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("exception caught"+f);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
