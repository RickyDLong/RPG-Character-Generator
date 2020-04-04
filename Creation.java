//Name:                       Date Assigned: 3/26/2020
//
//Course: CSCI 2003 63794               Date Due: 3/31/2020
//
//Instructor: 
//
//File Name: Creation.java
//
/*Program Description: This is a character creation tool based off of a role playing game.
                       The program asks the user to select a race, class, profession and
                       name for their character. Each race and class has their own attributes
                       known as stat(statistic) points.

                       The program recognizes which race / class combination you choose and
                       then calculates the appropriate stat points for that combination.

                       At the end of the program it prints out your choice alongside the calculated
                       totals for each character statistic and welcomes you to the world of Norrath.*/


import java.util.Scanner;

/** 
   Driver Program that allows the user to create a role playing game character. 
It calculates statitics for that character based on choices made within the program.
*/

public class Creation {
   
   /**
      Operates and runs the character creation tool.
   */
   
   //main
    public static void main(String[] args){
         
        //Scanner Object for user input 
        Scanner input = new Scanner(System.in);


        //Argument Object
        Character mainToon = new Character();

        //No-Argument Object
        Character alt = new Character("3","4", "4");



        //---------------------CHOOSE YOUR RACE------------------------



        //Creating Race Menu Object to call method
        Creation Rmenu = new Creation();
        System.out.println(Rmenu.raceMenu());



        //User Input + setting the race
        System.out.print("              Choose a Race: ");
        String raceChoice = input.nextLine();
        mainToon.setRaceSelection(raceChoice);



        //------------------CHOOSE YOUR ARCHTYPE----------------------



        //Creating Archtype Menu Object to call method
        Creation Amenu = new Creation();
        System.out.println(Amenu.archtypeMenu());



        //User Input + setting archtype
        System.out.print("            Pick your class: ");
        String archtypeChoice = input.nextLine();
        mainToon.setArchtypeSelection(archtypeChoice);



        //----------------CHOOSE YOUR PROFESSION----------------------



        //Creating Profession Menu Object to call method
        Creation Pmenu = new Creation();
        System.out.println(Pmenu.professionMenu());



        //User Input + setting profession
        System.out.print("          Pick your profession: ");
        String professionChoice = input.nextLine();
        mainToon.setProfessionSelection(professionChoice);
        System.out.println("+--------------------------------------------+\n");



        //----------------NAME YOUR CHARACTER------------------



        System.out.print("          Name your Character: ");
        String nameChoice = input.nextLine();
        mainToon.setName(nameChoice);
        System.out.println("+--------------------------------------------+\n");



        //Output showing stats and selections
       
        System.out.printf("%9s %13s %16s",mainToon.getRaceSelection(),mainToon.getArchtypeSelection(), mainToon.getProfessionSelection()+"\n");
        System.out.println("+--------------------------------------------+");
        System.out.printf("%-6s %1s","Name:",mainToon.getName()+"\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Strength:",mainToon.getStrength()+"  |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Stamina:",mainToon.getStamina()+"  |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Intelligence:",mainToon.getIntelligence()+"  |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Dexterity:",mainToon.getDexterity()+"  |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Agility:",mainToon.getAgility()+"  |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Attack Power:",mainToon.getAttackPower()+"   |\n");
        System.out.println("--------------------------");
        System.out.printf("%-20s %1s","Magic Power:",mainToon.getMagicPower()+"   |\n");
        System.out.println("+------------------------+\n");


        //uSING toString() to print out the welcome message
        System.out.println(mainToon.getWelcome());
    }
    

   //Menu setups

    public String raceMenu(){
        String menu = "+--------------------------------------------+\n"+
                      "|           CREATE YOUR CHARACTER            |\n"+
                      "+--------------------------------------------+\n"+
                      "|      WHAT RACE WOULD YOU LIKE TO BE?       |\n"+
                      "+--------vvvvvvvvvvvvvvvvvvvvvvvvvv----------+\n"+
                      "|     1. DWARF                4. TROLL       |\n"+
                      "|     2. GNOME                5. OGRE        |\n"+
                      "|     3. HUMAN                6. ELF         |\n"+
                      "+--------------------------------------------+";
        return menu;
    }



    public String archtypeMenu(){
        String menu =    "+--------------------------------------------+\n"+
                         "|              PICK YOUR CLASS               |\n"+
                         "+--------------------------------------------+\n"+
                         "|     1. WARRIOR              4. WIZARD      |\n"+
                         "|     2. ROGUE                5. RANGER      |\n"+
                         "|     3. BARD                 6. CLERIC      |\n"+
                          "+--------------------------------------------+";
        return menu;
    }



    public String professionMenu(){
        String menu = "+--------------------------------------------+\n"+
                      "|            PICK YOUR PROFESSION            |\n"+
                      "+--------------------------------------------+\n"+
                      "|     1. TINKERER        4. JEWELER          |\n"+
                      "|     2. BLACKSMITH      5. POISON MAKING    |\n"+
                      "|     3. TAILOR          6. FLETCHING        |\n"+
                      "+--------------------------------------------+";
        return menu;
    }
}
