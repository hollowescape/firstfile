import java.util.*;

public class grade{
	public static void main(String argu[]){
	Scanner o = new Scanner(System.in);
	int a,b,c,d,e;
	float grad;
	double perc;
	System.out.println(" enter the marks of subject");
	 a=o.nextInt();
	 b=o.nextInt();
	 c=o.nextInt();
	 d=o.nextInt();
	 e=o.nextInt();
	grad= (a+b+c+d+e);
	System.out.println(+grad);
	perc= grad*0.2;
	System.out.println(" grade is " +perc);
	if(perc>=90)
	{
		System.out.println(" s grad");
	}
	else if((perc>=80)&&(perc<90))
	{
		System.out.println(" a grade");
	}
	else if((perc>=70)&&(perc<80))
	{
		System.out.println(" b grade");
	}
	else if((perc>=60)&&(perc<70))
	{
		System.out.println(" c grade");
	}
	
	}
}


