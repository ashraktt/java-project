
package project2;

import java.util.Scanner;

public abstract class Vehicle {
   Scanner s=new Scanner (System.in);
    private int length;
    private long hour;
    public void setLength(int a){
   
      length=a;
   }
  
   public int getLength(){
   
      return length;
   }
   public  void setHour(long a){
        do{
            if(a>0 && a<=(24*30))
              break;
            else
            {
              System.out.print(" Please ,Enter the postive number && the hour between '0' and '720' ");
              a=s.nextInt();
            }
                          
        }while(true);
       
       hour=a;
   }
   public long getHour(){
   
      return hour;
   }
  public abstract long getCost();
}
