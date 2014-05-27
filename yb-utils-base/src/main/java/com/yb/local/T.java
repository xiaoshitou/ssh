package com.yb.local;

import java.util.Locale;

public class T {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a ="asdc\"ads\"";
		String reg= "/^\"{1,}$/";
		String b =a.replaceAll(reg, "*");
		System.out.println(b);
		System.out.println(a);
        System.out.println("asd".substring(0,1).toUpperCase()+"asd".substring(1));
	}

}
