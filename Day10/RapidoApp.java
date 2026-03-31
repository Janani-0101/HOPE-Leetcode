import java.util.*;
class Ride{
    String name;
    String pickup;
    String drop;
    List<String> stop;
    double fare;
    String status;

    Ride(String name,String pickup,String drop){
        this.name = name;
        this.pickup = pickup;
        this.drop = drop;
        this.stop = new ArrayList<>();
        this.fare = calc();
        this.status = "BOOKED";
    }
    Ride(String name,String pickup,String drop,List<String> stop){
        this.name = name;
        this.pickup = pickup;
        this.drop = drop;
        this.stop = stop;
        this.fare = calc();
        this.status = "BOOKED";
    }
    double calc(){
        return 50+(stop.size()*50);
    }
    void showdetails(){
        System.out.println("\nCustomer : "+this.name+"\nRoute :-");
        System.out.print(this.pickup);
        for(String s:stop){
            System.out.print(" --> "+s);
        }
        System.out.println(" --> "+this.drop);
        System.out.println(this.fare);
        System.out.println(this.status);
        System.out.println("-----------------------");
    }
    void cancelride(){
        if(this.status.equals("cancelled")){
            System.out.println("Already cacelled");
        }
        else if(this.status.equals("completed")){
            System.out.println("Completed ride can't be cancelled");
        }
        else{
            this.status = "cancelled";
            this.fare = 0;
            System.out.println("successfully cancelled");
        }
    }
    void completeride(){
        if(this.status.equals("cancelled")){
            System.out.println("cacelled ride can't be comlpeted");
        }
        else if(this.status.equals("completed")){
            System.out.println("Already completed");
        }
        else{
            this.status = "completed ";
            System.out.println("successfully completed");
        }
    }
}
public class RapidoApp{
    public static void main(String[] args){
        Ride R1=new Ride("Ram","sjit","tnager");
        R1.showdetails();
        //List<String> stop = new ArrayList<>();
        //stop.add("airport");
        //stop.add("port");
        //Ride R2 = new Ride("JM","guindy","tnagar",stop);
        //R2.showdetails();
        //R1.cancelride();
        //R1.showdetails();
        //R2.completeride();
        //R2.showdetails();
    }
}
