import java.util.Scanner;
public class Calc {
	public static void main(String[] args)
	{
		
		int n1,n2,op,add,sub,mul;
		double div;
		
		System.out.println("Enter the first number-: ");
		Scanner sc =new Scanner(System.in);
		n1=sc.nextInt();
		
		System.out.println("Enter the second number-: ");
		n2=sc.nextInt();
		
		while(true)
		{
			System.out.println(" 1.Addition \n 2.Subtraction\n 3.Multiplication \n 4.Division \n 5.Exit");
			System.out.println("Enter your choice?");
			op=sc.nextInt();
			
			switch(op)
			{
			case 1:
				add=n1+n2;
				System.out.println("Addition result "+add);
				break;
			
			case 2:
				sub=n1-n2;
				System.out.println("Subtraction result "+sub);
				break;
				
			case 3:
				mul=n1*n2;
				System.out.println("Multiplication result "+mul);
				break;
			
			case 4:
				div=(double)n1/n2;
				System.out.println("Result "+div);
				break;
				
			case 5:
				System.exit(0);
				
			}
			
		}
	}

}
