import java.util.Scanner;

import java.io.*;

public class GameSaves
{
    File file;
    Scanner scan;
    private String savename;
    private String playerone; 
    private String playertwo; 
    private String playerthree; 
    private String playerfour; 
    
    public GameSaves(String save) {
    
            this.savename = save;
            // this.playerone = scan.nextLine();
            // this.playertwo = scan.nextLine();
            // this.playerthree = scan.nextLine();
            // this.playerfour = scan.nextLine();


    }

    public GameSaves(String savename, String playerone, String playertwo, String playerthree, String playerfour) {
        
        this.savename = savename;
        this.playerone = playerone;
        this.playertwo = playertwo;
        this.playerthree = playerthree;
        this.playerfour = playerfour;
    }

    public String getName() {
        return this.savename;
    }

    public String toString() {
        return this.savename + "\n" + this.playerone + "\n" + this.playertwo + "\n" + this.playerthree 
        + "\n" + this.playerfour;
    }
}