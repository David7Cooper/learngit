package com.erhia.cxd.util;

import java.util.Scanner;

public class SCUtil {
	private static Scanner input = null;
	
	public static Scanner getScanner(){
		if(input == null){
			input = new Scanner(System.in);
		}
		return input;
	}
}
