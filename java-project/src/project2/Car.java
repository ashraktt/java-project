
package project2;

public class Car extends Vehicle {

    public Car() {
        setLength(5);
    }
    public Car(int a) {
        setLength(a);
    }
    @Override
    public long getCost(){
   
      return getHour()*10;
   
    }
    
}
