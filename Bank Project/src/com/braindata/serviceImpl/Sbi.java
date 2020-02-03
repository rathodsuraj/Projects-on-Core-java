package com.braindata.serviceImpl;

import java.util.Scanner;
import com.braindata.model.Account;

public class Sbi {
	Scanner sc = new Scanner(System.in);
	Account acc = new Account();

	public void createAccount() {
		System.out.println("Enter your Name");
		String name = sc.next();
		acc.setName(name);
		System.out.println("Enter your Gender");
		String gender = sc.next();
		acc.setGender(gender);
		System.out.println("Enter your Mobile Number");
		String mnumber = sc.next();
		acc.setMobileno(mnumber);
		System.out.println("Enter your Account Number");
		String acc_number = sc.next();
		acc.setAcc_no(acc_number);
		System.out.println("Enter your Aadhar Number");
		String aadhar = sc.next();
		acc.setAadharno(aadhar);
		while (true) {
			System.out.println("Enter Initial amount you want to deposit(>500)");
			double bal = sc.nextDouble();
			if (bal >= 500) {
				acc.setBalance(bal);
				System.out.println("Account succesfully created");
				break;
			} else {
				System.out.println("Amount should be more than 500 :");
			}
		}
	}

	public void displayDetails() {
		System.out.println("Name is :" + acc.getName());
		System.out.println("Mobile Number is :" + acc.getMobileno());
		System.out.println("Gender is :" + acc.getGender());
		System.out.println("Aadhar Number is :" + acc.getAadharno());
		System.out.println("Account Number is :" + acc.getAcc_no());
		System.out.println("Initial Amount is :" + acc.getBalance());

	}

	public void balance() {
		System.out.println("Available amount in your account is:" + acc.getBalance());

	}

	public void depositeMoney() {

		double ava = acc.getBalance();
		System.out.println("Enter Amount you want to deposite :");
		double amt = sc.nextDouble();

		double Total = ava + amt;
		System.out.println("After depositing " + amt + " Balance in your account is :" + Total);
		acc.setBalance(Total);

	}

	public void widthdrawlMoney() {
		double amt = acc.getBalance();
		while (true) {
		System.out.println("Enter amount you want to widthdrawl :");
		double width = sc.nextDouble();
		double Total = amt - width;
		System.out.println("After widthdrawl " + width + " from your account availabe balance is " + Total);
		acc.setBalance(Total);
			if (Total > 500) {
				System.out.println("Amount widthdrawl successfully.");
				System.out.println("Amount availabe is" + acc.getBalance());
				break;
			} else {
				System.out.println("You have to maintain min 500 in your account.");
			}

		}
	}

}
