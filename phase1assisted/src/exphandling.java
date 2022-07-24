
public class exphandling {

		public static void main(String[] args) {
			String s="abcd";
			String a="9";
			
			Integer in=Integer.parseInt(a);
			System.out.println(in);
			try {
			Integer i=Integer.parseInt(s);
			System.out.println(i);
			}
			catch(Exception e){
				System.out.println("occured exception is "+e);
			}
			System.out.println("exception is handled");
		}
		}


