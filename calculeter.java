import java.util.*;
class value
{
    int a,b;
    public void setvalues(int a,int b)
    {
       this.a=a;
       this.b=b;
    }
}
class calculet extends value
{ 
    void getAdd()
    {
       int add=a+b;
       System.out.println("add is="+add);
    }
    void getsub()
    {
      int sub=a-b;
       System.out.println("sub is"+sub);
    }
    void getmul()
    {
      int mul=a*b;
       System.out.println("mul is"+mul);
    }
    void getdiv()
    {
      int div=a/b;
       System.out.println("div is"+div);
    }
}
class calculeter
{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
          int a , b;
          System.out.println("enter values");
          a=sc.nextInt();
          b=sc.nextInt();
          calculet v1=new calculet();
          v1.setvalues(a,b);
          System.out.println("1:add,2:mul,3:sub,4:div");
          int choice=sc.nextInt();
          switch(choice)
          {
             case 1:
                      v1.getAdd();
                      break;
             case 2:
                      v1.getmul();
                      break;
             case 3:
                      v1.getsub();
                      break;
             case 4:
                      v1.getdiv();
                      break;
             default :
                       System.out.println("wrong choice");
          }
       }
}