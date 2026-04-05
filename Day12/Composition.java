class Engine{
    void on(){ //6
        System.out.println("Engine has turned ON");
    }
}
class Car{
    Engine e;                                       //new Engine(),meaning
    Car(){                                          //2
        e=new Engine();
    }
    void start(){                                   //4
        e.on();                                     //5
        System.out.println("Car has started");      //7
    }
}
public class Main{
    public static void main(String[] args){
        Car c=new Car();                            //1
        c.start();                                  //3
    }
}
// OUTPUT:
// Engine has turned ON
// Car has started
