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
/*In this program,
        we have defined a Person class that has a default constructor, a parameterized constructor,
        and a copy constructor. The class also has getter and setter methods for the name and age fields.

        In the main method, we have demonstrated how to use the default constructor, parameterized constructor,
        and copy constructor to create objects of the Person class. We have created three
        objects - p1, p2, and p3 - using each of the constructors and printed out their name and age fields
    using the getter methods

    Here, p1 is created using the default constructor, which initializes the name field to
     an empty string and the age field to 0. p2 is created using the parameterized constructor, which initializes the
      name field to "John" and the age field to 25.
     p3 is created using the copy constructor, which initializes its fields with the same values as the fields of p2.
    */
