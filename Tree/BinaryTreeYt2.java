public class BinaryTreeYt2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int ind=-1;
        public static Node treeBuilder(int nodes[]){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }
            Node newNode=new Node(nodes[ind]);
            newNode.left=treeBuilder(nodes);
            newNode.right=treeBuilder(nodes);
            return newNode;
        }
    }
    public static void main(String[]aggs){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node
    }
}
