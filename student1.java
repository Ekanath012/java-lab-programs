
public class student1 {
	int id;
	String name;
	student1(){
		System.out.println("This is default constructor :");
	}
	student1(int i,String n){
		id=i;
		name=n;
	}
	public static void main(String[] args){
		student1 s=new student1();
		System.out.println("\nDefault Constructor values :");
		System.out.println("Student ID : "+s.id+ "\nStudent name:" +s.name);
		System.out.println("\nParameterized constructor values :\n");
		student1 student1=new student1(10,"Kalpana");
		System.out.println("Student ID : "+student1.id+ "\nStudent name:" +student1.name);
	}
}
