interface Logistics{
    void send();
}

class Road implements Logistics{
    public void send(){
        System.out.println("sending by a road logic");
    }
}

class Air implements Logistics{
    public void send(){
        System.out.println("sending by a Air logic");
    }
}

class Train implements Logistics{
    public void send(){
        System.out.println("sending by a Train logic");
    }
}

class LogisticsFactory{
    public static Logistics getLogistics(String mode){
        if(mode=="Air") return new Air();
        else if(mode=="Train") return new Train();
        else return new Road();  
    }
    
}

class LogisticsService{
    public void send(String mode){
        Logistics logistics=LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}



public class Factory {
    public static void main(String[] args) {
        Logistics way=LogisticsFactory.getLogistics("Air");
        Logistics way2=LogisticsFactory.getLogistics("train");
        way.send();
        way2.send();
    }
}
