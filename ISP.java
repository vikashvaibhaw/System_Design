//violating ISP

// interface Uber{
//     void bookRide();
//     void acceptRide();
//     void drive();
//     void endRide();
//     void payRide();
// }

// class Rider implements Uber{

// }

interface RiderInterface{
    void bookRide();
    void payRide();
}

interface DriverInterface{
    void acceptRide();
    void drive();
    void endRide();
}

class Rider implements RiderInterface{
    public void bookRide(){

    }
    public void payRide(){

    }
}

class Driver implements DriverInterface{
    public void acceptRide(){

    }
    public void drive(){

    }
    public void endRide(){

    }
}

public class ISP {
    public static void main(String[] args) {
        
    }
}
