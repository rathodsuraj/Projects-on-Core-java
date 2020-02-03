package com.school.client;

import java.util.Scanner;

import com.school.serviceImpl.KarveNagar;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		KarveNagar k=new KarveNagar();
		Scanner sc=new Scanner(System.in);
		Boolean status=true;
		while(status){
			System.out.println("Choose Among Following....");
		System.out.println("1=>Adding Course:");
		System.out.println("2=>View Course:");
		System.out.println("3=>Adding Faculty:");
		System.out.println("4=>View Faculty:");
		System.out.println("5=>Adding Batch:");
		System.out.println("6=>View Batch:");
		System.out.println("7=>Adding Student:");
		System.out.println("8=>View Student:");
		System.out.println("9=>Exit.");
		System.out.println("Enter Your Choice:");
		int n=sc.nextInt();
		switch (n) {
		case 1:
			k.addCourse();
			break;
		case 2:
			k.viewCourse();
			break;
		case 3:
			k.addFaculty();
			break;
		case 4:
			k.viewFaculty();
			break;
		case 5:
			k.addBatch();
			break;
		case 6:
			k.viewBatch();
			break;
		case 7:
			k.addStudent();
			break;
		case 8:
			k.viewStudent();
			break;
		case 9:
			status=false;
			break;
		default:
			System.out.println("Enter valid option:");
			
		}

		
		}
	}

}
