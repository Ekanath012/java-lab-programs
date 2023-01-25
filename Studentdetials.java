import java.util.Scanner;
class student{
	String USN,Name,Branch,Phone;
	Scanner input=new Scanner(System.in);
	void read(){
		System.out.print("Enter USN:");
		USN=input.nextLine();
		System.out.print("Enter Name:");
		Name=input.nextLine();
		System.out.print("Enter Branch:");
		Branch=input.nextLine();
		System.out.print("Enter Phone:");
		Phone=input.nextLine();
	}
	void display(){
		System.out.printf("%-20s %-20s %-20s %-20s\n",USN,Name,Branch,Phone);
	}
}
public class Studentdetails{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Student Details Entry Program\n");
		System.out.print("----------------------\n");
		System.out.print("Enter the number of student details to be created:");
		int num=input.nextInt();
		student s[]=new student[num];
		
		for(int i=0;i<num;i++){
			System.out.println("\nEnter Student" +(i+1)+"Details");
			System.out.println("---------\n");
			s[i]=new student();
			s[i].read();
		}
		System.out.printf("\n%-20s %-20s %-20s %-20s\n","USN","Name","Branch","Phone");
		for(int i=0;i<num;i++){
			System.out.println();
			s[i].display();
		}
		input.close();
	}
}
		
