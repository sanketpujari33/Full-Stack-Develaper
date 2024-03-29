package W_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {
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
        static  int idx=-1;
        public static Node buildTreee(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
             newNode.left=buildTreee(nodes);
             newNode.right=buildTreee(nodes);
             return newNode;
        }
    }
    public  static  void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
    System.out.print(root.data+" ");
}
public static void levelOrder(Node root){
        if(root==null){
            return;
        }
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    q.add(null);
    while (!q.isEmpty()){
        Node currNode =q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else {
                q.add(null);
            }
        }else {
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
                }
            if (currNode.right!=null){
                q.add(currNode.right);
                }
            }
        }
    }
    public static  int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countOfNodes(root.left);
        int rightCount=countOfNodes(root.right);

        return leftCount+rightCount+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return  leftSum+ rightSum+root.data;
    }
    public static int heightATree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight=heightATree(root.left);
        int rightHeight= heightATree(root.right);
        int myHeight=Math.max(leftHeight, rightHeight)+1;

        return myHeight;
    }
    public static int diameterOfATreeFrist(Node root){
        if(root==null){
            return  0;
        }
        int diam1=diameterOfATreeFrist(root.left);
        int diam2=diameterOfATreeFrist(root.left);
        int diam3=heightATree(root.left)+heightATree(root.right)+1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    static  class  TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameterOfATreeSecond(Node root){
        if(root ==null){
           return new TreeInfo(0,0);
        }
        TreeInfo left=diameterOfATreeSecond(root.left);
        TreeInfo right=diameterOfATreeSecond(root.right);
        int myHeight=Math.max(left.ht, right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht + right.ht + 1;
        int myDiam = Math.max(Math.max(diam1,diam2), diam3);
        TreeInfo myInfo =new TreeInfo(myHeight, myDiam);
        return myInfo;
    }
    public static boolean isIdentical(Node root, Node subRoot){
        if(root==null && subRoot == null){
            return true;
        }
        if(root==null || subRoot == null){
            return false;
        }
        if(root.data==subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }
    public static  boolean  subtreeOfAnotherTree(Node root, Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return subtreeOfAnotherTree(root.left,subRoot) || subtreeOfAnotherTree(root.right, subRoot);
    }
    public static void main(String[] args) {
        int nodes1[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree=new BinaryTree();
        Node root= tree.buildTreee(nodes1);
//        System.out.println(root.data);
//        preorder(root);
//        inorder(root);
//        postorder(root);
//        levelOrder(root);
//        System.out.println(countOfNodes(root));
//        System.out.println(sumOfNodes(root));
//        System.out.println(heightATree(root));
//        System.out.println(diameterOfATreeFrist(root));
//        System.out.println(diameterOfATreeSecond(root).diam);
//        int nodes2[]={3,4,5,1,2};
//        Node root2=tree.buildTreee(nodes2);
//        int subNode[]= {4, 1, 2};
//        Node subRoot=tree.buildTreee(subNode);
//        System.out.println(subtreeOfAnotherTree(root2,subRoot));
    }
}
