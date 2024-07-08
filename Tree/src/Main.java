import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public  static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode ( int val){
            this.val= val;

        }
    }
    public static int height (TreeNode root){
        if(root== null) return 0;
        return 1 + Math.max(height (root.left),height (root.right));
    }
    public static TreeNode construct_bfs( String[]arr){
        int x= Integer.parseInt(arr[0]);
        TreeNode root= new TreeNode(x);
        Queue<TreeNode>q=new LinkedList<>();
        int n = arr.length;
        q.add(root);
        int i=1;
        while(i<n-1){
            TreeNode temp= q.remove();
            TreeNode l = new TreeNode(0);
            TreeNode r = new TreeNode(0);
            if(arr[i]==""){
                l=null;
            }
            else{
                l.val=Integer.parseInt(arr[i]);
                q.add(l);
            }

            if(arr[i+1]==""){
                r=null;
            }
            else{
                r.val=Integer.parseInt(arr[i+1]);
                q.add(r);
            }
            temp.left=l;
            temp.right=r;

            i+=2;
        }
        return root;

    }
 public static void nth_order_level_Traversal (TreeNode root,int level){
        if(root== null)
            return;
        if(level==1){
            System.out.print(root.val+" ");
            return;
        }
     nth_order_level_Traversal (root.left, level-1);
     nth_order_level_Traversal (root.right,level-1);

 }

    public static void zigzag_order_level_Traversal (TreeNode root,int level){
        if(root== null)
            return;
        if(level==1){
            System.out.print(root.val+" ");
            return;
        }
        zigzag_order_level_Traversal (root.right,level-1);
        zigzag_order_level_Traversal (root.left, level-1);


    }
    public static void Right_view_Binary(TreeNode root, int level,List<Integer> l){
        if(root== null) return ;
        l.set(level-1,root.val);
        Right_view_Binary(root.left, level+1, l);
        Right_view_Binary(root.right, level+1, l);


    }


    public static void Left_view_Binary(TreeNode root, int level,List<Integer> l){
        if(root== null) return ;
        l.set(level-1,root.val);
        Left_view_Binary(root.right, level+1, l);
        Left_view_Binary(root.left, level+1, l);


    }

    public static void main(String[] args) {

        String [] arr = {"1","2","3","4","5","","6","7","","8","9","10","11"};
        TreeNode root= construct_bfs(arr);
        int level = height(root);
        System.out.println(" No. of levels :"+level);


        System.out.print("Level order Traversal in binary Tree");
        for(int i=0;i<=level;i++){
            nth_order_level_Traversal (root,i);
            System.out.println();
        }
        System.out.println();

        System.out.print("ZIG ZAG -Level order Traversal in binary Tree");
        for(int i=0;i<=level;i++){
            if(i%2!=0)
            nth_order_level_Traversal (root,i);
            else{
                zigzag_order_level_Traversal(root,i);
            }
            System.out.println();
        }
        System.out.println();


        System.out.print("Right View of the Binarytree :");
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<level;i++) {
            l.add(0);
        }
        Right_view_Binary(root,1,l);
        System.out.println(l);



        System.out.println();
        System.out.print("Left view of the Binarytree :");
        List<Integer> m= new ArrayList<>();
        for(int i=0;i<level;i++) {
            m.add(0);
        }
        Left_view_Binary(root,1,m);
        System.out.println(m);
    }
}