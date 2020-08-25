
package project2;


public class Bus extends Vehicle{

    public Bus() {
         setLength(10);
    }
    public Bus(int a) {
         setLength(a);
    }
    @Override
    public long  getCost(){
   
      return getHour()*15;
   
    }
}
