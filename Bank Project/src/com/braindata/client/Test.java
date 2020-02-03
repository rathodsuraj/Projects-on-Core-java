package com.braindata.client;

import java.util.Scanner;

import com.braindata.serviceImpl.Sbi;

public class Test {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick your choice.");
		boolean b = true;
		while (b) {
			System.out.println("1-> Create Account.");
			System.out.println("2-> Display Account Details.");
			System.out.println("3-> Display Account Balance.");
			System.out.println("4-> Deposite Money.");
			System.out.println("5-> Widthdrawl Money");
			System.out.println("6-> Exit.");

			System.out.println("Enter your choice");
			int n = sc.nextInt();

			switch (n) {
			case 1:
				s.createAccount();
				break;
			case 2:
				s.displayDetails();
				break;
			case 3:
				s.balance();
				break;
			case 4:
				s.depositeMoney();
				break;
			case 5:
				s.widthdrawlMoney();
				break;
			case 6:
				b = false;
				break;
			default:
				System.out.println("Please pick correct option:");
				break;
			}

		}
		sc.close();
	}
}
