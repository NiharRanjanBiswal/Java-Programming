import java.util.*;
public class LAB5_Q5
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=ob.nextInt();
		int n1=n;
		int s=0;
		while(n>0)
		{
			int r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		
		if(s==n1)
		System.out.println("Palindrome Number");
		else
		System.out.println("Not a Palindrome Number");
	}
}