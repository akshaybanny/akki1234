package logical_program;

import java.util.HashMap;
import java.util.Set;

public class count_repeating_char_using_hashmap {
	public static void main(String[] args) {
		String org="abcaba";
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		
		for(int i=0;i<=org.length()-1;i++) {
			
			char s1 = org.charAt(i);
			
			if(mp.containsKey(s1)) {
				mp.put(s1, mp.get(s1)+1);
			}
			else {
				mp.put(s1, 1);
			}
			
		}
		
		Set<Character> keys=mp.keySet();
	for(Character key:keys) {
			System.out.println(key+":"+mp.get(key));
		}
		
//		for(Character key:keys) {
//			if(mp.get(key)>1) {
//			System.out.println(key+":"+mp.get(key));
//		}
//	  }
		
	}

}
