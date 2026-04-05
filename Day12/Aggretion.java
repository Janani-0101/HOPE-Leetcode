class Driver{
    String name;
    Driver(String name){                               //2
        this.name=name;                                //3
    }
    void drive(){                                     //10
        System.out.println("Driver "+name+" came");   //11
    }
}
class Car{
    Driver d;                                         //new Driver()
    Car(Driver d){                                    //5
        this.d=d;                                     //6
    }
    void start(){                                     //8                              
        d.drive();                                    //9                              
        System.out.println("Car has started");        //12
    }
}
public class Main{
    public static void main(String[] args){
        Driver d=new Driver("Alex");                 //1
        Car c=new Car(d);                             //4
        c.start();                                    //7
    }
}
// Output:-
// Driver Alex came
// Car has started
