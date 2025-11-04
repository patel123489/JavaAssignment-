package String;

import java.util.Iterator;

public class A002_StringMethod {

	public static void main(String[] args) {
		
		String str = "Sun Rise in East";

//		System.out.println(str.length());
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.charAt(5));
//		System.out.println(str.indexOf('i'));
//		System.out.println(str.indexOf('s'));
//		System.out.println(str.lastIndexOf('s'));
//		System.out.println(str.startsWith("S"));
//		System.out.println(str.endsWith("l"));
//		System.out.println(str.substring(3, 5));
//		System.out.println(str.replace("e", "T"));
//		System.out.println(str.trim());
//
//		String words[] = str.split(" ");//
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i]);
//
//		}
//
//		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
		byte b[] = str.getBytes();
		for(int i =0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}