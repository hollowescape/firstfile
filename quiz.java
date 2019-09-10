import java.util.*;

public class quiz{
	public static void main(String argu[]){
		Scanner o = new Scanner(System.in);
		int count=0,pos=0,ch;
		float perc=0;
		System.out.println(" enter the number of question");
		int a=o.nextInt();
		int[] arr = new int[a];
		int[] b = new int[a]; 
		 for(int i=0;i<a;i++){
                        System.out.println(" enter the key for question"+(i+1));
                        b[i]=o.nextInt();
                }
	       do{
		for(int i=0;i<a;i++){
			System.out.println(" enter the answer for question"+(i+1));
			arr[i]=o.nextInt();
		}
		for(int i=0;i<a;i++)
		{
			if(arr[i]==b[i])
			{
				count++;
			}
			else
			{
			   pos++;
			}
		}
		perc =(float)(count/a)*100;

		System.out.println(" the number of correct answers are"+count);
		System.out.println(" the number of incorrect answers are:"+pos);
		System.out.println(" the perc is "+perc);
		System.out.println(" enter the 1 to grade another quiz");
		ch=o.nextInt();
	       }while(ch==1);
	  }
}
