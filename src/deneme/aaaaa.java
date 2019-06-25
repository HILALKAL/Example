package deneme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class aaaaa {

	public static void main(String[] args) {
		
		List<Integer> arr=Arrays.asList(new Integer [] {3,4,2,1,5,7,6,7,6});//
		
		System.out.println(arr);
		
		HashSet<Integer> array=new HashSet<>(arr);
		
		System.out.println(array);
		
		List<Integer> num=new ArrayList<>(arr);
		
		Collections.sort(num);
		System.out.println(num);
		
		
		
		
		
		
	}

}
