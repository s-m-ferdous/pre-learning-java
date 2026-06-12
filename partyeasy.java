import java.util.Scanner;
public class partyeasy
{
  public static void main(String[]args)
  {
   int n=0,x=1,s=0;
   String u="";
   char ch1='A';
   char ch2='E';
   char ch3='I';
   int num1=(int)ch1;
   int num2=(int)ch2;
   int num3=(int)ch3;
   int flag=0;
   int n1=0;
   Scanner sc=new Scanner(System.in);
   int i=0,j=0;
   while(i<3000)
   {
    System.out.println("Please enter the personality type");
    u=u+sc.nextLine().toUpperCase();
    i=i+u.length();
    n=u.length();
    while(j<i)
    {
      if((int)u.charAt(j)==ch2&&j==0)
      {
       break;
      }
      if((int)u.charAt(j)==ch1)
      {
       flag=1;
       j=j++;
      }
      if(flag==1)
      {
       x=x;
       s=s+1;
      }
       n1=s;
      if(flag==0)
      {
       x=x+1;
       s=s+1;
       j=j++;
      }
      else
      {
        
      }
    }
   }
  }
}