import java.util.*;
class a
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner (System.in);
        int a[]=new int [7];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter");
        int k=sc.nextInt();
         int count=0;
        for(int i=0;i<a.length;i++)
        {
           count=1;
           for(int j=(a[i]+1);j<a.length;j++)//3 1 2 2 2 1 3
           {
              if(a[i]==a[j]||(i*j)%k==0)
              {
                count++;
              }
           }
        }
        System.out.println(""+count);
     }
}
