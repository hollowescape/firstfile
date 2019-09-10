import  java.util.*;

public class prime{
	public static void main(String args[]){
		int i,l,h,flag=0;
		l=1;
		h=51;
		while(l<=h)
		{       flag=0;
			for(i=2;i<=l/2;i++)
			{
				if((l%i)==0)
				{
					flag=1;
					break;
				}
		if(flag==0)
		{
		      System.out.println(+l);
		}
		
                l++;      
		}
		}
	}
}

