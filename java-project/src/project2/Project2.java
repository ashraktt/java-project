
package project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        ArrayList <Vehicle> park = new ArrayList<Vehicle>();
        int area=100;
        
        
        System.out.println("");
	System.out.println("\t^^      WELCOME TO OUR PARKING      ^^\t");
	System.out.println("");
        int choise ;
        do{
            System.out.println(" 1 : To Enter the Vehicle  ");
            System.out.println(" 2 : To Delete the Vehicle   ");
            System.out.println(" 3 : To Calculate the Total Cost  ");
            System.out.println(" 4 : To Show the all spaces ");
        do{
        try{
         Scanner s= new Scanner (System.in);
         System.out.print("Enter the choise : ");
         choise=s.nextInt();
         break;
        }
        catch(Exception ex){
         System.out.print(" you enter invalid choise . Enter the intger number ,please ");
        }
        }while(true);
        
        switch(choise){
            case 1:
            {   
              if(park.size()==0 ||park.size()==1)
              {
                System.out.println(" Which Vehicle DO you Enter ? ");
                System.out.println(" Car        >>> Enter 1 . ");
                System.out.println(" Truk       >>> Enter 2 . ");
                System.out.println(" Bus        >>> Enter 3 . ");
                System.out.println(" Moto_cycle >>> Enter 4 . ");
                int choise2;
                do{
                  try{
                   Scanner s= new Scanner (System.in);
                   System.out.print("Enter the choise : ");
                   choise2=s.nextInt();
                   break;
                  }
                  catch(Exception ex){
                  System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                  }
               }while(true);
                switch(choise2){
                    case 1:
                    {   
                        Car c =new Car();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Car will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        c.setHour(h);
                      park.add(c); area-=5;
                      System.out.println("You add this Car in position " + park.size() );
                    break;
                    }
                    case 2:
                    {
                        Truk t =new Truk();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Truk will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        t.setHour(h);
                      park.add(t); area-=7;
                      System.out.println("You add this Truk in position " + park.size() );
                    break;
                    }
                    case 3:
                    {
                        Bus b =new Bus();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Bus will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        b.setHour(h);
                      park.add(b); area-=10;
                      System.out.println("You add this Bus in position " + park.size() );
                    break;
                    }
                    case 4:
                    {
                         MotoCycle m =new MotoCycle();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Muto_cycle will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        m.setHour(h);
                      park.add(m); area-=2;
                      System.out.println("You add this Muto_cycle in position " + park.size() );
                    break;
                    }
                    default:
                      System.out.println("     Invalid choise.       ");
                }
               
               }
              else
              {
                System.out.println(" Which Vehicle DO you Enter ? ");
                System.out.println(" Car        >>> Enter 1 . ");
                System.out.println(" Truk       >>> Enter 2 . ");
                System.out.println(" Bus        >>> Enter 3 . ");
                System.out.println(" Moto_cycle >>> Enter 4 . ");
                int choise2;
                do{
                  try{
                   Scanner s= new Scanner (System.in);
                   System.out.print("Enter the choise : ");
                   choise2=s.nextInt();
                   break;
                  }
                  catch(Exception ex){
                  System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                  }
               }while(true);
                switch(choise2){
                    case 1:
                    {   
                        boolean y=false;
                        Car c =new Car();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Car will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        c.setHour(h);
                         for(int i=0 ;i<park.size();i++)
                            if(park.get(i).getLength()<0)
                            {  
                              int x = Math.abs(Math.abs(park.get(i).getLength())-5);
                              if(x==0)
                              {
                                park.add(i, c); area-=5; 
                                park.remove(i+1);
                                System.out.println("You add this Car in position " +(i+1)+ " . " );
                                y=true;
                                break;
                              }
                            }
                        if(y==false)
                        {   if(area>=5)
                           {
                              park.add(c); area-=5;
                              System.out.println("You add this Car in position " +park.size() + " . " );
                           }
                           else
                            System.out.println("SORY!!!!!  >>>> The Parking is Busy ");
                        }
                    break;
                    }
                    case 2:
                    {   
                        boolean y=false;
                        Truk t =new Truk();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Truk will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        t.setHour(h);
                        for(int i=0 ;i<park.size();i++)
                            if(park.get(i).getLength()<0)
                            {  
                              int x = Math.abs(Math.abs(park.get(i).getLength())-7);
                              if(x==0)
                              {
                                park.add(i, t); area-=7;
                                park.remove(i+1);
                                System.out.println("You add this Truk in position " +(i+1)+ " . " );
                                y=true;
                                break;
                              }
                            }
                        if(y==false)
                        {   if(area>=7)
                            {  
                               park.add(t);  area-=7;
                              System.out.println("You add this Truk in position " +park.size()+ " . " );
                            }
                            else
                              System.out.println("SORY!!!!! >>>> The parking is Busy");
                        }
                    break;
                    }
                    case 3:
                    {
                        boolean y=false;
                        Bus b =new Bus();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Bus will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        b.setHour(h);
                        for(int i=0 ;i<park.size();i++)
                            if(park.get(i).getLength()<0)
                            {  
                              int x = Math.abs(Math.abs(park.get(i).getLength())-10);
                              if(x==0)
                              {
                                park.add(i, b); area-=10;
                                park.remove(i+1);
                                System.out.println("You add this Bus in position " +(i+1)+ " . " );
                                y=true;
                                break;
                              }
                            }
                        if(y==false)
                        {  
                           if(area>=10)
                           {
                             park.add(b); area-=10;
                             System.out.println("You add this Car in position " +park.size()+ " . " );
                           }
                           else
                             System.out.println("SORY!!!!!>>>> The parking is Busy");  
                        }
                            
                    break;
                    }
                    case 4:
                    {    
                        boolean y=false;
                         MotoCycle m =new MotoCycle();
                        long h;
                        do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the Hour that Muto_cycle will stay : ");
                          h=s.nextLong();
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ; 
                        m.setHour(h);
                         for(int i=0 ;i<park.size();i++)
                            if(park.get(i).getLength()<0)
                            {  
                              int x = Math.abs(Math.abs(park.get(i).getLength())-2);
                              if(x==0)
                              {
                                park.add(i, m); area-=2;
                                park.remove(i+1);
                                System.out.println("You add this Muto_cycle in position " +(i+1)+ " . " );
                                y=true;
                                break;
                              }
                            }
                        if(y==false)
                        {  
                           if(area>=2)
                           {
                             park.add(m); area-=2;
                             System.out.println("You add this Muto_cycle in position " +park.size()+ " . " );
                           }
                           else
                             System.out.println("SORY!!!!! >>>> The Parking is Busy");  
                        }
                     
                    break;
                    }
                    default:
                      System.out.println("     Invalid choise.       ");
                }
                  
              }
              break;
            }
            case 2:
            {
                if(park.size()>0)
                {   
                    int count=0;
                    System.out.println(" Which vehicle Do you want to Delete ? ");
                    for(int i=0 ;i<park.size();i++)
                        if(park.get(i).getLength()>0)
                            count++;
                    System.out.println(" We have " + count + " Vehicle in the parking .");
                    int num;
                    do{
                         try{
                          Scanner s= new Scanner (System.in);
                          System.out.print("Please , Enter the number of the vehicle : ");
                          num=s.nextInt();
                          do{
                              if(num>0 && num <= count)
                                 break;
                              else if(num<=0)
                              {
                                System.out.print(" Please ,Enter the postive number && not equal '0' : ");
                                num=s.nextInt();
                              }
                              else if(num>0 && num>count)
                              { 
                                System.out.print(" Please ,Enter number from 1 to " +count + " : ");
                                num=s.nextInt();  
                              }
                          }while(true);
                          break;
                         }
                         catch(Exception ex){
                          System.out.print(" you enter invalid choise . Enter the intger number ,please ");
                          }
                        }while(true) ;
                    area+= park.get(num-1).getLength();
                    park.get(num-1).setLength(-1*park.get(num-1).getLength()); 
                    System.out.println("    ^^ DONE ^^    ");
                }
                else
                   System.out.println("NO Vehicle to Delete . GO TO Choise Number '1' To Add Vehicle Frist ."); 
            break;
            }
            case 3:
            {
                long totalCost=0;
                for(int i=0 ; i<park.size() ;i++)
                    if(park.get(i).getLength()>0)
                    {
                        totalCost+=park.get(i).getCost();
                    }
                System.out.println("The Total Cost till now is : "+ totalCost+"  . ");
            break;
            }
            case 4:
            {
                 area=100;
                for(int i=0 ;i<park.size();i++)
                {   
                    if(park.get(i).getLength()<0)
                    {
                       System.out.println("The position " + (i+1) +" is free with length  " + (park.get(i).getLength()*-1));
                       area-=(park.get(i).getLength()*-1);
                    }
                    else
                       area-=(park.get(i).getLength()); 
                }
                System.out.println(" we have "+ area + " is free .");
            break;
            }
            default:
                 System.out.println("     Invalid choise.       ");
        
        }
        
        }while(true);
        
        
        
    }
    
}
