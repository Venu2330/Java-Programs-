package test;
import java.util.*;

public class nonzeroindexposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();		
		int[][] arr1=new int[size][size];
		int[][] arr2=new int[size][size];
		int[][] arr3=new int[size][size];
		System.out.println("Enter the elements for the array1");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements for the array2");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 arr3[i][j]=arr1[i][j]+arr2[i][j];
				 System.out.print(arr3[i][j]+"    ");
			}
			System.out.println();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				 if(arr3[i][j]!=0)
				 {
					 System.out.println("The index of"+arr3[i][j]+"is="+i+j);
				 }
			}
		}
		
		
	}

}
