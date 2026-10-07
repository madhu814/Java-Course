interface Car
{
    void drive(int avg, int ts);
}

// class WagonR implements Car
// {
//     public void drive()
//     {
//         System.out.println("Driving ...");
//     }
// }
public class AICDemo {
    public static void main(String[] args) {
        //we need to shorten the code, so we can use anonymous class to implement the interface and create an object of the interface at the same time.
       // Car car = new Car() {    //interface ka object nhi ban sakta kioki uska implementation nhi hai, isliye humne anonymous class ka use kiya hai.
           // @Override
            // public void drive() {
               // System.out.println("Driving ...");
           // }
       // };

       //Lambda expression is a short form of anonymous class, so we can use lambda expression to implement the interface and create an object of the interface at the same time.
       Car obj = (avg, ts) ->  System.out.println("Driving with average speed: " + avg + " and maximum speed: " + ts);
        obj.drive(16, 20);
    }
}
