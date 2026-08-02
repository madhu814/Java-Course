package Inheritance;

class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("CargoPlane is flying at low height");
    }

    public void carryGoods()
    {
        System.out.println("CargoPlane is carrying goods");
    }
}

class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("PassengerPlane is flying at medium height");
    }
    public void carryPassengers()
    {
        System.out.println("PassengerPlane is carrying passengers");
    }
}
public class Inheritance6 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.carryPassengers();
    }

}
