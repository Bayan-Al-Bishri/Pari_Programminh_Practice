import java.util.Scanner;
public class Question8{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of the day from(0 to 6) :");
    int Today=input.nextInt();
    Scanner Input=new Scanner(System.in);
    System.out.println("Enter the number of the day elapsed the day you enter :");
    int elapsed=Input.nextInt();
    int sum_FutureDay= (Today + elapsed)%7;
    String ToDayName= "";
    switch (Today){
      case 0: ToDayName = "Sunday";break;
      case 1: ToDayName = "monday";break;
      case 2: ToDayName = "Tuesday";break;
      case 3: ToDayName = "Wednesday";break;
      case 4: ToDayName = "Thursday";break;
      case 5: ToDayName = "Friday";break;
      case 6: ToDayName = "saturday";break;
      
    }
    String FutureDayName= "";
    switch (sum_FutureDay){
      case 0: FutureDayName = "Sunday";break;
      case 1: FutureDayName = "monday";break;
      case 2: FutureDayName = "Tuesday";break;
      case 3: FutureDayName = "Wednesday";break;
      case 4: FutureDayName = "Thursday";break;
      case 5: FutureDayName = "Friday";break;
      case 6: FutureDayName = "saturday";break;
    }
    System.out.println("To Day is :" + ToDayName + "; the Future Day is :" + FutureDayName);
  }
}
