package lists;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;

public class TestList {
public static void main(String[] args) {
	ArrayList a =new ArrayList();
	ArrayList b=new ArrayList();
	b.add(2);
	b.add(3);
	b.add(4);
	b.add(6);
	System.out.println("Elements of ArrayList B is:"+b);
	a.add(1);
	System.out.println(a);
	a.addAll(b);
	System.out.println(a);
	a.add(4,5);
	System.out.println(a);
	a.removeAll(b);
	System.out.println("Element of ArrayList a after removing ArrayList is"+a);
	
	ArrayList<String> names=new ArrayList<>();
	names.add("Archana");
	names.add("Rajesh");
	names.add("Vinodini");
	Iterator<String> iter=names.iterator(); //using iterator to traverse the ArrayList names
	System.out.println("Printing using iterator::");
	while(iter.hasNext()) {
		System.out.println(iter.next());
		
	}
	System.out.println("Printing using enhanced-for loop::");
	for(String x:names) {
		System.out.println(x);
	}
	
	Vector<String> v = new Vector<>();
	v.addElement("Jim");
	v.addElement("Pam");
	v.addElement("Dwight");
	System.out.println("******************Vector of names****************");
	System.out.println(v);

	for (String name : v) {
		System.out.println(name);
	}
	
}
}
