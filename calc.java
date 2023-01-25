import java.util.Scanner;
class calc{
	public static void main(String[] args){
		char op;
		int n1,n2,res;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the arithmetic operation[operand 1,operator,operand2] :");
		n1= in.nextInt();
		op=in.next().charAt(0);
		n2=in.nextInt();
   		
		switch(op){
			case '+':res=n1+n2;
				System.out.println(n1+ " + " +n2+ " = " +res);
				break;
			case '-':res=n1-n2;
				System.out.println(n1+ " - " +n2+ " = " +res);
				break;
			case '*':res=n1*n2;
				System.out.println(n1+ " * " +n2+ " = " +res);
				break;
			case '%':res=n1%n2;
				System.out.println(n1+ " % " +n2+  " = " +res);
				break;
			case '/':if(n2==0)
					System.out.println("Divide by ZERO error !...");
				else{
					float div=n1/n2;
					System.out.println(n1+ " / " +n2+  " = " +div);
					break;
				}
			default:System.out.println("Invalid opertaion !....");
				  break;
		}
		
	}
}

