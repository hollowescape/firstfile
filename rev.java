import java.util.*;
public class rev{
	public static void main(String arg[]){
		Scanner o = new Scanner(System.in);
		System.out.println(" enter the number of values");
		int a=o.nextInt();
		int[] b = new int[a];
		int i=0,t=0;
		System.out.println(" enter the elements of array");
		for(i=0;i<a;i++){
			b[i]=o.nextInt();
		}
		//System.out.println(" array elements are");
		for(i=0;i<(a/2);i++){
			t=b[i];
			b[i]=b[a-1-i];
			b[a-1-i]=t;
		}
		System.out.println(" array elements are");
		for(i=0;i<a;i++){
			System.out.println(" elements are "+b[i]);
		}

	}
}
	
	

