// Qustion 7:
import java.util.Scanner;
public class Question7{
  public static void main(String[] args){
    String course="Object-Oriented Programming";
    int course_code=2413;
    long year=2026;
   
    Scanner user_input=new Scanner(System.in);
    System.out.println("Enter a text:");
    String UserTxet=user_input.nextLine();

    
    Scanner section=new Scanner(System.in);
    System.out.println("Enter a section number:");
    String UserScetion=section.nextLine();

    
    Scanner class_hour=new Scanner(System.in);
    System.out.println("Enter the class hours :");
    int ClassHours=class_hour.nextInt();

    System.out.println("you'r input :"+ UserTxet);
    System.out.println(course +"|"+ course_code+"|"+year);
    System.out.println("the section number :"+ UserScetion);
    System.out.println("the class hours :"+ ClassHours);
  }
}
