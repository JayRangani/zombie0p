package com.Jay.Clg.java;

import java.util.Scanner;

public class Weight_Converter {
	public static void main(String[] args) {
		System.out.println("Welcome To Weight Converter....");
		System.out.println("Enter 1, For Killogram To Gram....");
		System.out.println("Enter 2, For Gram To Killogram....");
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		
		if(choice==1) {
			System.out.println("Please Enter Your Weight...");
			double Weight  = scn.nextDouble();
				   Weight *= 1000;
				   System.out.println("You Weight Is "+ Weight + "gm");
		}else if(choice==2){
			System.out.println("Please Enter Your Weight...");
			double Weight  = scn.nextDouble();
				   Weight /= 1000;
				   System.out.println("You Weight Is "+ Weight + "Kg");
		}else {
			System.out.println("Please Enter Currect Choice");
		}
			
	}
}
