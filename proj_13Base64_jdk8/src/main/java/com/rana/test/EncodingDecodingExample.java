package com.rana.test;

import java.util.Base64;

public class EncodingDecodingExample {

	public static void main(String[] args) {
		
		String str = "Diwakar Rana";
		byte[] arr = str.getBytes();
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] ar = encoder.encode(arr);
		String str1 = new String(ar);
		System.out.println(str1);
		System.out.println("............................................................................");
		byte[] a = str1.getBytes();
		Base64.Decoder decoder = Base64.getDecoder();
		 byte[] aa =decoder.decode(a);
		 String str2 = new String(aa);
		 System.out.println(str2);
		 
	}
}
