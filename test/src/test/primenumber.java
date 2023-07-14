package test;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12,count=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				count=1;
				break;
			}
		}
	if(count==0)
	{
		System.out.println("it is a prime number");
	}
	else
	{
		System.out.println("it is a composite number");
	}

}
}
