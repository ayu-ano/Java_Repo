
 class Student {
    private String name;
    private int roll_no;
    private double percentage;

    // creating  a default constructor
    public Student() {
        name = "Ayush kumar";
        roll_no = 683;
        percentage = 85.50;
    }

    // creating parameterised constructor
    public Student(String name, int roll_no, double percentage) {
        this.name = name;
        this.roll_no = roll_no;
        this.percentage = percentage;

    }

    // Creating a copied constructor
    public Student(Student copy_data) {
        this.name = copy_data.name;
        this.roll_no = copy_data.roll_no;
        this.percentage = copy_data.percentage;
    }
    //creating a getter method in java

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public double getPercentage() {
        return percentage;
    }

    // creating a setter method

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    void daily() {
        System.out.println("Every day  I go to the college");
    }
}
    // creating a child or sub_class inherit from the student
    class Qualified_Exam extends Student{
        private int marks;
        // creating parameterised constructor in the Student
        public Qualified_Exam(String name,int rollno,double percentage,int marks){
            super(name,rollno,percentage);
            this.marks=marks;

        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        void daily() {

            System.out.println("After qualifing the exam i enjoyed a lot");
        }
    }
    public class assn2{
    //crearting the main class to print all values.
    public static void main(String[] args) {
        // using a default constructor
        System.out.println(" printing Default constructor");
        Student s1= new Student();
        System.out.println("Name :" +s1.getName());
        System.out.println("Roll_no. :" +s1.getRoll_no());
        System.out.println("Percentage :" +s1.getPercentage());
        s1.setPercentage(90.8);
        System.out.println();
        System.out.println("updated Percentage of the student :" +s1.getPercentage());
        s1.daily();
        System.out.println();
        System.out.println("**************************************************************");
        // printing the  parameterised constructor
        System.out.println(" printing parameterised constructor");
        Student s2= new Student("dileep kumar",683,90.8);
        System.out.println("Name :" +s2.getName());
        System.out.println("Roll_no. :" +s2.getRoll_no());
        System.out.println("Percentage :" +s2.getPercentage());
        System.out.println();
        s2.setName("Rahul");
        System.out.println("Updated name:"+s2.getName());
        s2.setRoll_no(234);
        System.out.println("Updated roll_no.:"+s2.getRoll_no());
        s2.setPercentage(67.9);
        System.out.println("updated Percentage of the student :" +s1.getPercentage());
        s2.daily();
        System.out.println();

        System.out.println("**************************************************************");
        System.out.println(" printing Copied constructor");
        Student s3=new Student(s2);
        System.out.println("Name :" +s3.getName());
        System.out.println("Roll_no. :" +s3.getRoll_no());
        System.out.println("Percentage :" +s3.getPercentage());
        s3.daily();
        System.out.println();
        System.out.println("**************************************************************");
        // creating a object for the child class
        System.out.println(" Printing the SUBCLASS :");
        Qualified_Exam qe= new Qualified_Exam("Vishwajeet",678,98.8,900);
        System.out.println("Name :" +qe.getName());
        System.out.println("Roll_no. :" +qe.getRoll_no());
        System.out.println("Percentage :" +qe.getPercentage());
        System.out.println("Marks :" +qe.getMarks());
        System.out.println("overided method :");
        qe.daily();
        System.out.println();
    }
}

