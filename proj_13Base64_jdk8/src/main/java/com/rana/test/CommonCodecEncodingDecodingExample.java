package com.rana.test;

import org.apache.commons.codec.binary.Base64;

public class CommonCodecEncodingDecodingExample {

	public static void main(String[] args) {
		
		//encoding a string from string to encoded form 
		//take input string 
		String str = "Diwakar Rana is a good Engineering";
		//convert it into bytes 
		byte[] arr = str.getBytes();
		//using predefine function of Base64 class
		byte[] arr1 = Base64.encodeBase64(arr);
		String str1 = new String(arr1);
		System.out.println(str1);
		
		//........................................................................................
		//now converting thid encoded format of string to normal again 
		byte[] as =str1.getBytes();
		byte[] as1 = Base64.decodeBase64(as);
		String str2 = new String(as1);
		System.out.println(str2);
		//
		
	}
}
