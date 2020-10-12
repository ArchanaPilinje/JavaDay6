package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class TestSets {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(8);
		hs.add(11);
		hs.add(58);
		hs.add(46);
		hs.add(886);
		
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(8);
		lhs.add(11);
		lhs.add(58);
		lhs.add(46);
		lhs.add(886);
		
		System.out.println(lhs);
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(8);
		ts.add(11);
		ts.add(58);
		ts.add(46);
		ts.add(886);
		
		System.out.println(ts);
		System.out.println("Iterating TreeSet in reverse order");
		Iterator<Integer>itr=ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		

	}

}
