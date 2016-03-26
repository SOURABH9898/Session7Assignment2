package com.acadglid.java.core.session7.assignment2;
import java.util.Scanner;

public class NumberFormatExceptionTest {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=0;
		scanner = new Scanner(System.in);
		System.out.println("enter the roll number of student");
		try{
			number=Integer.parseInt(scanner.next());
			
			
		}catch(NumberFormatException e){
			System.out.println("Please enter only digits. Roll number cannot be characters");
			number =Integer.parseInt(scanner.next());
		}
		System.out.println("The number entered is "+number);
	}

}
