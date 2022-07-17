package array;

import java.util.Arrays;

public class ex12 {
	public static void main(String[] args) {
		String[] s=new String[5];
		s[0]="chetena";
		s[1]="akshay";
		s[2]="ashwini";
		s[3]="nikhil";
		s[4]="abhinav";
		
		
		Arrays.sort(s);
		for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i]);
		}
	}

}
