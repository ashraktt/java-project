
package project2;

public class MotoCycle extends Vehicle{

    public MotoCycle() {
         setLength(2);
    }
    public MotoCycle(int a) {
         setLength(a);
    }
    @Override
    public long  getCost(){
   
      return getHour()*5;
   
    }
    
}
