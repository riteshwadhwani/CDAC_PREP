package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static ArrayList<Integer> duplicateList(ArrayList<Integer> list) {
		ArrayList<Integer> list1 = list;
		list1.addAll(list);
		return list1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(10);
		list.add(20);
		
		ArrayList<Integer> listDuplicate = duplicateList(list);
		listDuplicate.sort(null);
		for(Integer a : listDuplicate) {
			System.out.println(a);
		}
	}

	

}
