package map_collection;
import java.util.*;

import Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map=new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);   // if you dont provide generics its considered to be object
//		map.put(1, "hiee");
//		map.put(2.34, 6);        hetero pairs not allowed so classcast excep
		
		map.put(5, "Hello");
		map.put(1, 89);
		map.put(9, 'a');
		map.put(7, null); 
		map.put(1, 13.6);
		//map.put(null, 13.6);        null key not allowed
		
		System.out.println(map);   
		//output is sorted by keys - {1=89, 5=Hello, 7=null, 9=a}
		//AFTER adding the code in the constructor output becomes {9=a, 7=null, 5=Hello, 1=89} ie. descending
		
		System.out.println(map.containsKey(7));
		System.out.println(map.containsValue(89));   //false because 89 overwritten by (1, 13.6)
		
		System.out.println(map.replace(5, "bye"));
		System.out.println(map);
		
		System.out.println(map.replace(3, "bye"));   //key not present, output null
		System.out.println(map);
		
		System.out.println("-------------------------");
		
		System.out.println(map.replace(1, 45));    //returns value it is replacing
		System.out.println(map.replace(1, 45, 58));     //returns true if present
		System.out.println(map);
		
		System.out.println("------------------------------------");
		
		TreeMap<String, List<String>> mp=new TreeMap<>();
		List<String> l1=Arrays.asList("Kol","Bang","Hyd");
		List<String> l2=Arrays.asList("JK","Pune","Gur");
		List<String> l3=Arrays.asList("Bhub","Chen","Mum");
		
		mp.put("SBI", l1);
		mp.put("PNB", l2);
		mp.put("Axis", l3);
		
		System.out.println(mp);
		
		TreeMap<Integer, Map<Integer,String>> mp2=new TreeMap<>();  // this also works :))
		
		System.out.println("--------------------------------");
		
		TreeMap<Integer, String> mpp=new TreeMap((o1,o2)->(Integer)o2-(Integer)o1);
		mpp.put(5, "Hello");
		mpp.put(1, "89");
		mpp.put(9, "a");
		mpp.put(7, null); 
		mpp.put(1, "13.6");
		
		Set<Integer> set=mpp.keySet();
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		Collection<String> col=mpp.values();
		Iterator<String> itr1=col.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		
		Set s=mpp.entrySet();     // if you dont provide generics every entry considered to be object class type
		Iterator itr2=s.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		for (Object o:s) {       //see every entry is of type Object
			System.out.println(o);
		}
		
		Set<Entry<Integer,String>> s1=mpp.entrySet();     // if you dont provide generics every entry considered to be object class type
		Iterator itr3=s1.iterator();
		while(itr3.hasNext()) {
			System.out.print(itr3.next()+" ");
		}
		
		for (Entry<Integer,String> e:s1) {       //see every entry is of type Object
			System.out.println(e);
		}
	
	}

}
