public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;

    }

    public void PreOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public void InOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        InOrderTraversal(root.left);
        System.out.println(root.data+" ");
        InOrderTraversal(root.right);
    }

    public void PostOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.println(root.data+" ");
    }
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.CreateBinaryTree();
        bt.PostOrderTraversal(bt.root);
        
//         bt.PreOrderTraversal(bt.root);
//         bt.InOrderTraversal(bt.root);
        
    }
}
