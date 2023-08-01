package javaCollections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//ArrayList<String> al=new ArrayList<String>();
		//List al=new arrayList();
		
		//adding elements
		al.add(100);
		al.add("Sruthi");
		al.add(13.9);
		al.add(true);
		System.out.println(al); //[100, Sruthi, 13.9, true]
		
		//size
		System.out.println("Size of array list "+al.size());
		
		//removing elements
		al.remove(13.9);
		System.out.println(al); //[100, Sruthi, true]
		
		//adding at index
		al.add(2,"Bhavana");
		System.out.println(al);  //[100, Sruthi, Bhavana, true]
		
		//retrieve
		System.out.println(al.get(2));  //Bhavana
		
		//replace
		al.set(2, "Divya");
		System.out.println(al);  //[100, Sruthi, Divya, true]
		
		//present or not
		System.out.println(al.contains("Divya"));  //true
		
		//empty or not
		System.out.println(al.isEmpty());     //false
		
		
		//retrieving data
		
		//(1)for loop
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");     //100 Sruthi Divya true
		}
		
		
		//(2)for each loop
		for(Object i:al) {
			System.out.print(i+" ");    //100 Sruthi Divya true
		}
		
		
		//iterator method
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");  //100 Sruthi Divya true
		}
		
		System.out.println();
		
		ArrayList al1=new ArrayList();
		al1.add("E");
		al1.add("B");
		al1.add("C");
		al1.add("F");
		al1.add("E");
		
		
		//addAll method
		al.addAll(1,al1);                 //[100, E, B, C, F, E, Sruthi, Divya, true]
		System.out.println(al);
		
		//removeAll method
		al.removeAll(al1);
		System.out.println(al);    //[100, Sruthi, Divya, true]
		
		//sort
		Collections.sort(al1);
		System.out.println(al1);      //[B, C, E, E, F]
		
		//reverse order sorting
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);           //[F, E, E, C, B]
		
		//shuffling
		Collections.shuffle(al1);
		System.out.println(al1);          //[E, B, F, E, C]
		
		//converting into arr into arraylist
		String[] arr= {"dog","cat","pig"};
		System.out.println(arr);            //[Ljava.lang.String;@123772c4
		ArrayList al2=new ArrayList(Arrays.asList(arr));
		System.out.println(al2);           //[dog, cat, pig]
		
		
	}
}
