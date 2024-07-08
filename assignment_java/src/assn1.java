interface Diet {
    void eat_less();
    void gain_weight();
}

interface Gym {
    void exercise();
    void weighlift();
}

abstract class Human implements Diet, Gym {
    private String name;

    public Human(String name) {
        this.name = name;
    }
}
//class perfect_life extends Human{
//
//}

abstract class Language {
    abstract void mother_language();
}

class Ak extends Language {
    public void mother_language() {
        System.out.println("my mother language is Hindi");
    }

    public void other() {
        System.out.println("I also know the English language");
    }
}

class Vehicle {
    void drive() {
        System.out.println("Let's start your journey:");
    }

    void stop() {
        System.out.println("Do apply the brakes to stop this vehicle:");
    }
}

class Bugatti extends Vehicle {
    private int us$_price;

    Bugatti(int us$_price) {
        this.us$_price = us$_price;
    }

    public int getprice() {
        return us$_price;
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("Run the Bugatti fast bro");
    }
}

class R15 extends Vehicle {
    private int us$_price;

    R15(int us$_price) {
        this.us$_price = us$_price;
    }

    public int getprice() {
        return us$_price;
    }

    @Override
    void stop() {
        super.stop();
        System.out.println("Stop the R15");
    }
}

class Bicycle {
    private String name;
    private int year;

    Bicycle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

class Car {
    private int number;
    private String name;
    private int year;

    Car(int number, String name, int year) {
        this.number = number;
        this.name = name;
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

public class assn1 {
    public static void main(String[] args) {
        System.out.println("Values in Car class encapsulation:");
        Car car = new Car(2345, "CHEVROLET", 2015);
        System.out.printf("%s\t:", car.getName());
        System.out.printf("%d\t :", car.getYear());
        System.out.printf("%d \t:", car.getNumber());
        System.out.println();
        System.out.println("Values in Bicycle class encapsulation:");
        Bicycle b1 = new Bicycle("Hercules", 2019);
        System.out.printf("%s\t:", b1.getName());
        System.out.printf("%d \t:", b1.getYear());
        System.out.println();
        System.out.println("Values in Bugatti class :");
        Bugatti b2 = new Bugatti(3000000);
        System.out.println("Price of Bugatti: " + b2.getprice());
        b2.drive();
        System.out.println();
        System.out.println("Values in R15 class ");
        R15 r1 = new R15(100000);
        System.out.println("Price of R15: " + r1.getprice());
        r1.stop();
        System.out.println();
        System.out.println("Values in Ak class abstraction :");
        Ak a1 = new Ak();
        a1.mother_language();
        a1.other();
        System.out.println();
        System.out.println("Using polymorphism :");
        //vehicle v = new vehicle();
        Vehicle [] v1 =new Vehicle[2];
        v1[0]=new R15(256745);
        v1[1]=new Bugatti(256745);
        for(Vehicle v :v1) {
            v.stop();
            v.drive();
        }
    }
}
