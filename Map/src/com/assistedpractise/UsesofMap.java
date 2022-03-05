package com.assistedpractise;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class UsesofMap {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"NTR");    
	      hm.put(2,"BALAYYA");    
	      hm.put(3,"Amruth");   

	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }



	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  

	      ht.put(4,"Akash");  
	      ht.put(5,"Puri");  
	      ht.put(6,"Mahesh");  
	      ht.put(7,"Masu");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Hero");    
	      map.put(9,"Villain");    
	      map.put(10,"Heroine");       

	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      } 


	}


}
