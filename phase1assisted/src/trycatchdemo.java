
public class trycatchdemo {
	
		public static void main(String[] args) {
			int a[]= {5,7,2,6};
			String b=args[0];
			try {
			for(int i=0;i<=a.length;i++){
				System.out.println(a[i]);}
				int c=Integer.parseInt(b);
				System.out.println(c);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("exception occured is "+e);
			}
			catch(Exception e3) {
				System.out.println(e3);
			}
				System.out.println("Statements after exception");
			}
		}

