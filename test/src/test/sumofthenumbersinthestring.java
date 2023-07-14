package test;

public class sumofthenumbersinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="venugopal775 kannada23";
		int sum=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)>=48&&input.charAt(i)<=57)
			{
				char s=input.charAt(i);
				int a=s-'0';
				sum=sum+a;
			}
			else
			{
				System.out.print(input.charAt(i));
			}
		}
		System.out.println();
		int sum1=0;
		while(sum>0)
		{
			sum1=sum1+sum%10;
			sum/=10;
		}
		System.out.println(sum1);

	}

}
