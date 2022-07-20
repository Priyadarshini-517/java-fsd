import java.util.*;
public class mapstest {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put(1,"abc");
	m.put(3,"xyz");
	m.put(2,"mno");
	Set s=m.entrySet();
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		Map.Entry e=(Map.Entry)itr.next();
		System.out.println(e.getKey()+" "+e.getValue());
	}
}
}
