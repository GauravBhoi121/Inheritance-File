/*Program for practice
Q1. Design calculator using Inheritance*/ 
import java.util.*;
class value
{ 
   int m,n;
   void setvalue(int n,int m)
   {
     this.m=m;
     this.n=n;
   }
}
class add extends value
{ 
   int getadd()
   {
        return m+n;
   }
}
class mul extends value
{
  int getmul()
  {
     return m*n;
  }
}
class div extends value
{
  int getdiv()
  {
    return m/n;
  }
}
class sub extends value
{
  int getsub()
  {
       return (m-n);
  }
}
class calculatorApp
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value m and n");
         int m=sc.nextInt();
         int n=sc.nextInt();
         System.out.println("1.add..2.sub..3.mul..4.div..");
         System.out.println("enter your choice");
         int choice=sc.nextInt();
         switch(choice)
         {
             case 1:
                     add a1=new add();
                     a1.setvalue(m,n);
                     int r=a1.getadd();
                     System.out.println(""+r);
                     break;
             case 2:
                     sub s1=new sub();
                     s1.setvalue(m,n);
                     r=s1.getsub();
                     System.out.println(""+r);
                     break; 
             case 3:
                     mul m1=new mul();
                     m1.setvalue(n,m);
                     r=m1.getmul();
                     System.out.println(""+r);
                     break;
             case 4:
                     div d1=new div();
                     d1.setvalue(m,n);
                     r=d1.getdiv();
                     System.out.println(""+r);
                     break;
            default:
                     System.out.println("wrong choice"); 
        }        
    }
}
