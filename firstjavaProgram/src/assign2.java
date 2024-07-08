import java.util.Scanner;
public class assign2 {
    public static void main(String[] args){
        // creating scanner to taking user inputs
        // QN.1
        Scanner m = new Scanner(System.in);
       /* System.out.print("Enter the your inputs :\n");
        System.out.print("Enter the your first name :\n");
        String first_name =m.next();
        System.out.print("Enter the your last number :\n");
        String Last_name =m.next();
        System.out.print("Enter the your integer :\n");
        int num1 = m.nextInt();
        System.out.print("Enter the your FIELD Of interest :\n");
        String field = m.next();
        System.out.print("\nEnter the your first name :\n"+(first_name + Last_name)+"\n");
        System.out.print("Enter the your  roll no.:\n"+num1);
        System.out.print("\nEnter the your field name :"+field+"\n");*/
        //QN.3 I AM Doing the 3 rd qn because 2nd qn. is easy
       /*System.out.print("ROBERT marks in the following subjects\n");
        System.out.print("ROBERT marks in MATHS\n");
        float maths = m.nextFloat();
        System.out.print("\nROBERT marks in ENGLISH\n");
        float eng = m.nextFloat();
        System.out.print("\nROBERT marks in COMPUTER SCIENCE\n");
        float cse = m.nextFloat();
        System.out.print("\n");
         float tot = (maths + eng +cse);
        float per = ((tot/300)*100);
        System.out.print("Robert total  marks "+ (tot+("/300"))+("\n"));
        System.out.print("Robert total  percentage "+ (per+("/100"))+("\n"));*/
        // interger type inputs

       /*System.out.print("ROBERT marks in the following subjects\n");
        System.out.print("ROBERT marks in MATHS\n");
        int maths = m.nextInt();
        System.out.print("\nROBERT marks in ENGLISH\n");
        int eng = m.nextInt();
        System.out.print("\nROBERT marks in COMPUTER SCIENCE\n");
        int cse =m.nextInt();
        System.out.print("\n");
        int tot = (maths + eng +cse);
        int per = ((tot)/3);
        System.out.print("Robert total  marks "+ (tot+("/300"))+("\n"));
        System.out.print("Robert total  percentage "+ (per+("/100"))+("\n"));*/

// qn.4
        // we are here taking user inputs for add two numbers
       /* System.out.printf("hello world\n");
        System.out.printf("Enter the number you want to add \n");
        int t = m.nextInt();
        int r =0;
        int j=0;
        int i=0;
        for( i=0; i<t;i++){
            r = m.nextInt();
            j = m.nextInt();
            System.out.printf("Added numbers are : \n" + (r+j) + ("\n"));
        }*/
        // qn.5
        System.out.printf("Enter the no. strings you want  \n");
        int q = m.nextInt();

        for(int  i=0; i<q;i++){
            System.out.printf("Enter the  strings :  \n");
            String k = m.next();
            String l = m.next();
            System.out.printf("concatenated string is  : \n" + (k+l) + ("\n"));


        }


    }
}
