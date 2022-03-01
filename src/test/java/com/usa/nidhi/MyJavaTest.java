package com.usa.nidhi;

public class MyJavaTest{
	


	
	int salary;
	int incentive;
	int overtime;
	int cola;
	
	public void getjobinfo() {
		int total;
		salary = 80000;
		incentive = 4000;
		overtime =3500;
		cola = 5000;
	total = (salary+incentive+overtime+cola);
	
		System.out.println(" yearly pay" + total);
		
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
	public String getTowhidinfo() {
		return name;
		
		
	}
	public void  getsabihainfo(String name) {
		
	}
	
	public String getIsrataddress(String address) {
		return address;
	}
	
	public static void getemployeeid() {
		 int age = 25;
		 String name = "Sabiha";
		 String phonenumber ="(344)506-4990";
		 
		
	}
	
	public static void main(String[] args) {
		MyJavaTest.getNidhiinfo();
		MyJavaTest.getemployeeid();
	}
	
	 
		
	
	}	
		
		
		
		
		

