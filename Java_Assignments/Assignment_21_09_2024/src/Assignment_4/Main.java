package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		
		list.addAll(list1);
		
		list.sort(null);
		
		for(Integer a : list) {
			System.out.println(a);
		}

	}

}
