package test;

public class magicalprime {

	public static void main(String[] args) {
		int flag=0,n1=12,n2=100,temp=0;
		while(n1<n2)
		{	
				flag=0;
				for(int i=2;i<n1/2;i++)
				{
					if(n1%i==0)
					{
						flag=1;
						break;
					}
				}
				int rev=0;
				temp=n1;
				if(flag==0)
				{			 
					while(temp>0)
					{
						 rev=rev*10+temp%10;
						 temp=temp/10;
					}
					for(int i=2;i<rev/2;i++)
					{
						if(rev%i==0)
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
					{
						System.out.println("Number is  a Magic number="+n1);
					}
				}
				n1++;
		}
	}
}
