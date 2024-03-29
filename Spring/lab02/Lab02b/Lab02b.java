import java.util.Scanner;

/* This program create weekly schedule by taking inputs from user.
 * @author Ahmet Faruk Uluta�
 * @date 25/02/2020
 */
public class Lab02b {
   
   public static void main( String[] args) {
      
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int idNumber;
      String fullName, firstCourse, secondCourse, thirdCourse, fourthCourse;
      
      // program code
      
      // ask student informations
      System.out.println( "Student information" );
      System.out.println( "Enter ID: " );
      idNumber = scan.nextInt();
      scan.nextLine();
      
      System.out.println( "Enter full name: " );
      // asd
      fullName = scan.nextLine();
      
      
      // ask course informations
      System.out.println( "Course information" );
      System.out.println( "Enter the first course: " );
      firstCourse = scan.nextLine();
      
      System.out.println( "Enter the second course: " );
      secondCourse = scan.nextLine();
      
      System.out.println( "Enter the third course: " );
      thirdCourse = scan.nextLine();
      
      System.out.println( "Enter the fourth course: " );
      fourthCourse = scan.nextLine();
      
      // print student and course informations with a chart
      System.out.println( "The student is \"" + fullName + "\". His/her ID is " + idNumber  );
      System.out.println( "Schedule" );
      System.out.println( "| Hour     | Monday     | Tuesday     |" );
      System.out.println( "| 8:40     |" + firstCourse + "       |" + thirdCourse + "        |" );
      System.out.println( "| 9:40     |" + firstCourse + "       | -           |" );
      System.out.println( "|10:40     | -          |" + fourthCourse + "      |" );
      System.out.println( "|11:40     |" + secondCourse + "      | -           |" );
   }
   
}