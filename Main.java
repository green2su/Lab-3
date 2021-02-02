import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
      Scanner s = new Scanner(System.in);
      int countNum;
      int x;

      System.out.println("Enter a number to count down or up from: ");
      countNum = s.nextInt();

      System.out.println("Thank you!  Beginning Countdown");
      if (countNum >= 0) 
      {
        for(x = countNum; x >= 0; x -= 1)
        {
          System.out.println(x);
        }
      }
      else
      {
        for(x = countNum; x <= 0; x += 1)
        {
          System.out.println(x);
        }  
      }

      System.out.println("Blast Off!");    


  }
}   
    


  