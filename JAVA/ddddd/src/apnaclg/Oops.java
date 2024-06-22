package apnaclg;

 //Introduation     and     constrcator
/*
class Student{
	String name;
	int age;
	
	public void cls() {
		System.out.println(this.name);     // object ka this hai       
		System.out.println(this.age);
	}
	

//	Student(){
//		System.out.println("hii");
//	}
	
	
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class Oops {
   public static void main(String args[]) {
	   Student s1 = new Student("domar", 21);
//	   s1.name = "Domar";
//	   s1.age = 21;
	   
	   s1.cls();
   }

}*/






// Polymorphism    (method overloading)

/*
class Student{
	String name;
	int age;
	
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}

}


public class Oops{
	public static void main(String ages[]) {
		Student s1 = new Student();
		s1.name = "Domar";
		s1.age = 21;
		
		s1.printInfo(s1.age);
		
	}
}*/






// Inhertans

class Shape{
	String color;     
	
	public void area() {
		System.out.println("Display area of Shape");
	}
}

public class Oops extends Shape{
	public static void main(String args []) {
		Oops o1 = new Oops();
		o1.area();
			
		}
		
			
		
	}

