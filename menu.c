#include<stdio.h>
#define SWAP(x,y,t) (((t)=(x)),((x)=(y)),(y)=(t))
#define COMPARE(c,d) (((c)>(d))?1:(((c)==(d))?0:-1))
int n,b[50],s;
void input();
void display();
void sort();
int  binary(int le,int he);
void main()
{
	int a,l,h,r;
	printf(" enter the choice\n");
	printf(" 1. display\n 2. sort\n  3.search\n");
	scanf("%d",&a);
	switch(a)
	{
		case 1: display();
			break;
                case 2: sort();
			break;
		case 3: sort();
			l=0;h=n-1;
			printf(" enter the element to be searched\n");
			scanf("%d",&s);
			r=binary(l,h);
			break;

	}
      if(r!=-99)
      {
	      printf(" element found at position at %d",r+1);
      }
      else
      {
	      printf(" element not found\n");
      }


}
void input()
{
	int i;
	printf(" enter the number of value\n");
	scanf("%d",&n);
	printf(" enter the elements\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}

}
void display()
{
	input();
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\n",b[i]);
	}
}
void out()
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\n",b[i]);
	}
}

void sort()
{
	
       int pos,i,j,temp;
       input();
       for(i=0;i<n;i++)
       {
	       pos=i;
	       for(j=i+1;j<n;j++)
	       {
		       if(b[j]<b[pos])
		       {
			       pos=j;
		     
		       }
	       }
	       if(pos!=i)
	       {
		       SWAP(b[pos],b[i],temp);
	       }
	}
       // sorted elements
    out();
}

int  binary(int le,int he)
{
	int m;
	if(le<=he)
	{
		m=(le+he)/2;
	        switch(COMPARE(b[m],s))
		{

			case 0:return m;
			case 1:  return binary(le,m-1);
			case -1:return binary(m+1,he);
		}

	}

	return -99;
}
