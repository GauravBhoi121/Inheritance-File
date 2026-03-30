import java.util.*;
class area
{
   float r;
   int l,w;
   void setArea(int len,int width)
   {
       l=len;
       w=width;
   }
   void setredius(float redius)
   {
     r=redius;
   }
}
class calculet extends area
{
    void getArea()
    {
       int add=l*w;
       System.out.println(""+add);
    }
    void getredius()
    {
       float redius=r*r*3.14f;
       System.out.println(""+redius);
    }    
}
class Areaof
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       calculet c1=new calculet();
       System.out.println("choice 1,and 2");
       System.out.println("enter the choice");
       int choice=sc.nextInt();
       switch(choice)
       {
           case 1:
                    System.out.println("enter the redius");
                    float r=sc.nextInt();
                    c1.setredius(r);
                    c1.getredius();
                    break;
           case 2:
                    System.out.println("enter length and width");
                    int l=sc.nextInt();
                    int w=sc.nextInt();
                    c1.setArea(l,w);
                    c1.getArea();
                    break;
           default:
                     System.out.println("its wrong choice");
                    
       }
    }
}