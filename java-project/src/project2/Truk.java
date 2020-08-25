
package project2;

public class Truk extends Vehicle{
    
    public Truk() {
         setLength(7);
    } 
     public Truk(int a) {
         setLength(a);
    } 
   
    @Override
      public long getCost(){
   
      return getHour()*15;
   
    }
   
   
   
}
