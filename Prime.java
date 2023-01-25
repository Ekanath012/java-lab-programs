import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		int i;
		int flag=0;
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the number to be checked : ");
		int n=in.nextInt();
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n+ " is a prime number.");
		else
			System.out.println(n+ " is not a prime number. ");
	}
}