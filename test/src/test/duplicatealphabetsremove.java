package test;

public class duplicatealphabetsremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Zoho company located at India";
		int count=0,count1=0;
		int k=0;
		for(int i=0;i<input.length();i++)
		{
//			System.out.println(input.length());
			char ch=input.charAt(i);
			count=0;
			if(ch==' ')
			{
				continue;
			}
			for(int j=0;j<input.length();j++)
			{
				//System.out.println(input.length());
				if(ch==input.charAt(j))
				{
					count++;
					if(count>1)
					{
					int temp=j;
//					System.out.println(ch+"  "+temp+"  is deleted");
					String str=input.substring(0,temp)+input.substring(temp+1);
//					input=str;
					System.out.println(str);
					count1++;
					}
				}
				
			}
			count=0;
			k=i;
			if(count1>0)
			{
			String str=input.substring(0,k)+input.substring(k+1);
//			System.out.println(ch+" "+k+"  is deleted");
			input=str;
			}
//			input.length=str.length();
		}
	}
}
