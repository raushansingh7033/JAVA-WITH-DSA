class TreeNode{
    int num;
    TreeNode right;
    TreeNode left;
    TreeNode(int num){
        this.num=num;
    }
}

public class _04_Size_Of_Tree {
    public static void main(String[] args) {
          TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(70);
        root.right.right=new TreeNode(60);
        System.out.println(size(root));
    }
    public static int size(TreeNode root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}
