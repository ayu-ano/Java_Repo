
    class nameandage // this is the main class or parent class
    {
        String name;
        int age;
        public nameandage(String s,int a)
        {
            this.name=s;
            this.age=a;
        }
        void printfun1()
        {
            System.out.println("NAME: "+name);
            System.out.println("AGE: "+age);
        }

    }

    class collegeandyear extends nameandage// this is the subclass or child class
    {
        // this class inherits the properties of the main class and also has its own properties
        String college;
        int year;
        public collegeandyear(String n,int y,String c,int a)
        {
            super(n,a);
            this.college=c;
            this.year=y;
        }


    }
    class encapsuleclass
    {
        private String food;
        private String movie;

        public void setvar(String s1,String s2)
        {
            food=s1;//the private components of the class can only be accessed by the other members of the same class
            movie=s2;
        }
        public void printfun1()
        {

            System.out.println("FAVOURITE FOOD: "+food);
            System.out.println("FAVOURITE MOVIE: "+movie);
        }
    }
    class poly
    {
        //this class contains two methods with the same name but with different parameters
        int area(int s)
        {
            return s*s;
        }
        int area(int l,int b)
        {
            return l*b;
        }
    }
    abstract class abst
    {
        int value;
        abstract void name();
        public  abst(int val)
        {
            this.value=val;
        }
        void pri()
        {
            System.out.println("YEAR: "+value);
        }
    }
    class childc extends abst
    {
        String name;
        public childc(int v,String s1)
        {
            super(v);
            this.name=s1;
        }
        void name()
        {
            System.out.println("NAME OF COLLEGE: "+     this.name);
            super.pri();//method of the child class can call the methods of the super class
        }

    }

    public class java {
        static void inheritance()
        {
            collegeandyear ob=new collegeandyear("KRISHNENDU",2,"IIIT KALYANI",20);
            //the same object of the child class can be used to access the properties of both the parent class and child class
            System.out.println("NAME: "+ob.name);
            System.out.println("AGE: "+ob.age);
            System.out.println("COLLEGE NAME: "+ob.college);
            System.out.println("YEAR: "+ob.year);

        }
        static void encap()//this method is used to demonstrate encapsulation
        {

            encapsuleclass obj1=new encapsuleclass();
            encapsuleclass obj2=new encapsuleclass();

            obj1.setvar("PANEER TIKKA","3 IDIOTS");
            obj2.setvar("ROSOGULLA","OMKARA");

            //two objects of the same class are created
            obj1.printfun1();
            obj2.printfun1();
            System.out.println("********************");
            obj1.setvar("CHICKEN TIKKA","YOUR NAME");//change in one of the objects will not affect the other object

            obj1.printfun1();
            obj2.printfun1();
        }

        static void polymorph()//this method is used to show polymorphism
        {
            poly obj=new poly();
            System.out.println("square area: "+obj.area(4));//"area" function is called where a single paramter is passed
            System.out.println("rectangle area: "+obj.area(4,8));//"area" function is called where two paramters are passed
            //the function behaves differently depending on the number of parameters passed
            System.out.println("sum: "+(5+6));;//the first "+" connects the two strings while the second "+" adds the two integers


        }
        static void abstraction()
        {
            childc obj=new childc(2014,"IIIT KALYANI");
            obj.name();
        }
        static void gap()
        {
            System.out.println("********************");
            System.out.println("*********************");

        }

        public static void Java(String args[])
        {
            // System.out.println("hello World!");
            inheritance();
            gap();
            encap();
            gap();
            polymorph();
            gap();
            abstraction();
        }

    }



