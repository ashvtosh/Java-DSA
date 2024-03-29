class TreeNode {
    int data;
    TreeNode1 left, right;
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BST {
    static TreeNode1 root;
    public static TreeNode1 insertion(TreeNode1 node, int n) {
        if(node==null){
            TreeNode1 tn = new TreeNode1(n);
            return tn;
        }
        if(n<node.data)
            node.left = insertion(node.left, n);
        else if(n>node.data)
            node.right = insertion(node.right, n);
        return node;
    }
    public static void inOrder(TreeNode1 Node) {
        if(Node == null)
            return;
        inOrder(Node.left);
        System.out.print(Node.data + " ");
        inOrder(Node.right);
    }
    public static void preOrder(TreeNode1 Node) {
        if(Node == null)
            return;
        System.out.print(Node.data + " ");
        preOrder(Node.left);
        preOrder(Node.right);
    }
    public static void postOrder(TreeNode1 Node) {
        if(Node == null)
            return;
        postOrder(Node.left);
        postOrder(Node.right);
        System.out.print(Node.data + " ");
    }
    public static void main(String[] args) {
        root = insertion(root, 10);
        root = insertion(root, 155);
        root = insertion(root, 35);
        root = insertion(root, 180);
        root = insertion(root, 356);
        root = insertion(root, 33);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
