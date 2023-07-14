package test;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="balaji208@gmail.com74";
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
		System.out.println(sum);
	}
}
