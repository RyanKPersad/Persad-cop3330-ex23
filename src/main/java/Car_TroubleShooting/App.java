/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */

package Car_TroubleShooting;
import java.util.Scanner;

public class App
{
    static Scanner myObj = new Scanner(System.in);

    public static void main( String[] args )
    {
        String answer;

        System.out.println( "Is the car silent when you turn the key\nReply with a Y for yes or N for no");
        answer = myObj.nextLine();

        if(answer.equalsIgnoreCase("Y")){
            System.out.println("Are the battery terminals corroded?");
            String answer1 = myObj.nextLine();
            if(answer1.equalsIgnoreCase("Y")){
                System.out.println("Clean terminals and start trying again.");

            }else if(answer1.equalsIgnoreCase("N")){
                System.out.println("Replace cables and try again.");

            }



        }else if(answer.equalsIgnoreCase("N")){
          System.out.println("Does the car make a slicking noise?");
          String answer2 =myObj.nextLine();

          if (answer2.equalsIgnoreCase("Y")){
              System.out.println("Replace the battery.");


          }else if(answer2.equalsIgnoreCase("N")){

              System.out.println("Does the car crank up but fail to start?");
              String answer3 = myObj.nextLine();

              if(answer3.equalsIgnoreCase("Y")){
                  System.out.println("Does the car crank up but fail to start?");

              }else if(answer3.equalsIgnoreCase("N")){
                  System.out.println("Does the engine start and then die?");
                  String answer4 = myObj.nextLine();

                  if(answer4.equalsIgnoreCase("Y")){
                      System.out.println("Does your car have fuel injection?");
                      String answer5 = myObj.nextLine();

                      if(answer5.equalsIgnoreCase("Y")){
                          System.out.println("Get it in for service!");

                      }else if(answer5.equalsIgnoreCase("N")){
                           System.out.println("Check to ensure the choke is opening and closing.");

                      }

                  }else if(answer4.equalsIgnoreCase("N")){
                       System.out.println("This should not be possible.");

                  }
              }

          }

    }
    }
}
