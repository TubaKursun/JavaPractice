package Constructor;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

public class Car {

    String brand;


    public void move (){
        System.out.println("car is moving");

    }
public  Car (){

}
public Car (String brand){
        this.brand=brand;
}
@Override
    public String toString(){
        return "the brand of the car is" + brand;
}
@Override
    protected void finalize() {

    System.out.println("car is going to garbage");
}

}
