/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;
import java.util.Scanner;

/**
 *
 * @author Atoyebi Adesoji
 * TOPIC: Lopping Constructs(IQ testing system). 
 */
public class IQtest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
    int not, menu;
    int Apt, Eng, Mth, GK;
    int TS, FN, BON = 0;
    
    
    
    System.out.println("WELCOME!\nEnter your number of attempt.");
    not = sc.nextInt();   
    
    
    for(int i =0; i<5; i++){
        
        while(not > 1){
            System.out.println("You are not eligible to take the test, you have done it before.");
         System.out.print("WELCOME!\nInput number of attempt\n");
         not = sc.nextInt();
         
        }
    
        if(not <= 1){
        System.out.println("input number from the following menue(Please start from the first number.): ");
        System.out.println(" 1. Aptitude\n 2. English\n 3. Mathematics\n 4. GK\n 5. Exit");
        menu = sc.nextInt();
            if(menu != 1){
            System.out.println("Wrong!, Exam terminated. Please click the menu accordinly");
            }
        
/*For Aptitude*/            switch(menu){
                case 1:
                    System.out.println("Q: Rice is a carbohydrate.(true/false)?");
                    String ans1;
                    System.out.print("Ans: ");
                    ans1 = sc.next();
                    switch(ans1){
                                     case "true":
                                    Apt = 10;
                                    break;
                                    default: Apt = 0;
                                    break;
                                    }
                        System.out.println(" 2. English\n 3. Mathematics\n 4. GK\n 5. Exit");
                         menu = sc.nextInt();
                         if(menu != 2){
                            System.out.println("Wrong!, Exam terminated. Please click the menu accordinly.");
                            }
                      
                         
 /*For English*/           switch(menu){
                                case 2: 
                                    System.out.println("Q: _______ letter is used for compianies?");
                                    String ans2;
                                     System.out.print("Ans: ");
                                     ans2 = sc.next();
                                        switch(ans2){
                                    case "formal":
                                     Eng = 10;
                                     break;
                                     default: Eng = 0;
                                     break;
                                    }
                                         System.out.println(" 3. Mathematics\n 4. GK\n 5. Exit");
                                         menu = sc.nextInt();
                                         if(menu != 3){
                                         System.out.println("Wrong!, Exam terminated. Please click the menu accordinly");
                                            }
                                        
                                         
 /*For Maths*/           switch(menu){
                                 case 3:
                                 System.out.println("Q: 12 multiplied by 12.");
                                  String ans3;
                                 System.out.print("Ans: ");
                                 ans3 = sc.next();
                                 
                                 switch(ans3){
                                         case "144": 
                                             Mth = 10;
                                             break;
                                         default: Mth = 0;
                                         break;
                                     }
                                 
                                    System.out.println("4. GK\n 5. Exit");
                                    menu = sc.nextInt();
                                    if(menu != 4){
                                    System.out.println("Wrong!, Exam terminated. Please click the menu accordinly");
                                    }
                                   
 /*For General Knlg*/           switch(menu){
                                case 4:
                                    System.out.println("Q: What is the capital of Nigeria?(Note: Use capital letter for the first word.)");
                                    String ans4;
                                    System.out.print("Ans: ");
                                    ans4 = sc.next();
                                    switch(ans4){
                                         case "Abuja":
                                             GK = 10;
                                             break;
                                         default: GK = 0;
                                         break;
                                     }
                                        System.out.println("You are now done with your session. Please press 5 to exit");
                                        menu = sc.nextInt();
                                        while(menu != 5){
                                        System.out.println("Please press 5 to exit.");
                                        menu = sc.nextInt();
                                             }
/*For Exit*/            switch(menu){
                                case 5: 
                                            TS = Apt + Eng + Mth + GK;
                                            
/*Calculating bonus points*/                  switch (TS) {
                                                    case 10:
                                                        BON = 0;
                                                        break;
                                                    case 20:
                                                        BON = 2;
                                                        break;
                                                    case 30:
                                                        BON = 5;
                                                        break;
                                                    case 40:
                                                        BON = 10;
                                                        break;                                                    
                                                }
                                            FN = TS + BON;                                        
                        
                                                                        

                                    System.out.println("================================\n");
                                    System.out.println("RESULTS: \n");
                                    System.out.println("Bonus points earned: "+BON);
                                    System.out.println("Total score out of 50: "+FN);
/*message for IQ level*/            if(FN >=40){
                                            System.out.println("Message on IQ level: You are a genius.\n");    
                                     }else if(FN >=30){
                                            System.out.println("Message on IQ level: You are intelligent.\n");
                                     }else if(FN >=20){
                                             System.out.println("Message on IQ level: Your IQ level is average.\n");
                                     }else if(FN >=10){
                                             System.out.println("Message on IQ level: Your IQ level is below average.\n");
                                     }else{
                                             System.out.println("Message on IQ level: You need to re-appear for the test.\n");
                                         }
                                    
                                         }//Menue for exit.       
                                   
                         }//Menu for General knowledge.
                                             
                            }//Menu for Maths.
                             }//Menu for English.
                                 
            }//Menu for Aptitude.
          
        }//1st if statement.
                
            System.out.println("===============================\n");
            System.out.println("WELCOME!\nEnter number of attempts");
            not = sc.nextInt();
        
    }//for loop.
                       
    
    
    } 
}
