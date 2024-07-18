package com.apjfsa;

public class Student {
	int StuID;
	String StuName;
	int StuMobileNo;
	String CourseName;
	
	void StudentDetails() {
		System.out.println("Student Identity Number = "+(StuID));
		System.out.println("Student Name = "+(StuName));
		System.out.println("Student's Mobile Number = "+(StuMobileNo));
		System.out.println("Course Name = "+(CourseName));
	}

	public static void main(String[] args) {
		
		Student ob=new Student();
		ob.StuID=101;
		ob.StuName="Harika";
		ob.StuMobileNo=98412;
		ob.CourseName="MCA";
		ob.StudentDetails();

	}

}
