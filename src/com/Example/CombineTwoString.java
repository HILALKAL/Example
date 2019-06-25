package com.Example;

public class CombineTwoString {
	

	static String  mix(String a,String b) {
        String mix="";
        for(int i=0; i<a.length(); i++) {
          mix= mix+a.charAt(i)+b.charAt(i);
            
        }
        return mix;
    }   
        
    
    public static void main(String[] args) {
       
        System.out.println(CombineTwoString.mix("12345","abcde"));
    }



}
