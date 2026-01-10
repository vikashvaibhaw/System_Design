class Notification{
   public void sendNotification(){
      System.out.println("email send");
   }
}

class TextNotification extends Notification{
    @Override
    public void sendNotification(){ 
        System.out.println("text");
    }
}

class whatsappNotification extends Notification{
    @Override
    public void sendNotification(){
        System.out.println("wp");
    }
}

public class Liskov{
    public static void main(String[] args) {
        Notification notification=new TextNotification();
        notification.sendNotification();
        Notification wpNotification=new whatsappNotification();
        wpNotification.sendNotification();
    }
}


