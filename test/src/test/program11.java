package test;

import java.util.Scanner;

public class program11 {
	public int demo22()
	{
		Scanner sc = new Scanner(System.in);
		int input1=5;
		int temp1=-1;
		int temp2=-2;
		int[] arr= {0,2,4,6,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				int temp=arr[i];
				temp1=temp1+2;
				
				if(temp1!=temp)
				{
					return temp1;
				}
				
			}
			else
			{
				int temp=arr[i];
				temp2=temp2+2;
				
				if(temp2!=temp)
				{
					return temp2;
				}
				
			}
		}
		return 0;
		

	}
	public static void main(String[] args, char[] demo22) {
		// TODO Auto-generated method stub
		System.out.println(demo22);
		
				
	}

}
