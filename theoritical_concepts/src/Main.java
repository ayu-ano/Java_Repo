//// Abstract superclass
//class Animal {
//    // Common behavior
//    void eat() {
//        // Implementation specific to each subclass
//    }
//
//    // Abstract behavior
//    void makeSound() {
//        // To be implemented by each subclass
//    }
//}
//
//// Concrete subclass
//class Dog extends Animal {
//    // Implementation of makeSound() specific to Dog
//    void makeSound() {
//        System.out.println("Woof!");
//    }
//}
//
//// Concrete subclass
//class Cat extends Animal {
//    // Implementation of makeSound() specific to Cat
//    void makeSound() {
//        System.out.println("Meow!");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.makeSound(); // Output: Woof!
//
//        Animal cat = new Cat();
//        cat.makeSound(); // Output: Meow!
//    }
//}


//// Abstraction: Employee is an abstract representation of a real-life employee
//abstract class Employee {
//    private String name;
//    private int age;
//    private String designation;
//
//    public Employee(String name, int age, String designation) {
//        this.name = name;
//        this.age = age;
//        this.designation = designation;
//    }
//
//    // Encapsulation: Getters and setters to access and modify private fields
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    // Abstract method representing a behavior that needs to be implemented by subclasses
//    public abstract void work();
//
//    // Polymorphism: Override the toString() method to provide custom string representation
//    @Override
//    public String toString() {
//        return "Name: " + name + ", Age: " + age + ", Designation: " + designation;
//    }
//}
//
//// Inheritance: Subclass that extends the abstract Employee class
//class Manager extends Employee {
//    private String department;
//
//    public Manager(String name, int age, String designation, String department) {
//        super(name, age, designation);
//        this.department = department;
//    }
//
//    // Implementation of the abstract work() method
//    @Override
//    public void work() {
//        System.out.println(getDesignation() + " is managing the " + department + " department.");
//    }
//}
//
//// Inheritance: Another subclass that extends the abstract Employee class
//class Developer extends Employee {
//    private String programmingLanguage;
//
//    public Developer(String name, int age, String designation, String programmingLanguage) {
//        super(name, age, designation);
//        this.programmingLanguage = programmingLanguage;
//    }
//
//    // Implementation of the abstract work() method
//    @Override
//    public void work() {
//        System.out.println(getDesignation() + " is coding in " + programmingLanguage + ".");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Creating instances of the subclasses
//        Employee manager = new Manager("John Doe", 40, "Manager", "Sales");
//        Employee developer = new Developer("Jane Smith", 28, "Developer", "Java");
//
//        // Polymorphism: Invoking the work() method of different objects
//        manager.work(); // Output: Manager is managing the Sales department.
//        developer.work(); // Output: Developer is coding in Java.
//
//        // Accessing the fields using getters
//        System.out.println(manager.getName()); // Output: John Doe
//        System.out.println(developer.getAge()); // Output: 28
//
//        // Modifying fields using setters
//        manager.setDesignation("Senior Manager");
//        developer.setName("Jane Brown");
//
//        // Polymorphism: Using overridden toString() method
//        System.out.println(manager); // Output: Name: John Doe, Age: 40, Designation: Senior Manager
//        System.out.println(developer); // Output: Name: Jane Brown, Age: 28, Designation: Developer
//    }
//}


//// Abstraction: Abstract representation of a task
//abstract class Task {
//    private String title;
//    private String description;
//
//    public Task(String title, String description) {
//        this.title = title;
//        this.description = description;
//    }
//
//    // Encapsulation: Getters and setters to access and modify private fields
//    public String getTitle() {
//        return title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    // Abstract method representing a behavior that needs to be implemented by subclasses
//    public abstract void complete();
//
//    // Polymorphism: Override the toString() method to provide custom string representation
//    @Override
//    public String toString() {
//        return "Title: " + title + ", Description: " + description;
//    }
//}
//
//// Inheritance: Subclass that extends the abstract Task class
//class PersonalTask extends Task {
//    private String dueDate;
//
//    public PersonalTask(String title, String description, String dueDate) {
//        super(title, description);
//        this.dueDate = dueDate;
//    }
//
//    // Implementation of the abstract complete() method
//    @Override
//    public void complete() {
//        System.out.println(getTitle() + " is completed for personal task.");
//    }
//}
//
//// Inheritance: Another subclass that extends the abstract Task class
//class WorkTask extends Task {
//    private String project;
//
//    public WorkTask(String title, String description, String project) {
//        super(title, description);
//        this.project = project;
//    }
//
//    // Implementation of the abstract complete() method
//    @Override
//    public void complete() {
//        System.out.println(getTitle() + " is completed for the " + project + " project.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Creating instances of the subclasses
//        Task personalTask = new PersonalTask("Grocery Shopping", "Buy milk and eggs", "Today");
//        Task workTask = new WorkTask("Design Proposal", "Prepare a design proposal", "ABC Corp");
//
//        // Polymorphism: Invoking the complete() method of different objects
//        personalTask.complete(); // Output: Grocery Shopping is completed for personal task.
//        workTask.complete(); // Output: Design Proposal is completed for the ABC Corp project.
//
//        // Accessing the fields using getters
//        System.out.println(personalTask.getTitle()); // Output: Grocery Shopping
//        System.out.println(workTask.getDescription()); // Output: Prepare a design proposal
//
//        // Modifying fields using setters
//        personalTask.setTitle("House Cleaning");
//        workTask.setDescription("Review project specifications");
//
//        // Polymorphism: Using overridden toString() method
//        System.out.println(personalTask); // Output: Title: House Cleaning, Description: Buy milk and eggs
//        System.out.println(workTask); // Output: Title: Design Proposal, Description: Review project specifications
//    }
//}

interface ExtracurricularActivities {
    void participate();
}
// Abstraction: Abstract representation of a student
abstract class Student {
    public String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation: Getters and setters to access and modify private fields
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

    // Abstract method representing a behavior that needs to be implemented by subclasses
    public abstract void study();
}

// Inheritance: Subclass that extends the abstract Student class
class HighSchoolStudent extends Student implements ExtracurricularActivities{
    private int gradeLevel;

    public HighSchoolStudent(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    // Implementation of the abstract study() method
    @Override
    public void study() {
        System.out.println(getName() + " is studying for high school exams.");
    }

    @Override
    public void participate() {
        System.out.println(getName()+ " is participating in the school band.");
    }
}

// Inheritance: Another subclass that extends the abstract Student class
class CollegeStudent extends Student implements ExtracurricularActivities {
    private String major;

    public CollegeStudent(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Implementation of the abstract study() method
    @Override
    public void study() {
        System.out.println(getName() + " is studying " + major + " in college.");
    }
    @Override
    public void participate() {
        System.out.println(getName() + " is participating in the school band.");
    }
}

// Polymorphism: Interface representing a student's extracurricular activities


// Polymorphism: Implementing the ExtracurricularActivities interface in a class

public class Main {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Student highSchoolStudent = new HighSchoolStudent("John Doe", 16, 10);
        Student collegeStudent = new CollegeStudent("Jane Smith", 20, "Computer Science");

        // Polymorphism: Invoking the study() method of different objects
        highSchoolStudent.study(); // Output: John Doe is studying for high school exams.
        collegeStudent.study(); // Output: Jane Smith is studying Computer Science in college.

        // Accessing the fields using getters
        System.out.println(highSchoolStudent.getName()); // Output: John Doe
        System.out.println(collegeStudent.getAge()); // Output: 20

        // Modifying fields using setters
        highSchoolStudent.setName("John Brown");
        collegeStudent.setAge(21);

        // Polymorphism: Using the ExtracurricularActivities interface
        ExtracurricularActivities activities1 = new HighSchoolStudent("Alice",8,9);
        activities1.participate(); // Output: Alice is participating in the school band.

        ExtracurricularActivities activities2 = new CollegeStudent("Bob",9,"po");
        activities2.participate(); // Output: Bob is participating in extracurricular activities.

    }
}


