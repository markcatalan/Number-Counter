package inutil;

import java.util.*;
public class CountDigit
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      int nega[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      int pos[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      
      String store = "0123456789";
      
      System.out.print("Enter limit: ");
      int limit = console.nextInt();
      
      System.out.println("Enter " + limit + " integers: ");
      for(int x = 0; x < limit; ++x)
      {
         System.out.print("Num [" + (x+1) + "]: ");
         int input = console.nextInt();
         
         String temp = Integer.toString(input);
         
         for(int y = 0; y < temp.length(); ++y)
         {     
               for(int z = 0; z < 10; ++z)
               {
                  if(temp.charAt(0) != '-')
                  {
                     if(temp.charAt(y) == store.charAt(z))
                     pos[z]++;
                  }
                  else
                  {
                     if(temp.charAt(y) == '-'){
                        
                        if(temp.charAt(y+1) == store.charAt(z))
                           nega[z]++;    
                     }
                     else
                     {
                        if(y > 1 && temp.charAt(y) == store.charAt(z))
                        pos[z]++;
                     }     
                  }
               }
         }
      }
               for(int yy = nega.length - 1; yy > 0; --yy)
               {
                  System.out.println("-" + store.charAt(yy) + " = " + nega[yy]);
               }
               
               for(int xx = 0; xx < pos.length; ++xx)
               {
                  System.out.println(" " + store.charAt(xx) + " = " + pos[xx]);
               }            
   }
}