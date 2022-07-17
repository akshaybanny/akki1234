package logical_program;

import java.util.HashMap;
import java.util.Set;

public class ex_16_String_repeating_in_para {
	public static void main(String[] args) {
		String str="abc abcd abc abc abcd abc xyz abc abc xyz xyz ab";
		String [] ar=str.split(" ");
		HashMap<String, Integer> mp=new HashMap<String, Integer>();
		
		
		for(int i=0;i<=ar.length-1;i++) {
			
			String s1 = ar[i];
			
			if(mp.containsKey(s1)) {
				mp.put(s1, mp.get(s1)+1);
			}
			else {
				mp.put(s1, 1);
			}
			
		}
		
		Set<String> keys=mp.keySet();
//	for(String key:keys) {
//			System.out.println(key+":"+mp.get(key));
//		}
		
		for(String key:keys) {
			if(mp.get(key)>1) {
			System.out.println(key+":"+mp.get(key));
		}
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
