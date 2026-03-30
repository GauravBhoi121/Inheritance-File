/* Constructors in inheritance 8*/
import java.util.*;
class a
{
   a()
   {
      System.out.println("Im parent");  
   }
}
class b extends a
{
   b()
   {
      System.out.println("i am child");
   }
}
class constracter 
{
     public static void main (String args[])
     {
         Scanner sc=new Scanner(System.in);
         b a1=new b();
     }
}