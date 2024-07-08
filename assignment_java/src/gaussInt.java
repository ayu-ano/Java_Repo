class myInt {
    //Instance variable
    private int n;
    //Constructor
    public myInt(int n){
        this.n = n;
    }
    //Instance methods
    public int getVal(){
        return n;
    }
    public void increment(int n){
        this.n += n;
    }
    public myInt add(myInt N){
        return new myInt(this.n + N.getVal());
    }
    public void show(){
        System.out.println(n);
    }
}

class gaussInt extends myInt {
    //Instance variable
    private int m; //Represents the imaginary part
    /* We do not need the real part that is already present because we
    have inherited all the data and methods of myInt. Thus the
    private int n is also present in every instance of a gaussInt. */
//Constructor
    public gaussInt(int x, int y){
        super(x); //Special keyword
        this.m = y;
    }
    //Instance methods
//This method is overridden from the superclass
    public void show(){
        System.out.println(
                "realPart is: " + this.getVal() +" imaginaryPart is: " + m);
    }
    public int realPart(){
        return getVal();
    }
    /*The method getVal is defined in the superclass. It is not defined
    here but it is inherited by this class so we can use it. */
    public int imaginaryPart(){
        return m;
    }
    //This is an overloaded method
    public gaussInt add(gaussInt z){
        return new gaussInt(z.realPart() + realPart(),
                z.imaginaryPart() + imaginaryPart());
    }
    public static void main(String[] args){
        gaussInt kreimhilde = new gaussInt(3,4);
        kreimhilde.show();
        kreimhilde.increment(2);
        kreimhilde.show();
    }
}//class gaussInt
/*The add() method in the gaussInt class and the myInt class are instance methods that take an object of the same
 type (gaussInt and myInt, respectively) as an argument and return a new object of the same type
 (gaussInt and myInt, respectively) with the sum of the instance variables.

These methods are called "instance methods" because they are defined within the class and operate on the instance variables
of the class. In other words, they are methods that belong to an instance of the class, rather than to the class itself.

The add() method in the gaussInt class is an example of method overriding, where the method with the same signature in
the superclass (myInt) is overridden to provide a different implementation in the subclass (gaussInt).
The method in the gaussInt class takes an object of type gaussInt as an argument and returns a new object of type gaussInt
with the sum of the real and imaginary parts of the two gaussInt objects. The method in the myInt class takes an object
of type myInt as an argument and returns a new object of type myInt with the sum of the instance variables of the two myInt
 objects.



*/
