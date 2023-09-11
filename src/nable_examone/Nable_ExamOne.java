/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nable_examone;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jake Marson Nable
 */
public class Nable_ExamOne {

    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = 1;
        do{
            menu();
            System.out.println("Do you want to have another Transaction?\n[1] YES.\n[2] NO.");
            int user = scan.nextInt();
            if(user == 2){ 
                System.out.println("Ok, Have a nice day");
                loop++;
            }else{
                System.out.println("\nOk, Another Transcation");
            }
            
        }while(loop == 1);
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("[1] Code One.\n[2] Code Two.\n[3] Code Three.\n[4] Code Four.\n[5] Code Five");
        int user = scan.nextInt();
        switch(user){
            case 1:
                codeone();
                break;
            case 2:
                codetwo();
                break;
            case 3:
                codethree();
                break;
            case 4:
                codefour();
                break;
            case 5:
                codefive();
                break;
        }
    }
    //codeone
    public static void codeone(){
        int [] arr = {1,-2,3,-4,5};
        for(int i = 0; i < arr.length; i++ ){
            if(i>0){
                System.out.println(arr[i]);
            }
        }
        
    }
    //codetwo
    public static void codetwo(){
        Scanner scan = new Scanner(System.in);
        LinkedList<String> array = new LinkedList<>();
        
        System.out.println("Enter Array size");
        int size = scan.nextInt();
        System.out.println("Enter the String elements");
        String elem = scan.nextLine();
        for(int i = 0; i < size; i++){
            array.add(elem);
        }
        System.out.println("Element Sorting");
        Collections.sort(array);
    }
     
     //codethree
    public static void codethree(){
        int [] myArray = {1,2,3,4,5};
        
        System.out.println("The number of element of the array are:"+ myArray.length);        
    }
    
    public static void codefour(){
        int [] positiveEvenNumbers = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("the even numbers of the array are:\n");
        for(int i = 0; i < 20 ; i++){
            System.out.println(positiveEvenNumbers[i]);
            i++;
        }
    }
    
    //codefive
    public static void codefive(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the size of fabonacci");
        int size = scan.nextInt();
        
        System.out.println("The fabonacci are");
        for(int i = 0; i < size ; i++){
            System.out.println(fibonacci(i) + " ");
        }
    }
        public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
