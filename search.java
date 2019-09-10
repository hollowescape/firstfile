import java.util.*;
public class search{
        public static void main(String arg[]){
                Scanner o = new Scanner(System.in);
                System.out.println(" enter the number of values");
                int a=o.nextInt();
                int[] b = new int[a];
                int i=0,t=0,p=0;
                System.out.println(" enter the elements of array");
                for(i=0;i<a;i++){
                        b[i]=o.nextInt();
                }
		System.out.println(" enter the element to be searhed");
		int d=o.nextInt();
		for( int c: b){
			if(c==d)
			{
				System.out.println(" element found");
				p=1;
				break;
			}
		}
		if(p!=1)
		{
			System.out.println(" element not found");
		}

	}
}


