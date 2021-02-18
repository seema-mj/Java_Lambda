package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Without using lambda expression
 * class MyComaprator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		return (I1<I2)?-1:(I1>I2)?1:0;
	}
	
}*/

//using lambda expression
public class LambdaComparator {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(25);
		arrList.add(90);
		arrList.add(15);
		arrList.add(5);
		arrList.add(100);
		
		System.out.println("List before sorting: " + arrList);
		Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(arrList,c);
		arrList.stream().forEach(System.out::println);
		List<Integer> l2 = arrList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		//System.out.println("List after sorting: " + arrList);
	}

}
