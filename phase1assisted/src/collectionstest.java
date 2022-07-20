import java.util.*;
public class collectionstest {
public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList<Integer>();
    l1.add(501);
	l1.add(502);
	l1.add(503);
	l1.remove(1);
	Iterator iter= l1.iterator();
	System.out.println("arraylist");
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
Vector<String> l2=new Vector<String>();
    l2.add("abc");
	l2.add("def");
	l2.add("xyz");
	l2.remove(1);
	Iterator iter2= l2.iterator();
	System.out.println("vector");
	while(iter2.hasNext()) {
		System.out.println(iter2.next());
	}
	System.out.println("linked list");
	LinkedList<Double> l3=new LinkedList<Double>();
    l3.add(13.6);
	l3.add(14.8);
	l3.add(16.9);
	l3.remove(1);
	Iterator iter3= l3.iterator();
	while(iter3.hasNext()) {
		System.out.println(iter3.next());
	}
}
}
