import java.util.Scanner;

import java.io.*;

public class MedeivalTimes
{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("--Midieval Times--");

        Scanner scan = new Scanner(System.in);

        String input = "";

        try { 
            while (!input.equals("quit") || !input.equals("Quit")) {          
                System.out.println("Create a new game");
                System.out.println("Validate a save file");
                System.out.println("Reroll an existing character");
                System.out.println("Quit");
                input = scan.nextLine();
                if (input.equals("create") || input.equals("Create")) {

                }
                if (input.equals("validate") || input.equals("Validate")) {

                }
                if (input.equals("reroll") || input.equals("Reroll")) {
                    
                }
            }
            
        }catch (FileNotFoundException e) {
            System.out.println("Error: file does not exist");
            System.exit(0);
        } finally { 
            System.out.println("done");
        }


    }
}