/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author parke
 */
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
    System.out.print("How many rounds would you like to play:");
     Random rand = new Random(); 
     int rock = 1;
     int paper = 2;
     int scissors = 3;
     boolean playagain = true;
     int wins = 0;
     int losses = 0;
     int ties = 0;
     
    
     
     while(playagain == true){
     System.out.print("How many rounds would you like to play:");
     Scanner myObj = new Scanner(System.in);
     int rounds = myObj.nextInt();
     if(rounds <1 || rounds >10){
         System.out.println(" error message");
         System.exit(0);
         
     }else{
         for(int i = 0; i <rounds; i++){
             System.out.println(" What would you like to pick");
             System.out.println(" 1 = Rock, 2 = Paper, 3 = Scissors: ");
             int pick = myObj.nextInt();
             int comppick = rand.nextInt(3 - 1 + 1) + 1;
             if (comppick ==pick){
              System.out.println(comppick);
             System.out.println("tie ");
             ties+=1;
         }else if(comppick>pick){
             System.out.println(comppick);
             System.out.println("computer win");
             losses+=1;
         }else{
             System.out.println(comppick);
             System.out.println("user win");
             wins+=1;
         }
         }
     System.out.println("game summary: "+"wins = "+wins+"losses= "+losses+"ties = "+ties);
     if (wins>losses){
         System.out.println("YOU WIN");
     }else if (losses > wins){
         System.out.println("YOU WIN");
     }else{
         System.out.println("YOU TIED");
     }
     System.out.println("Would you like to play again?: ");
     System.out.println("1=yes, 2 = no: ");
     int playagainans = myObj.nextInt();
        if (playagainans == 1){
            playagain = true;
        }else{
            playagain = false;
        }
            
        
     
    }
    }
    }
}
