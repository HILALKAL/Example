package com.Example;

public class Application {

	public static void main(String[] args) {
		StringPalindrom obj=new StringPalindrom();
		String rev=obj.reverseString("meral");
		System.out.println(rev);
		
		
		boolean isPalindrome=obj.isPalindrome("dad");
		System.out.println(isPalindrome);
		
		String [] str=obj.array("1234 qwer asdf zxcv");
		for(String array:str) {
			System.out.println(array);
	  		}
		//---------------------------------------
		
	}

}
