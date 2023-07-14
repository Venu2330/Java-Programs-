package test;
	class Nodes{
		char key;
		Nodes left,right;

	public Nodes(char item)
	{
		key=item;
		left=right=null;
	}
	}
	public class Trees1 {
		Nodes root;
		public void traverseTreeInorder(Nodes node)
		{
			if(node!=null)
			{

				traverseTreeInorder(node.left);
				System.out.println(" "+node.key);
				traverseTreeInorder(node.right);
			}
		}
		public void traverseTreepreorder(Nodes node)
		{
			if(node!=null)
			{
				System.out.println(" "+node.key);
				traverseTreeInorder(node.left);
				traverseTreeInorder(node.right);
			}
		}
		public void traverseTreepostorder(Nodes node)
		{
			if(node!=null)
			{

				traverseTreeInorder(node.left);
				traverseTreeInorder(node.right);
				System.out.println(" "+node.key);
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Trees1 tree=new Trees1();
	tree.root=new Nodes('z');
	tree.root.left=new Nodes('*');
	tree.root.right=new Nodes('/');
	tree.root.left.left=new Nodes('7');
	tree.root.left.right=new Nodes('9');
	tree.root.left.left.right=new Nodes('1');
	tree.root.right.left=new Nodes('a');
	tree.root.right.right=new Nodes('5');
	tree.root.right.left.right=new Nodes('v');
	tree.root.right.right.left=new Nodes('y');
	
	
	System.out.println("\n Inorder");
	tree.traverseTreeInorder(tree.root);
	
	System.out.println("\n preorder");
	tree.traverseTreepreorder(tree.root);
	
	System.out.println("\n postorder");
	tree.traverseTreepostorder(tree.root);
	}

}
