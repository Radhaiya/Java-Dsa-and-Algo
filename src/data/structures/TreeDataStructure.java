package data.structures;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDataStructure {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void PreOrder(Node root){
        if(root==null){
            System.out.print("-1 , ");
            return;
        }
        System.out.print(root.data+" , ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void InOrder(Node root){
        if(root == null){
            System.out.print("-1, ");
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+", ");
        InOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            System.out.print("-1, ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+",");
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //Count of Nodes
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int righNodes = countofNodes(root.right);

        return leftNodes+righNodes +1;
    }

    //Sum of all elements in tree
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //Height of Tree
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight =heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int height = Math.max(leftHeight,rightHeight) +1 ;

        return height;
    }


    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree1 = new BinaryTree();
        Node root = tree1.buildTree(nodes);
       // System.out.println(root.data);
        //PreOrder(root);
        //InOrder(root);
        //postOrder(root);
        //levelOrder(root);
        //System.out.println(countofNodes(root));
       // System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
    }
}
