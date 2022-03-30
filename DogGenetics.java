/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;


/**
 *
 * @author parke
 */
import java.util.Random;
public class DogGenetics {
    public static void main(String[] args) {
        Random rand = new Random();
        int total = 0;
        int left = 0;
        String[] dogs = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur","King Doberman"};
        int startpercentage = 100;
        System.out.print("What's your dogs name:");
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+ name+ "'s prestigious background right here.");
        System.out.println(name + "is: ");
        
        for (int i = 0; i < dogs.length;i++){
          int percentage = rand.nextInt(startpercentage);
          while (percentage !=100){
               if ((i==4) && (total !=100)){
                left = 100 - total;
                System.out.println(left+"% "+dogs[i]);
                percentage = 100;
                break;
            }else{
            System.out.println(percentage+"% "+dogs[i]+" ");
            startpercentage-=percentage;
            total +=percentage;
               }
            
            percentage = 100;
            break;
        }
        System.out.println();
        
}
}
}

