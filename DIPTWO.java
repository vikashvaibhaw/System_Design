//Payment System 
//Without DIP

// class PaymentService{
//     Razorpay razorpay=new RazorPay();
//     void pay(){
//         razorpay.process();
//     }
// }

//problem in this case(without dip)
  //Razorpay down--system fails
  //cannot add paytm/stripe easily
  //violates open-closed principle

//With DIP

interface PaymentGateway{
    void process();
}

class RazorPay implements PaymentGateway{
    public void process(){
        // razorpay logic
    }
}

class Stripe implements PaymentGateway{
    public void process(){
        //stripe logic
    }
}

//payment service class
public class DIPTWO {
    PaymentGateway gateway;
    DIPTWO(PaymentGateway gateway){
        this.gateway=gateway;
    }
    void pay(){
        gateway.process();
    }
}

//with dip---production benefits
//switch gateway at runtime
//A/B testing payment providers
//clean Microwave architecture

