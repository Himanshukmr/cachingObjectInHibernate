package client;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> s = new TreeSet<Integer>();
		
		s.add(12);
		s.add(14);
		s.add(9);
		s.add(6);
		s.add(45);
		s.add(1);
		
		
		ArrayList<Integer> al  = new ArrayList<>(s);
		System.out.println(al.get(al.size()-1));
		
		
		
	}
}
