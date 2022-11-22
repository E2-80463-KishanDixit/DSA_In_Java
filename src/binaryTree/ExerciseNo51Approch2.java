package binaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ExerciseNo51Approch2 {

    static class Node {
        public int key;
        public Node left, right;
        public Node(int k){
            key = k;
        }
    }

    static ArrayList<Integer> printKthLevel(Node root, int k){
        Queue<Node> que = new LinkedList<>();

        que.add(root);

        ArrayList<Integer> s = new ArrayList<>();

        int level = 0;
        int flag = 0;

        while (!que.isEmpty()) {
            int size = que.size();

            while (size > 0) {
                size--;
                Node ptr = que.poll();
                if (level == k) {
                    flag = 1;
                    s.add(ptr.key);
                }
                else {
                    if (ptr.left != null)
                        que.add(ptr.left);
                    if (ptr.right != null)
                        que.add(ptr.right);
                }
            }

            level++;
            if (flag == 1)
                break;
        }
        return s;
    }

    public static void main(String[] args){
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        one.left = two;
        one.right = three;
        two.right = five;
        two.left = four;

        System.out.print(printKthLevel(one, 2));
    }
}
