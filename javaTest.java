import java.util.Scanner;
import java.lang.Math;

public class javaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many games do you want to play?");
        int number = scanner.nextInt();
        for (int i=0; i<number ; i++){
            int match = 0;
            int max = 49;
            int min = 1;
            int range = max - min + 1;
            int[] winArray = new int[6];
            int[] pickedArray = new int[6];  
            
            
            System.out.println("Do you want to pick your own ticket numbers (true/false)?");
            boolean pick = scanner.nextBoolean();
            
            if(pick == false){
                System.out.print("You have picked the tickets:");
                for(int j=0; j<6; j++){
                    pickedArray[j] = (int)(Math.random()*range) + min;
                    System.out.print(" "+pickedArray[j]);                   
                }
                System.out.print("\nThe winning ticket is:");      
                for(int k=0; k<6; k++){
                    winArray[k] = (int)(Math.random()*range) + min;
                    System.out.print(" "+winArray[k]);                   
                }
                for(int x=0; x<6; x++){
                    if(pickedArray[x] == winArray[x]){
                        match = match + 1;
                    }
                }
                System.out.println("\nYour ticket has matched " + match + " number(s)");
                switch(match){
                    case 0:
                        System.out.println("You have won nothing");
                        break;
                    case 1:     
                        System.out.println("You have won $10");
                        break;
                    case 2:
                        System.out.println("You have won $10");
                        break;
                    case 3:
                        System.out.println("You have won $100");
                        break;
                    case 4:
                        System.out.println("You have won $1000");
                        break;
                    case 5:
                        System.out.println("You have won $5000");
                        break;
                    case 6:
                        System.out.println("You have won 5 million");   
                        break;
                }        
            }
            
            else {
                System.out.println("Enter 6 numbers of your ticket (1-49): ");
                for(int y=0; y<6; y++){
                    pickedArray[y] = scanner.nextInt();  
                    winArray[y] = (int)(Math.random()*range) + min; 
                }
                System.out.println("You have picked the ticket:");
                for(int z=0; z<6; z++){
                     System.out.print(" "+pickedArray[z]);
                }
                System.out.println("\nThe winning ticket is:");
                for(int t=0; t<6; t++){
                     System.out.print(" "+winArray[t]);
                }
                for(int x=0; x<6; x++){
                    if(pickedArray[x] == winArray[x]){
                        match = match + 1;
                    }
                }
                System.out.println("\nYour ticket has matched " + match + " number(s)");
                switch(match){
                    case 0:
                        System.out.println("You have won nothing");
                        break;
                    case 1:     
                        System.out.println("You have won $10");
                        break;
                    case 2:
                        System.out.println("You have won $10");
                        break;
                    case 3:
                        System.out.println("You have won $100");
                        break;
                    case 4:
                        System.out.println("You have won $1000");
                        break;
                    case 5:
                        System.out.println("You have won $5000");
                        break;
                    case 6:
                        System.out.println("You have won 5 million");  
                        break;
                  }        
                }
            }
        }
    }