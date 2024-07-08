package Javalink_list;

import java.util.Scanner;

public class link_list {
    public static class link {
        int data;
        link next;

        link(int data) {
            this.data = data;
        }
//          link head = null;
//          link tail = null;
//
//        public  void addNode(int x) {
//
//            link temp = new link(x);
//            if (head == null) {
//                head = temp;
//            } else {
//                tail.next = temp;
//            }
//            tail = temp;
//
//        }

//        public  void printNode() {
//            link temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//        }
      static link head = null;
       static link tail = null;

        public  static void addNode1(int x) {

            link temp = new link(x);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;

        }
        public  static void printNode1() {
            link temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
               // System.out.println();
                temp = temp.next;
            }
        }
        public static void printNode(link head) {
            link temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
               // System.out.println();
                temp = temp.next;
            }
        }
        public static int getTheNodeBegin(int pos){
            link temp=head;
            for(int i=1;i<=pos;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        public static int getTheNodeEnd(int pos){
            link slow=head;
            link fast= head;
            for(int i=1;i<=pos;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;
        }
        public static void removeNthNodeFromEnd(int index){
            link slow=head;
            link fast =head;
            for(int i=1;i<=index+1;i++){
                fast = fast.next;

            }
            if(fast==null){
                slow.next=slow.next.next;
                return;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
                if(fast==null){
                    slow.next=slow.next.next;

                }
            }
        }


        public static void main(String[] args) {
          //  link l= new link(0);
            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the no. of nodes you want print :");
//            int w = sc.nextInt();
//            System.out.println("Enter the list :");
//            for (int i = 0; i < w; i++) {
//                int h = sc.nextInt();
//
//               // l.addNode(h);
//                addNode1(h);
//
//            }
            // hardcode method of linked list
//            link a=new link(5);
//            link b=new link(7);
//            link c=new link(8);
//            link d=new link(88);
//            link e=new link(9);
//            link f=new link(10);
//            a.next=b;
//            b.next=c;
//            c.next=d;
//            d.next=e;
//            e.next=f;
//            System.out.println(" printing the linked list using static and parameter");
//     printNode(head);
//            System.out.println();
//            System.out.println(" printing the linked list using static and without parameter");
//            printNode1();
//            System.out.println();
           // System.out.println(" printing the linked list using object of the linked list ");
   // l.printNode();
            int ch;
            do{
                System.out.println("****************************************************************************");
                System.out.println("Select the option for the various opeartion :");
                System.out.println("1. Add the nodes in linked list");
                System.out.println("2. Delete the node from the end of the list");
                System.out.println("3. Get node from the beginning");
                System.out.println("4. Get node from the end ");
                System.out.println("5. Print the list :");

                System.out.println("*****************************************************************************");
            System.out.println("Choose the opeartion according to your conveinous :");
            ch= sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter the no. of nodes you want print :");
                        int a = sc.nextInt();
                        System.out.println("Enter the list :");
                        for (int i = 0; i < a; i++) {
                            int h = sc.nextInt();

                            // l.addNode(h);
                            addNode1(h);


                        }
                        break;


                    case 2:
                        System.out.println("Enter the position from the end to delete the node :");
                        int d = sc.nextInt();
                        removeNthNodeFromEnd(d);
                        System.out.println("after removal of index :");
                        System.out.println();
                        printNode(head);
                        System.out.println();
                        break;


                    case 3:
                        System.out.println("Enter the position from the begin to  the node :");
                        int e = sc.nextInt();
                        System.out.println("get from the begin node");
                        System.out.println(getTheNodeBegin(e));
                        System.out.println();
                        break;


                    case 4:
                        System.out.println("Enter the position from the end  the node :");
                        int f = sc.nextInt();
                        System.out.println("get the  node from the end");

                        System.out.println(getTheNodeEnd(f));
                        System.out.println();
                        break;


                    case 5:
                        System.out.println();
                        System.out.println("Updated list is :");
                        System.out.println();
                        printNode(head);
                        System.out.println();
                        break;

                    default:
                        System.out.println("Thank you to using this system :");
                        break;


                }
                } while(ch!=6);
            }

        }
    }



// Note one thing that all the comment method are access by the objects of linked list.