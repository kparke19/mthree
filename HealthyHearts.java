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
public class HealthyHearts {
    public static void main(String[] args) {
        System.out.print("What's your age:");
        Scanner myObj = new Scanner(System.in);
        int age = myObj.nextInt();
        int maxrange = 220-age;
        double lower = .5 * maxrange;
        double upper = .85*maxrange;
        System.out.println("Your maximum heart rate should be " + maxrange+ " beats per minut");
        System.out.println("Your target HR Zone is "+Math.ceil(lower)+" - "+Math.ceil(upper)+" beats per minute");
        
        
    }
    
}
