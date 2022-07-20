
public class typecasting {
public static void main(String[] args) {
	//implicit type casting
	byte var=8;
	int a= var;
	float b=var;
	double c=var;
	System.out.println("byte is typecasted to integer as "+a);
	System.out.println("byte is typecasted to float as "+b);
	System.out.println("byte is typecasted to double as "+c);
	char d='B';
	a=d;
	b=d;
	c=d;
	System.out.println("character is typecasted to integer as "+a);
	System.out.println("character is typecasted to float as "+b);
	System.out.println("character is typecasted to double as "+c);
	//explicit type casting
	var=(byte)a;//integer to byte
	var=(byte)b;//float to byte
	var=(byte)c;//double to byte
	
	System.out.println("integer is typecasted to byte as "+var);
	System.out.println("float is typecasted to byte as "+var);
	System.out.println("double is typecasted to byte as "+var);
	char e[]= {'h','e','l','l','o'};
	String f=new String(e);
	System.out.println("char is typecasted to string : "+f);
}
}
