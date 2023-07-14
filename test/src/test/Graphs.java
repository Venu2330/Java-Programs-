package test;

public class Graphs {
	private boolean adjmatrix[][];
	private int numvertices;
	
	public Graphs(int numvertices)
	{
		this.numvertices=numvertices;
		adjmatrix=new boolean[numvertices][numvertices];
	}
	
	public void addedge(int i,int j)
	{
		adjmatrix[i][j]=true;
		adjmatrix[j][i]=true;
	}
	
	public void noedge(int i,int j)
	{
		adjmatrix[i][j]=false;
		adjmatrix[j][i]=false;
	}
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		for(int i=0;i<numvertices;i++)
		{
			s.append(i+":");
			for(boolean j:adjmatrix[i])
			{
				s.append(j?1:0+"");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphs g = new Graphs(4);
		g.addedge(0,1);
		g.addedge(1,1);
		g.addedge(0,1);
		g.addedge(1,0);
		System.out.println(g.toString());

	}

}