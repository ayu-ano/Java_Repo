public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Main method
    public static void main(String[] args) {
        // Using default constructor
        Person p1 = new Person();
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());

        // Using parameterized constructor
        Person p2 = new Person("John", 25);
        System.out.println("Name: " + p2.getName() + ", Age: " + p2.getAge());

        // Using copy constructor
        Person p3 = new Person(p2);
        System.out.println("Name: " + p3.getName() + ", Age: " + p3.getAge());
    }
}

