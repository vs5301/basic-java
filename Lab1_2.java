import java.util.Scanner;
class CalculateStudentGrades {
    public static void main(String args[]) {
       try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter number of subjects");
		   int n = sc.nextInt(), total = 0;
		   System.out.println("Enter average of your marks (less than 100)::");
		   int average[] = new int[n];
		   for(int i = 0;i<n;i++)
		   {
		       average[i] = sc.nextInt();
		   } 
		   for(int i = 0; i<average.length; i++)
		   {
		        total = total + average[i];
		   }
		   double avg = total / average.length;
		   char grade;
 
		   if(avg>=80){
		      grade = 'A';
		   }else if(avg>=60 && avg<80){
		      grade = 'B';
		   }
		   else if(avg>=40 && avg<60){
		      grade = 'C';
		   }
		   else {
		      grade = 'D';
		   }
 
		   switch(grade) {
		      case 'A' :
		         System.out.println("Excellent!");
		         break;
		      case 'B' :
		      case 'C' :
		         System.out.println("Well done");
		         break;
		      case 'D' :
		         System.out.println("You passed");
		      case 'F' :
		         System.out.println("Better try again");
		         break;
		      default :
		      System.out.println("Invalid grade");
		   }
		   System.out.println("Your grade is " + grade);
	}
    }
 }