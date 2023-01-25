import java.util.Scanner;
public class Quad2 {
	public static void main(String args[]){
		System.out.println("Enter the coefficients a,b and c: ");
		Scanner in=new Scanner(System.in);
		float a=in.nextFloat();
		float b=in.nextFloat();
		float c=in.nextFloat();
		double d=b*b-4*a*c;
		double r1,r2;
		
		if(d>0){
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Roots are equal and distinct.");
			System.out.printf("First Root = %.2f\n", r1);
			System.out.printf("Second Root = %.2f\n",r2);
		}
		else if(d==0){
			r1=r2=-b/(2*a);
			System.out.println("Roots are equal and real.");
			System.out.printf("First Root = %.2f\n",r1);
			System.out.printf("Second Root = %.2f\n",r2);
		}
		else{
			r1=-b/(2*a);
			r2=Math.sqrt(d)/(2*a);
			System.out.println("Roots are complex and imaginary.");
			System.out.printf("First Root = %.2f+%.2fi\n",r1, r2);
			System.out.printf("Second Root = %.2f-%.2fi\n",r1, r2);
		}
				
	}
}
