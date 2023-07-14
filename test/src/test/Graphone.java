package test;

import java.util.ArrayList;

public class Graphone {

		static void addedge(ArrayList<ArrayList<Integer>> am,int s,int d)
		{
			
			am.get(s).add(d);
			am.get(d).add(s);
		}
		
		static void printgraph(ArrayList<ArrayList<Integer>> am)
		{
			for(int i=0;i<am.size();i++)
			{
				System.out.println("vertex"+i+":");
				for(int j=0;j<am.get(i).size();j++)
				{
					System.out.println(" "+am.get(i).get(j));
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated methodArrayList<E>
		int v=4;
		ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			am.add(new ArrayList<Integer>());
			
			
		}
		addedge(am,0,1);
		addedge(am,1,1);
		addedge(am,1,0);
		addedge(am,0,1);
		printgraph(am);

	}

}
