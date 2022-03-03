package com.usa.nidhi;

public class MyJavaClass {
	
	int rent;
	int zipcode;
	String location;
	double value;
	public void getMyaddress() {
	
		rent = 1500;
		zipcode = 77062;
		location = "Bay area-1621";
		System.out.println("myrent"+rent+zipcode+location);
	}
	public void getMyfriendinfo() {
		
		rent = 1900;
		zipcode = 72059;
		location = "woodheaven";
		System.out.println(rent+zipcode+location);
	}
	
	static int salary;
	static String position;
	static String phoneNumber;
	
	public void getEmployeeinfo() {
		
		salary = 3500;
		position = "Manager";
		phoneNumber ="(352)859-7095";
		System.out.println(salary+position+phoneNumber);
	}
	
	    static String name;
	    static int age;
	    static String grade;   
	
	public static void getNidhiinfo() {
	
		name ="Nidhi";
		age =14;
		grade = "9th";
		System.out.println(name+age+grade);
		
			
	}
	
	
		
	
	
	
		
		
	
	
	public void getJobinfo() {
		
		int Teammember = 25;
		String address = "52 69 street";
	    String name ="Taco Cabana";
		
		System.out.println(Teammember+address+name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyJavaClass obj = new MyJavaClass();
		obj.getMyaddress();
		obj.getMyfriendinfo();
		obj.getEmployeeinfo();
		
		obj.getJobinfo();
	}
	
	
	
	
	}


