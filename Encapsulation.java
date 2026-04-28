// Base class (Encapsulation)
class Person {
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class (Inheritance)
class Student extends Person {
    private int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age); // calling parent constructor
        this.rollNo = rollNo;
    }

    // Method overriding (Polymorphism)
    @Override
    public void display() {
        System.out.println("Student Name: " + getName() + 
                           ", Age: " + getAge() + 
                           ", Roll No: " + rollNo);
    }
}

// Main class
public class OOPExample {
    public static void main(String[] args) {
        Person p = new Person("Amit", 30);
        p.display();

        Student s = new Student("Rahul", 20, 101);
        s.display();
    }
}
