package com.automation.webapp;

import java.util.Scanner;

public class SwapString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter string which you want to swap");

		name=sc.nextLine();
		char[] charname=name.toCharArray();
		char temp;

		for(int i=0,j=charname.length-1;i<j;i++,--j) {
			temp=charname[i];
			charname[i]=charname[j];
			charname[j]=temp;

		}

		System.out.print(charname);

	}

}
