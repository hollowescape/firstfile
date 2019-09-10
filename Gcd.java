import java.util.*;
public class Gcd{
	public static void main(String arg[]){
	Scanner o = new Scanner(System.in);
	int n1,m1,m,n,gcd,lcm,r=1;
	System.out.println(" enter the two number");
	m=o.nextInt();
	n=o.nextInt();
	m1=m;
	n1=n;
	while(r!=0)
	{
		r=m%n;
		m=n;
		n=r;
	}
	gcd=m;
	lcm=(m1*n1)/gcd;
	System.out.println(" the gcd of two number is "+gcd);
	System.out.println(" the lcm of two number is "+lcm);
	}
}
