package test;

//import java.util.*;
public class Zformat
{
	public static void main(String[] args) {
	    int k=1;
//	    Scanner sc=new Scanner(System.in);
	   // String name=sc.nextLine();
	   String name="ReddyRocx";
	   int len=name.length();
	   System.out.println(name);
        for(int i=1;i<len;i++)
        {
            
            for(int j=0;j<len-k;j++)
            {
                if(i==len-1)
                {
                    System.out.print(name);
                    break;
                }
                if(j==len-k-1)
                {
                    char c=name.charAt(len-k-1);
                    System.out.println(c);
                }
                else
                {
                System.out.print(" ");
                }
            }
            k++;
        }
	}
}
