package quiz;
import java.util.*;
public class quizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int i=1,score=0;
        while(i<=5) {
        	System.out.println("Question number:"+i);
        	  if(i==1) {
        		  System.out.println("Which keyword is used to create a class in Java?"); 
        		  System.out.println("A. define  B. class C. static D. object");
        		  System.out.println("Enter your answer:");
                  char ans = sc.next().toUpperCase().charAt(0);
                  if (ans=='B') {
                	  System.out.println("Correct");
                      score++;
                  } 
                  else {
                      System.out.println("Wrong");
                  }
            }
        	  else if (i==2) {
                  System.out.println("Main method?");
                  System.out.println("A. start()  B. main() C. while() D. close()");
                  System.out.println("Enter your answer:");
                  char ans=sc.next().toUpperCase().charAt(0);
                  if (ans=='B') {
                      System.out.println("Correct");
                      score++;
                  } 
           
                  else {
                      System.out.println("Wrong");
                  }
              }
        	  else if (i==3) {
                  System.out.println("Which of these is not a java data type?");
                  System.out.println("A. int  B. float  C. string  D. boolean");
                  System.out.println("Enter your answer:");
                  char ans=sc.next().toUpperCase().charAt(0);
                  if (ans=='C') {
                      System.out.println("Correct");
                      score++;
                  } 
           
                  else {
                      System.out.println("Wrong");
                  }
              }
        	  else if (i==4) {
                  System.out.println("Which of these is used for single-line comments?");
                  System.out.println("A. /**/  B. //  C.#  D./  ");
                  System.out.println("Enter your answer:");
                  char ans=sc.next().toUpperCase().charAt(0);
                  if (ans=='B') {
                      System.out.println("Correct");
                      score++;
                  } 
           
                  else {
                      System.out.println("Wrong");
                  }
              }
        	  
              else {
                  System.out.println("Loop keyword?");
                  System.out.println("A. while  B. stop  C. close  D.try");
                  System.out.println("Enter your answer:");
                  char ans=sc.next().toUpperCase().charAt(0);
                  if (ans=='A') {
                      System.out.println("Correct");
                      score++;
                  } else {
                      System.out.println("Wrong");
                  }
              }
              i++;
          }
          System.out.println("\nQuiz Finished");
          System.out.println("Your Score: " + score + "/5");
          sc.close();
      }
  }   	  
            