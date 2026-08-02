class Student 
{
    private int age;
    private String name;
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void show()
{
    System.out.println(name + " " +age);
}
}
public class Demo {
    public static void main(String[] args)
    {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(18);
        obj.setName("Rahul");
        obj1.setAge(18);
        obj1.setName("Rahul");
        obj.show();
        int stud1Age = obj.getAge();
        System.out.print(stud1Age);
    }
}

