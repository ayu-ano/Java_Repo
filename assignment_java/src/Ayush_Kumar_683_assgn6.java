
interface  I1{
    public String toString();
        }
class Base{
    public Base(){
        System.out.print("Base");

    }
    public Base(String s){
        System.out.println("Base"+s);
    }
}
class Derived  extends Base{
    public Derived (String s){
        super();
       // super(s);

        System.out.println("Derived");
    }
}
public class Ayush_Kumar_683_assgn6 implements Runnable {
    int x=10;
    public void run(){
        System.out.printf("%d",3);
    }
    public static void main(String[] args) {
        // 2nd qn.  from the qn.paper
        Base b= new Derived ("Hello");

        // 4 qn.b from the qn.paper
        // these all the wrapper class of integer datatype
        Integer num1=100;
        Integer num2 =100;
        Integer num3=500;
        Integer num4=500;
        // variables are respectively objects of the wrapper classes.
        if(num1==num2){
            System.out.println("num1==num2");
        }
        else {
            System.out.println("num1!=num2");
        }
      if(num3==num4){
          System.out.println("num3==num4");
      }
      else{
          System.out.println("num3!=num4");
      }
        System.out.println();
        // 4 qn.c from the qn.paper
        System.out.println(new I1(){
               public String toString(){   // there is an error in this block of code because it has  default
                   // access modifier due tro that it shows an error to fix that code use public
                    System.out.print("Example");
                    return ("A");}
        });

      // qn.4 .d
        System.out.println();
        System.out.println("4d");
        Ayush_Kumar_683_assgn6 m= new Ayush_Kumar_683_assgn6();
        System.out.println(m.x);


        // qn.4.e
        System.out.println();
        System.out.println("qn.4.e");

    }

//    static{
//        System.out.println("qn 4d part 2:" );
//        System.out.println(x +"");
//    }


}
