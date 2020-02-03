package com.array.serviceImpl;

import java.util.Scanner;

import com.array.model.Account;
import com.array.service.Rbi;

public class Sbi implements Rbi {
	Account[] acc = new Account[2];
	Scanner sc = new Scanner(System.in);
	int count = 0;

	@Override
	public void createAccount() {
		Account ac = new Account();
		System.out.println("Enter Uname:");
		String uname = sc.next();
		System.out.println("Enter Pword:");
		String pword = sc.next();
		System.out.println("Enter HolderName:");
		String holdername = sc.next();
		System.out.println("Enter gender");
		String gender = sc.next();
		System.out.println("Enter Account Number:");
		String acc_num = sc.next();
		System.out.println("Enter Mobile Number:");
		String mob = sc.next();
		System.out.println("Enter Aadhar Number:");
		String aadhar = sc.next();
		while (true) {
			System.out.println("Enter Balance");
			double bal = sc.nextDouble();
			if (bal >= 500) {
				ac.setUname(uname);
				ac.setPword(pword);
				ac.setHoldername(holdername);
				ac.setGender(gender);
				ac.setAcc_no(acc_num);
				ac.setMobileno(mob);
				ac.setAadharno(aadhar);
				ac.setBalance(bal);
				System.out.println("Account Created.");
				break;
			} else {
				System.out.println("You Need To Deposite More Than 500 To Create Your Account.");
			}
		}
		acc[count] = ac;
		count++;
	}

	@Override
	public void displayAllDetails() {

		System.out.println("Enter user uname:");
		String un = sc.next();
		System.out.println("Enter user pword:");
		String pw = sc.next();
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < count; i++) {
				if (un.equals(acc[i].getUname()) && pw.equals(acc[i].getPword())) {

					System.out.println("user name is :" + acc[i].getUname());
					System.out.println("Pword is :" + acc[i].getPword());
					System.out.println("Holder name :" + acc[i].getHoldername());
					System.out.println("Gernder :" + acc[i].getGender());
					System.out.println("Account Number is :" + acc[i].getAcc_no());
					System.out.println("Mobile Number :" + acc[i].getMobileno());
					System.out.println("Aadhar Number :" + acc[i].getAadharno());
					System.out.println("Available Amount :" + acc[i].getBalance());
					flag = false;
					break;
				}
			}
			if (flag == false) {
				break;
			}

			else {
				System.out.println("You have entered wrong username and password.");
				break;
			}
		}
	}

	@Override
	public void displayBalance() {

		System.out.println("Enter user uname:");
		String un = sc.next();
		System.out.println("Enter user pword:");
		String pw = sc.next();
		boolean status =true;
		while(status){
		for (int i = 0; i <count; i++) {
			if (un.equals(acc[i].getUname()) && pw.equals(acc[i].getPword())) {
				System.out.println("Available amount in your account is: " + acc[i].getBalance());
				status=false;
				break;
			} 
		}
			if(status==false){
				break;
			}
			else {
				System.out.println("You have entered wrong username and password.");
				break;
			}
		}
	}

	@Override
	public void depositeAmount() {
		System.out.println("Enter user uname:");
		String un = sc.next();
		System.out.println("Enter user pword:");
		String pw = sc.next();
		boolean status=true;
		while(status){
		for (int i = 0; i <count; i++) {
			if (un.equals(acc[i].getUname()) && pw.equals(acc[i].getPword())) {
				double b = acc[i].getBalance();
				System.out.println("Enter amount you want to deposite :");
				double deposite = sc.nextDouble();
				double Total = b + deposite;
				acc[i].setBalance(Total);
				status=false;
				break;
			}
		
		if(status==false){
			break;
		}
		else{
			System.out.println("After deposite now " + acc[i].getBalance());
			break;
		}
		}
	}
	}
	@Override
	public void widthdrawlAmount() {
		System.out.println("Enter user uname:");
		String un = sc.next();
		System.out.println("Enter user pword:");
		String pw = sc.next();
		@SuppressWarnings("unused")
		boolean status=true;
		while(true){
		for (int i = 0; i < count; i++) {
			if (un.equals(acc[i].getUname()) && pw.equals(acc[i].getPword())) {
					System.out.println("Enter amount you want to widthdrawl :");
					double width = sc.nextDouble();
					double total = acc[i].getBalance() - width;
					if(total>= 500) {

					acc[i].setBalance(total);
					break;
				}
			}
			else{
			System.out.println("You cannot do this transaction.");
			}
			status=false;
		}
	}
}
}