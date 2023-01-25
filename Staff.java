import java.util.Scanner;
public class Staff {
	String staffid,Name,Phone,salary;
	Scanner in=new Scanner(System.in);
	void read(){
		System.out.println("Enter Staff ID : ");
		staffid=in.nextLine();
		System.out.println("Enter name : ");
		Name=in.nextLine();
		System.out.println("Enter Phone number : ");
		Phone=in.nextLine();
		System.out.println("Enter Salary : ");
		salary=in.nextLine();
	}
	void display(){
		System.out.printf("\n%-15s", "STAFF ID :");
		System.out.printf("%-15s\n",staffid);
		System.out.printf("%-15s", "NAME :");
		System.out.printf("%-15s\n",Name);
		System.out.printf("%-15s", "Phone number :");
		System.out.printf("%-15s\n",Phone);
		System.out.printf("%-15s", "SALARY :");
		System.out.printf("%-15s\n",salary);
	}
}
class Teaching extends Staff{
	String Domain,Publication;
	void read_Teaching(){
		super.read();
		System.out.println("Enter Domain : ");
		Domain=in.nextLine();
		System.out.println("Enter Publication : ");
		Publication=in.nextLine();
	}
	void display(){
		super.display();
		System.out.printf("%-15s", "Domain :");
		System.out.printf("%-15s\n",Domain);
		System.out.printf("%-15s", "Publication :");
		System.out.printf("%-15s\n",Publication);
	}
}
class Contract extends Staff{
	String period;
	void read_Contract(){
		super.read();
		System.out.println("Enter Period :");
		period=in.nextLine();
	}
	void display(){
		super.display();
		System.out.printf("%-15s", "Period :");
		System.out.printf("%-15s\n",period);
	}
}
class Technical extends Staff{
	String skills;
	void read_Technical(){
		super.read();
		System.out.println("Enter skills :");
		skills=in.nextLine();
	}
	void display(){
		super.display();
		System.out.printf("%-15s", "Skills :");
		System.out.printf("%-15s\n",skills);
	}
}
class Staffdetails{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of staff details to be created: ");
		int n=in.nextInt();
		Teaching steach[]=new Teaching[n];
		Technical stech[]=new Technical[n];
		Contract scon[]=new Contract[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter teaching staff information : ");
			steach[i]=new Teaching();
			steach[i].read_Teaching();
		}
		for(int i=0;i<n;i++){
			System.out.println("Enter technical staff information : ");
			stech[i]=new Technical();
			stech[i].read_Technical();
		}
		for(int i=0;i<n;i++){
			System.out.println("Enter contract staff information : ");
			scon[i]=new Contract();
			scon[i].read_Contract();
		}
		System.out.println("\n----STAFF DETAILS----\n");
		System.out.println("----TEACHING STAFF DETAILS----\n");
		for(int i=0;i<n;i++){
			steach[i].display();
		}
		System.out.println();
		System.out.println("----TECHNICALSTAFF DETAILS----\n");
		for(int i=0;i<n;i++){
			stech[i].display();
		}
		System.out.println();
		System.out.println("----CONTRACT STAFF DETAILS----\n");
		for(int i=0;i<n;i++){
			scon[i].display();
		}
		System.out.println();
	}
}