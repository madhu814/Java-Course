package Constructor;

class Student1
{      //extends Object class
    private String name;
    private int age;
    
    public Student1() {
        this( "Madhu",  20);
        System.out.println("Zero parameter constructor");
        name="Madhu";
        age=20;
    }

    public Student1(String name) {
        this(); // use of this() to call zero parameter constructor
        this.name = name;  //here use of this keyword to refer current class instance variable
        age =19;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Launch {
    public static void main(String[] args) {
        Student1 s1 = new Student1();  //Zero parameter constructor
        s1.disp();
            //by default contructor will be called when we create an object of the class, and it is non parameterized constructor.
        Student1 s2 = new Student1("Ravi");  //One parameter constructor
        s2.disp();

        //Constructor overloading is a technique in Java in which a class can have more than one constructor that differ in parameter list. It is similar to method overloading. The compiler differentiates these constructors by the number of parameters in the list and their types.+
    }
}
