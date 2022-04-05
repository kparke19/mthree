/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author parke
 */
import java.util.HashMap; 
import java.util.Scanner;
import java.io.*;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class StateCapitals2 {
    public static void main(String[] args)throws Exception {
       int total = 0; //keeps track of how many states and cities we have left to guess from 
       HashMap<String, String> capitalCities = new HashMap<String, String>();
       Scanner sc = new Scanner (new BufferedReader(new FileReader("StateCapitals.txt")));
      // go through the file line by line
       while (sc.hasNextLine()) {
       String currentLine = sc.nextLine();
       //splitting the file by ::
       String[] parts = currentLine.split("::");
       //Assigning state and capitals to key value pairs
       String State = parts[0].trim();
       String City = parts[1].trim();
       capitalCities.put(State, City);
       
    }
       //declaring a random number withing the context of the length of the hash map 
       Random rand = new Random();
       int randstate = rand.nextInt(capitalCities.size()+1);
       
      
       //Declaring two lists to hold the key and value pairs independently
       
       List<String> States = new ArrayList<String>();
       List<String> Cities = new ArrayList<String>();
       
       for(String key : capitalCities.keySet()){
           States.add(key);
           
           
       }
       for (String key : capitalCities.values()){
           Cities.add(key);
       }
     
      
    //Setting up the game by asking if they know the capital of a state from the list
       System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + States.get(randstate));
       //reading in the user input  and determining if it matches
       Scanner sc2 = new Scanner(System.in);
       String guess = sc2.nextLine();
      
       if (guess.equals(Cities.get(randstate))){
           System.out.println("NICE WORK! " + Cities.get(randstate) + " IS CORRECT!");
           Cities.remove(randstate);
           States.remove(randstate);
       }else{
           System.out.println("SORRY THAT IS INCORRECT");
    }
      System.out.println("How many more rounds would you like to play: ");
       Scanner sc3 = new Scanner(System.in);
       Integer rounds = sc3.nextInt();
       if (rounds == 0){
           System.exit(0);
       }else{
           while(rounds!=0){
               
            Random rand1 = new Random();
            int randstate1 = rand1.nextInt(capitalCities.size()+1-total);
            //Setting up the game by asking if they know the capital of a state from the list
            System.out.println("WHAT IS THE CAPITAL OF " + States.get(randstate1));
            //reading in the user input  and determining if it matches
            Scanner sc4 = new Scanner(System.in);
            String guess1 = sc4.nextLine();
            //Comparing to see if the user guessed correctly and decrementing the rounds
            System.out.println(guess1 + Cities.get(randstate1));
            if (guess1.equals(Cities.get(randstate1))){
                System.out.println("NICE WORK! " + Cities.get(randstate1) + " IS CORRECT!");
                Cities.remove(randstate1);
                States.remove(randstate1);
                System.out.println(Cities);
                rounds-=1;
                total+=1;
            }else{
                System.out.println("SORRY THAT IS INCORRECT");
                rounds-=1;
                total+=1;
            } 
            
           }
           System.out.println("Total score is: "+total+ " Thank you for playing");
       }
       
    }
}
