import java.util.Scanner;
class switch{
	public static void main(String[] args){
		char op;
		int n1,n2,res;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the arithmetic operation[operand 1,operator,operand2] :");
		n1= in.nextInt();
		op=in.nextChar();
		n2=in.nextInt();
   		
		switch(op){
			case '+':res=n1+n2;
				System.out.println(n1+ "+" n2+ "=" +res);
				break;
			case '-':res=n1-n2;
				System.out.println(n1+ "-" n2+ "=" +res);
				break;
			case '*':res=n1*n2;
				System.out.println(n1+ "*" n2+ "=" +res);
				break;
			case '%':res=n1%n2;
				System.out.println(n1+ "%" n2+ "=" +res);
				break;
			case '/':if(n2==0)
					System.out.println("Divide by ZERO  error !...");
				else{
					res=n1+n2;
					System.out.println(n1+ "+" n2+ "=" +res);
					break;
				}
		}
		input.close();
	}
}

