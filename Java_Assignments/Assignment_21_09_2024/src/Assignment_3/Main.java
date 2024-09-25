package Assignment_3;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<>();
		String input = "aabbccddeffg";
		
		for(int i =0;i<input.length();i++) {
			if(hm.get(input.charAt(i))!= null && hm.get(input.charAt(i))>0) {
				int value = hm.get(input.charAt(i));
				value++;
				hm.put(input.charAt(i), value);
			}
			else {
				hm.put(input.charAt(i), 1);
			}
		}
		char ans = '1';
		for(int i =0;i<input.length();i++) {
			if(hm.get(input.charAt(i))==1) {
				ans = input.charAt(i);
				break;
			}
		}
		
		System.out.println(ans);
		

	}

}
