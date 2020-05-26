public class BTInOrderEx {

    //used to create the tree node
    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int data){
            this.data = data;
        }
    }

    public static TreeNode createBinaryTree(){
        TreeNode rootNode = new TreeNode(40);

        TreeNode Node20 = new TreeNode(20);
        TreeNode Node10 = new TreeNode(10);
        TreeNode Node30 = new TreeNode(30);
        TreeNode Node60 = new TreeNode(60);
        TreeNode Node50 = new TreeNode(50);
        TreeNode Node70 = new TreeNode(70);
        TreeNode Node15 = new TreeNode(15);
        TreeNode Node55 = new TreeNode(55);



        rootNode.left = Node20;
        rootNode.right = Node60;

        Node20.left = Node10;
        Node20.right = Node30;

        Node60.left = Node50;
        Node60.right = Node70;

//        Node10.left = Node15;
//        Node50.right = Node55;

        return rootNode;
    }

    //in order - recursive solution:
    public void inOrderTraverse(TreeNode root){
        if(root != null){
            inOrderTraverse(root.left);
            System.out.print(root.data+ " ");
            inOrderTraverse(root.right);
        }
    }
    

    public static void main(String[] args) {
        BTInOrderEx bt = new BTInOrderEx();
        TreeNode rootNode = createBinaryTree();
        bt.inOrderTraverse(rootNode);
    }
}
