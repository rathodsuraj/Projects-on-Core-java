package com.array.client;

import java.util.Scanner;

import com.array.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sbi s = new Sbi();
		boolean status = true;
		while (status) {
			System.out.println("1=>Create Account.");
			System.out.println("2=>Display All Details.");
			System.out.println("3=>Display Account Balance.");
			System.out.println("4=>Deposite Money.");
			System.out.println("5=>Widthdrawl Money.");
			System.out.println("6=>Exit.");
			System.out.println("Enter Your Choice:");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				s.createAccount();
				break;
			case 2:
				s.displayAllDetails();
				break;
			case 3:
				s.displayBalance();
				break;
			case 4:
				s.depositeAmount();
				break;
			case 5:
				s.widthdrawlAmount();
				break;
			case 6:
				status = false;
				break;
			default:
				System.out.println("Kindly Enter Proper Choice..");
				break;
			}
		}

	}

}
