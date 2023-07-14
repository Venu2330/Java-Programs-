package test;
import java.util.*;
public class replacematrixvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		
		System.out.println("Enter the col size");
		int col=sc.nextInt();
		
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==-1)
				{
					arr[i][j]=1;
				}
				else
				{
					if(arr[i][j]==0)
					{
						arr[i][j]=-1;
					}
				}
			}
//				
			}
		System.out.println("Resultant Matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"  ");
				}

			System.out.println();
		}
	}

}
