package maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Iterator;
public class TestMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Archana");
		hm.put(12, "Anusha");
		hm.put(13, "Anuradha");
		hm.put(52, "Rajesh");
		hm.put(35, "Vinodini");
		hm.put(15, "Supriya");
		hm.put(65, "Sameer");
		hm.put(27, "Owen");
		hm.put(33, "Kennon");
		hm.put(99, "Eli");
		System.out.println("CONTENTS OF HASH MAP");
		System.out.println(hm);
		
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1, "Archana");
		lhm.put(12, "Anusha");
		lhm.put(13, "Anuradha");
		lhm.put(52, "Rajesh");
		lhm.put(35, "Vinodini");
		lhm.put(15, "Supriya");
		lhm.put(65, "Sameer");
		lhm.put(27, "Owen");
		lhm.put(33, "Kennon");
		lhm.put(99, "Eli");
		System.out.println("CONTENTS OF LINKED HASH MAP");
		System.out.println(lhm);
		
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Archana");
		tm.put(12, "Anusha");
		tm.put(13, "Anuradha");
		tm.put(52, "Rajesh");
		tm.put(35, "Vinodini");
		tm.put(15, "Supriya");
		tm.put(65, "Sameer");
		tm.put(27, "Owen");
		tm.put(33, "Kennon");
		tm.put(99, "Eli");
		System.out.println("CONTENTS OF TREE MAP");
		System.out.println(tm);

	}

}
