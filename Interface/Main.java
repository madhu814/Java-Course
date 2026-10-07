interface Computer 
{
    void compileCode();
    void config();
}
class Laptop implements Computer
{
    public void config()
    {
        System.out.println("Configuring laptop");
    }

    public void compileCode()
    {
        System.out.println("Compiling code");
    }
}

class Desktop implements Computer
{
    public void config()
    {
       System.out.println("Configuring desktop");
    }

     public void compileCode()
     {
        System.out.println("Compiling code on desktop");        
     }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(); // Creating an instance of the Laptop class
        Desktop dev = new Desktop(); // Creating an instance of the Desktop class
        laptop.config(); // Calling the config method on the Laptop instance
        laptop.compileCode(); // Calling the compileCode method on the Laptop instance
        dev.compileCode(); // Calling the compileCode method on the Desktop instance
    }
}
