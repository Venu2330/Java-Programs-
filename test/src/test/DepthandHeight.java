package test;

public class DepthandHeight {

		// TODO Auto-generated method stub
		static int height=-1;
		static class Node
		{
			int data;
			Node left;
			Node right;
		};
		static Node newNode(int item)
		{
			Node temp=new Node();
			temp.data=item;
			temp.left=temp.right=null;
			return temp;
			
		}
		static int findDepth(Node root,int x)
		{
			if(root==null)
			{
				return -1;
			}
			int dist=-1;
			if((root.data==x)|| (dist=findDepth(root.left, x))>=0 || (dist=findDepth(root.right, x))>=0)
			{
				return dist+1;
			}
			return dist;
		}
	static int findHeightleaf(Node root,int x)
	{
		if(root==null)
		{
			return -1;
		}
		int leftHeight=findHeightleaf(root.left, x);
		int rightHeight=findHeightleaf(root.right, x);
		int ans=Math.max(leftHeight, rightHeight)+1;
		if(root.data==x)
		{
			height=ans;
		}
		return ans;
	}
	
	static int findHeight(Node root,int x)
	{
		findHeightleaf(root, x);
		return height;
	}
		public static void main(String[] args) {
			Node root =newNode(10);
			root.left=newNode(50);
			root.right=newNode(100);
			root.left.left=newNode(110);
			root.left.right=newNode(120);
			root.left.left.right=newNode(150);
			root.left.right.left=newNode(200);
			root.left.right.left.right=newNode(270);
			root.right.left=newNode(130);
			root.right.right=newNode(140);
			root.right.left.right=newNode(250);
			root.right.right.right=newNode(300);
			root.right.right.right.left=newNode(350);
			root.right.right.right.left.right=newNode(400);
			
			int k=140;
			System.out.println("Depth: "+findDepth(root, k));
			
			System.out.println("Height:"+findHeight(root, k));		
	}

}
