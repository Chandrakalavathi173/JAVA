package javaCollections;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList ll=new LinkedList();
		ll.add("Bhavana");
		ll.add(true);
		ll.add("AARthi");
		ll.add(13.45);
		ll.add("MAnju");
		System.out.println(ll);   //[Bhavana, true, AARthi, 13.45, MAnju]
		
		LinkedList l1=new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		
		ll.addAll(1,l1);
		System.out.println(ll);  //[Bhavana, A, B, C, D, E, true, AARthi, 13.45, MAnju]
		
		ll.remove(2);
		System.out.println(ll);   //[Bhavana, A, C, D, E, true, AARthi, 13.45, MAnju]
		
		ll.removeAll(l1);
		System.out.println(ll);   //[Bhavana, true, AARthi, 13.45, MAnju]
		
		System.out.println(ll.get(2));
		
		ll.set(2,"DEEPTHI");
		System.out.println(ll);
		
		ll.remove();
		System.out.println(ll);
		
		//isEmpty()
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains("siri"));
		System.out.println(ll.containsAll(l1));
		
		//addFirst and addLast
		ll.addFirst("Bhavana");
		ll.addLast("Manjula");
		System.out.println(ll);
		
		//removeFirst and removeLast
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//getFirst and getLast
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
//		System.out.println(Collections.sort(ll));
		
		
	}

}
