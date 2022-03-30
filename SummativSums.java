/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author parke
 */
public class SummativSums {
    public static void main(String[] args) {
        int[] intArray1 = new int[]{ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] intArray2 = new int[]{ 999, -60, -77, 14, 160, 301 };
        int[] intArray3 = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99 };
        System.out.println("#1 Array Sum: "+ArrayTot(intArray1));
        System.out.println("#2 Array Sum: "+ArrayTot(intArray2));
        System.out.println("#3 Array Sum: "+ArrayTot(intArray3));
        
       
        }
    private static int ArrayTot(int [] myarray){
        int total = 0;
        for(Integer val: myarray){
          total+=val;
        }
        return total;
    }
    
    }

