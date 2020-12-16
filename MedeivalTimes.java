import java.util.Scanner;

import java.io.*;
import java.nio.file.Files;

public class MedeivalTimes
{
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("--Midieval Times--");

        Scanner scan = new Scanner(System.in);

        Scanner fileScan;

        File file;

        String input = "";

        try { 

            file = new File("data.csv");

            fileScan = new Scanner(file);



            while (!input.equals("quit")) {      
                while (fileScan.hasNextLine()) {
                    int count = 0;
                    String[] allsaves = fileScan.nextLine().split("-");
                    GameSaves save = new GameSaves(allsaves[1]);
                    System.out.println(allsaves[1]);
                }


//main menu screen - made to be displad untill closed
                System.out.println("Enter first the word to choose an option" + 
                "\n(any errors in typing will cause issues)");
                System.out.println("Create a new game");
                System.out.println("Validate a save file");
                System.out.println("Reroll an existing character");
                System.out.println("Quit");
                input = scan.nextLine();

                


                if (input.equals("create") || input.equals("Create")) {
                    System.out.println("Creating new save \n Enter save name:");
                    String savename = scan.nextLine();
                    //player 1
                    System.out.println("Enter player 1's name");
                    String playerone = scan.nextLine();
                    System.out.println("Enter player 1's type");
                    playerone = playerone + "," + scan.nextLine();
                    System.out.println("Enter player 1's highest stat(7-10)");
                    playerone = playerone + "," + scan.nextLine();
                    //player 2
                    System.out.println("Enter player 2's name");
                    String playertwo = scan.nextLine();
                    System.out.println("Enter player 2's type");
                    playerone = playertwo + "," + scan.nextLine();
                    System.out.println("Enter player 2's highest stat(7-10)");
                    playerone = playertwo + "," + scan.nextLine();
                    //player 3
                    System.out.println("Enter player 3's name");
                    String playerthree = scan.nextLine();
                    System.out.println("Enter player 3's type");
                    playerone = playerthree + "," + scan.nextLine();
                    System.out.println("Enter player 3's highest stat(7-10)");
                    playerone = playerthree + "," + scan.nextLine();
                    //player 4
                    System.out.println("Enter player 4's name");
                    String playerfour = scan.nextLine();
                    System.out.println("Enter player 4's type");
                    playerone = playerfour + "," + scan.nextLine();
                    System.out.println("Enter player 4's highest stat(7-10)");
                    playerone = playerfour + "," + scan.nextLine();

                    GameSaves save2 = new GameSaves(savename, playerone, playertwo, playerthree, playerfour);
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