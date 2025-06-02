class Car{
    String model;
    String color;
    int price;
    boolean isLocked=false;


    Car(){
        System.out.println("default constructor");
        model="Hatchback";
        color="Black";
        price=59000;
    }
    Car(String modelName,String colorName,int priceValue){
        System.out.println("parametrised constructor");
        model=modelName;
        color=colorName;
        setPrice(priceValue);
    }

    void drive(){
        System.out.println("vroom vroom");
    }

    void lock(){
        isLocked=true;
        System.out.println("car is locked");
    }
    void unlock( ){
        isLocked=false;
        System.out.println("car is unlocked");
    }
    //Getter for price property
    float getPrice(){
        return price;

    }

    //setter for price property
    void setPrice(int priceValue){
        if(priceValue<0){
            priceValue=0;
        }
        price =priceValue;
    }


}



public class classesandobjects {
public static void main(String[]args){
    Car c1=new Car("Sedan","RED",2000);
    Car c2=new Car();
    System.out.println(c1.model);

    System.out.println(c1.color);

    System.out.println(c2.price);
    System.out.println(c1.model);
    System.out.println(c1.color);
    System.out.println(c1.price);

    c2.color="Gray";

    System.out.println(c2.color);
    c1.drive();
    c2.drive();

    c1.lock();
    c2.unlock();
    System.out.println(c1.isLocked);
    System.out.println(c2.isLocked);

    c2.setPrice(500000);
    System.out.println(c2.getPrice());




}
}
