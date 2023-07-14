package test;
import java.util.*;
public class jagardarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rowsize");
		int size=sc.nextInt();
		int[][] arr=new int[size][];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the coloumn size");
			int col=sc.nextInt();
			arr[i]=new int[col];
			System.out.println("Enter the elements for"+col+"column");
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				if((j+1)==col)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum="+sum);

	}

}
