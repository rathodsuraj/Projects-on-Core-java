package com.school.serviceImpl;

import java.util.ArrayList;
import java.util.Scanner;
import com.school.model.*;
import com.school.service.Cjc;
import java.util.*;

public class KarveNagar implements Cjc {
	Scanner sc = new Scanner(System.in);
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.println("Enter Course id:");
		int cid = sc.nextInt();
		System.out.println("Enter Course name:");
		String cname = sc.next();
		c.setCid(cid);
		c.setCname(cname);
		clist.add(c);
	}

	@Override
	public void viewCourse() {
		Iterator<Course> itr = clist.iterator();
		while (itr.hasNext()) {
			Course c = itr.next();
			System.out.println("Course id is " + c.getCid() + " Course name is " + c.getCname());
		}

	}

	@Override
	public void addFaculty() {
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Id:");
		int fid = sc.nextInt();
		System.out.println("Enter Faculty Namee:");
		String fname = sc.next();
		f.setFid(fid);
		f.setFname(fname);
		System.out.println("Following Courses are available:");
		this.viewCourse();
		//System.out.println(f.getC().getCid());
		boolean status = true;
		while (status) {
			Iterator<Course> itr = clist.iterator();
			while (itr.hasNext()) {
				Course c = itr.next();
				System.out.println("Enter Course Id in which you want to assing faculty:");
				int id = sc.nextInt();
				if (id == c.getCid()) {
					f.setC(c);
					System.out.println("Faculty Successfully Assingn..");
					status = false;
					break;
				}
			}
			if (status == false) {
				break;
			} else {
				System.out.println("Cannot Assign");
			}
		}
		flist.add(f);
	}

	@Override
	public void viewFaculty() {

		Iterator<Faculty> itr = flist.iterator();
		while (itr.hasNext()) {
			Faculty f = itr.next();
			System.out.println("Faculty id is " + f.getFid() + " & Name is :" + f.getFname());
			System.out.println("Course id is " + f.getC().getCid() + " & Name is :" + f.getC().getCname());
		}

	}

	@Override
	public void addBatch() {
		Batch b = new Batch();
		System.out.println("Enter Batch Id:");
		int bid = sc.nextInt();
		System.out.println("Enter Batch Name:");
		String bname = sc.next();
		b.setBid(bid);
		b.setBname(bname);
		System.out.println("Following Faculty Are Available:");
		this.viewFaculty();
		//System.out.println(b.getF().getFid());
		boolean status = true;
		while (status) {
			Iterator<Faculty> itr = flist.iterator();
			while (itr.hasNext()) {
				Faculty f = itr.next();
				System.out.println("Enter Faculty id in which you want to add");
				int id = sc.nextInt();
				if (id == f.getFid()) {
					b.setF(f);
					System.out.println("Batch Added Successfully...");
					status = false;
					break;
				}
			}
			if (status == false) {
				break;
			} else {
				System.out.println("Enter valid");
				break;
			}
		}
		blist.add(b);
	}

	@Override
	public void viewBatch() {
		Iterator<Batch> itr = blist.iterator();
		while (itr.hasNext()) {
			Batch b = itr.next();
			System.out.println("Batch id is " + b.getBid() + " & Name is " + b.getBname());
			System.out.println("Faculty id is " + b.getF().getFid() + " & Name is " + b.getF().getFname());
			System.out.println("Course id is " + b.getF().getC().getCid() + " & Name is " + b.getF().getC().getCname());
		}
	}

	@Override
	public void addStudent() {
		Student s = new Student();
		System.out.println("Enter Student Id:");
		int sid = sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname = sc.next();
		s.setSid(sid);
		s.setSname(sname);
		System.out.println("Following Batch is Available:");
		this.viewBatch();
		//System.out.println(s.getB().getBid());
		boolean status = true;
		while (status) {
			Iterator<Batch> itr = blist.iterator();
			while (itr.hasNext()) {
				Batch b = itr.next();
				System.out.println("Enter Batch id in which you want to add student...");
				int id = sc.nextInt();
				if (id == b.getBid()) {
					s.setB(b);
					System.out.println("Student added Succesfully..");
					status = false;
					break;
				}
			}
			if (status == false) {
				break;
			} else {
				System.out.println("Enter valid..");
				break;
			}

		}
		slist.add(s);
	}

	@Override
	public void viewStudent() {
		Iterator<Student> itr=slist.iterator();
		while(itr.hasNext()){
		Student s=itr.next();
		System.out.println("Student id is "+s.getSid()+" & Name is "+s.getSname());
		System.out.println("Batch id is "+s.getB().getBid()+" & Name is "+s.getB().getBname());
		System.out.println("Faculty id is "+s.getB().getF().getFid()+" & Name is "+s.getB().getF().getFname());
		System.out.println("Course id is "+s.getB().getF().getC().getCid()+" & Name is "+s.getB().getF().getC().getCname());
		}

	}

}
