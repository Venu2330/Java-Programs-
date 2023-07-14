package test;
public class countdiagonals {
	public static void main(String[] args) {
		int[][] arr= {
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,0,1,1},
				{1,1,1,1,1,1,1,1}
		};
		int dcount=0,tdcount=0,d1count=0,r1count=0,rcount=0,k=0,ccount=0,c1count=0;
		int k1=0;
		for(int i=0;i<arr.length;i++)
		{
			k=0;r1count=0;c1count=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					if(arr[i][j]==1)
					{
						dcount++;
						if(arr.length==dcount)
						{
							tdcount++;
							
						}
					}
					
				}
				if(i+j==arr.length-1)
				{
					if(arr[i][j]==1)
					{
						d1count++;
						if(arr.length==d1count)
						{
							tdcount++;
							
						}
					}
				}				
				if(k1==i)
				{
					if(arr[i][j]==1)
					{
						r1count++;
						if(arr[i].length==r1count)
						{
							rcount++;
							r1count=0;
						}
					}

				}
				if(k==j)
				{
					if(arr[i][j]==1)
					{
						c1count++;
						if(arr.length==c1count)
						{
							ccount++;
							c1count=0;
						}
					}
				}
				k++;
			}
			k1++;
		}
		System.out.println("Diagonal count="+tdcount);
		System.out.println("Row count="+rcount);
		System.out.println("col count="+ccount);			
	}
}
