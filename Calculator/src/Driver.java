import java.util.*;
public class Driver {
	public static void main(String args[])
	{
		Cal p=new Cal();
		System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("enter 1.Addition 2.Subtraction 3.Multiplication 4.Division");
		int l=sc.nextInt();
        if(l==1) {
        p.add(a,b);
        }
        else if(l==2)
        {
		p.sub(a,b);
        }
        else if(l==3)
        {
		p.mul(a,b);
        }
        else
        {
		p.div(a, b);
        }
		
	}

}
