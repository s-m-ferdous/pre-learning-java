import java.util.Scanner;
public class codeforcecgame1
{
  public static void main(String[]args)
  {
   int n,x,s;
   String u="";
   Scanner sc= new Scanner(System.in);
   System.out.println("Please enter number of friends(Must range from 1 to 3000)");
   n=sc.nextInt();
   while(n>3000)
   {
    System.out.println("Not valid please re-enter:");
    n=sc.nextInt();
   }
   System.out.println("Please enter number of tables");
   x=sc.nextInt();
   System.out.println("Please enter number of chairs per table");
   s=sc.nextInt();
   char ch1='A';
   char ch2='E';
   char ch3='I';
   System.out.println("input was: "+n+" "+x+" "+s);
   while(u.length()<n)
   {
    System.out.println("Please input personality type:");
    char ch=sc.next().charAt(0);
    u=(u+ch).toUpperCase();
   }
   System.out.println("input was: "+n+" "+x+" "+s);
   for(int i=0;i<n;i++)
   {
    char test=u.charAt(i);
    if(test==ch2&&i==0)
    {
     n=n-1;
    }
    if(test==ch2&&i!=0)
    {
     x=x-1;
    }
    if(x==0);
    {
     break;
    }
   }
   if((x*s<n))
   {
    n=(s*x);
   }
   System.out.println(n);
  }
}