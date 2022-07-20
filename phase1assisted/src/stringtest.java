public class stringtest {
	public static void main(String[] args) {
		String a = new String("String test");
		String b = "string method";
		System.out.println(a.charAt(5));
		System.out.println(a.compareTo(b));
		System.out.println(a.concat("start"));
		System.out.println(a.isEmpty());
		StringBuffer strb=new StringBuffer("string buffer");
		char [] str= {'j','a','v','a'};
		System.out.println(strb.append(str));
		StringBuilder strb1=new StringBuilder("string builder");
		System.out.println(strb1.append(a));
		//conversion of string object to string buffer anad string builder
		StringBuffer sbc=new StringBuffer(a);
		StringBuilder sbc1=new StringBuilder(a);
		System.out.println(sbc+" "+sbc1);
	}

}
