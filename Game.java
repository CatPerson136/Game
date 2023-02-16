/* 
* This is a Escape Room Game.
*/

/* 
* All of the functions will be void since 
* they will not return anything. 
*/

import java.util.Scanner;
public class Game {
  
  // Varibles needed.
  public static boolean hasKey = false;
  public static boolean hasBall = false;
  public static boolean hasFlashlight = false;
  
  // This is the start of the game.
  public static void main(String[] args) {
    
   // Using the Scanner for the users input. 
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("You are in a room with a door in front of you, "+
        "a closet to your left and a panting behined you. "+
        "a bed to your right "+"What is your first move? \n\n"+
        "1. Forward \n"+
        "2. Look behined \n"+
        "3. Look left \n"+
        "4. Look right ");

        String input = sc.nextLine();
        
        // This will check if the player has typed forward and has the key.
        if (input.equalsIgnoreCase("1")) {
          if (hasKey == true) {
            System.out.println("Door opend, you are free.");
          }
          else {
            System.out.println("Can not open door, it needs a key.");
            main(null);
          }
        }
        // This is where the panting will be.
        else if (input.equalsIgnoreCase("2")) {
          beinedThePlayer();
        }
        // This is where the closet will be.
        else if (input.equalsIgnoreCase("3")) {
          closet();
        }
        // This is where the bed will be.
        else if (input.equalsIgnoreCase("4")) {
          bed();
        }
        else {
          System.out.println("Not a input.");
          main(null);
        }
      }
    }

  // This is where the panting and the losse floor board are.
  public static void beinedThePlayer() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("You see a painting and a loose floor board");
      String input = sc.nextLine();

      // This will check if the player has the ball.
      if (input.equalsIgnoreCase("Bounce ball") && hasBall == true) {
        System.out.println("You have bounced the ball so hard, "+
        "you break the floor board reviling a key.");
        hasKey = true;
        main(null);
      }
      // This will check if the ball is not in hand but the player has bounced anyway.
      else if (input.equalsIgnoreCase("Bounce ball") && hasBall == false) {
        System.out.println("You have no ball.");
        main(null);
      }
      else {
        System.out.println("Not a input");
        main(null);
      }
    }
  }
  // This is were the flashight will be
  public static void bed() {
    Scanner sc = new Scanner(System.in);
    System.out.println("You see a bed, a bed that looks like some standerd collage dorm bed. "+
    "You want to have a peek under the bed. What do you do?\n\n"+
    "1. Look under bed \n"+
    "2. Go back");
    
    String input = sc.nextLine();
  
    // Will check the choices.
    if (input.equals("1")) {
      System.out.println("You have a flashlight");
      hasFlashlight = true;
      main(null);
    }
    else if (input.equals("2")) {
      main(null);
    }
    else {
      System.out.println("Not a vallid input");
      main(null);
    }
  }
  // This is were the ball will be.
  public static void closet() {
    try(Scanner sc = new Scanner(System.in)) {;
      System.out.println("You look at a closet, it is dark\n\n"+
      "1. Look ferther\n"+
      "2. Look back");
      
      String input = sc.nextLine();
      
      // This will check if the player has a flashlight and look in the inside the closet.
      if (input.equals("1") && hasFlashlight == true) {
        System.out.println("You have a ball, it is a hevy metel ball.\n");
        hasBall = true;
        main(null);
      }
      else if (input.equals("1") && hasFlashlight == false) {
        System.out.println("It is a dark room, mabey you need some sort of light souce.\n");
        main(null);
      }
      else if (input.equals("2")) {
        main(null);
      }
      else {
        System.out.println("Not a vallid input");
        main(null);
      }
    }
  }
}