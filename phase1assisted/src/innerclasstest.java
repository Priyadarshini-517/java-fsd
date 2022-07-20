public class innerclasstest {
 String a="hello world";
 public class class2test{
	 void display()
	 {
		 System.out.println(a+" inner class example");
	 }
 }
 public static void main(String[] args) {
	innerclasstest obj= new innerclasstest();
	innerclasstest.class2test ob=obj.new class2test();
	ob.display();
}
}
