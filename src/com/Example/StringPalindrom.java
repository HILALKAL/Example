package com.Example;

public class StringPalindrom {
	String reverseString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		return (rev);
	}
	boolean isPalindrome(String str) {
		boolean flag=false;
		String reverse=reverseString(str);
		if(reverse.equalsIgnoreCase(str)) {
			flag=true;
		}
		return flag;
	}
	String[] array(String str) {
		String[] array=str.split(" ");
		
		return array;
			
		

		}

}
