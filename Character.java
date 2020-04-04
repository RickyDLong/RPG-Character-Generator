//Name: Ricky Long                      Date Assigned: 3/26/2020
//
//Course: CSCI 2003 63794               Date Due: 3/31/2020
//
//Instructor: Ms. Greer
//
//File Name: Creation.java
//
/*Program Description: This is a character creation tool based off of a role playing game.
                       The program asks the user to select a race, class, and a profession.
                       Each race and class has their own attributes known as stat(statistic)
                       points.

                       The program recognizes which race / class combination you choose and
                       then calculates the appropriate stat points for that combination.

                       At the end of the program it prints out your choice alongside the calculated
                       totals for each character statistic and welcomes you to the world of Norrath.*/
                       
                       
                       
/**
   Character class that contains all of the functionality for the 
   creation tool to be used. Contains getters, setters, constructors
   that associate selections with appropriate classes, archtypes, and professions.
   It also handles some simple calculations to process character stats and displays 
   the output of all the calculations as the output.
*/




public class Character {

    /**
      Initializing and Assigning Instance Variables
    */
    
    private String raceSelection;
    private String archtypeSelection;
    private String professionSelection;
    private String welcome = "            Welcome to Norrath!";
    private String name;
    private int strength;
    private int stamina;
    private int intelligence;
    private int dexterity;
    private int agility;
    private int attackPower;
    private int magicPower;
   
   //-------------------------------------------------------------------------------------  
    
   /**
      Constructor 
      @param race, archtype, and profession selection variables
   */

    //Argument Constructor
    public Character(String raceSelection, String archtypeSelection, String professionSelection) {
        this.raceSelection = raceSelection;
        this.archtypeSelection = archtypeSelection;
        this.professionSelection = professionSelection;
    }
    
    /**
      Constructor - No Argument
    */
    
    //No Argument Constructor
    public Character(){
        this.raceSelection = "GNOME";
        this.archtypeSelection = "WARRIOR";
        this.professionSelection = "TINKERER";
    }


    //--------------------------------SELECTION SETTERS AND GETTERS-----------------------------
    
    
    /**
      Updates the value of welcome
      @param welcome equals "Welcome to Norrath!"
    */
    public void setWelcome(String welcome){
        welcome = "Welcome to Norrath!";
    }


    /**
      Updates the value of raceSelection and assigns
      attributes via decision structure to the character 
      statistics of the race based on what is chosen.
      @param raceSelection is updated via user input.
    */
    
    public void setRaceSelection(String raceSelection){
        while(true) {
            if (raceSelection.equals("1")) {
                this.raceSelection = "DWARF";
                this.strength += 2;
                this.stamina += 2;
                this.intelligence += 1;
                this.dexterity += 1;
                this.agility += 1;
                this.attackPower += 3;
                this.magicPower += 3;
                break;
            } else if (raceSelection.equals("2")) {
                this.raceSelection = "GNOME";
                this.intelligence += 3;
                this.dexterity += 2;
                this.agility += 2;
                this.attackPower += 2;
                this.magicPower += 5;
                break;
            } else if (raceSelection.equals("3")) {
                this.raceSelection = "HUMAN";
                this.strength += 2;
                this.stamina += 1;
                this.intelligence += 2;
                this.dexterity += 1;
                this.agility += 1;
                this.attackPower += 3;
                this.magicPower += 2;
                break;
            } else if (raceSelection.equals("4")) {
                this.raceSelection = "TROLL";
                this.strength += 3;
                this.stamina += 4;
                this.intelligence -= 2;
                this.attackPower += 4;
                this.magicPower += 1;
                break;
            } else if (raceSelection.equals("5")) {
                this.raceSelection = "OGRE";
                this.strength += 4;
                this.stamina += 3;
                this.intelligence -= 3;
                this.attackPower += 5;
                this.magicPower += 1;
                break;
            } else if (raceSelection.equals("6")) {
                this.raceSelection = "ELF";
                this.strength += 1;
                this.stamina += 1;
                this.intelligence += 3;
                this.dexterity += 1;
                this.agility += 1;
                this.attackPower += 3;
                this.magicPower += 4;
                break;
            }
        }
    }
    
    
    /**
      Updates the value of archtypeSelection and assigns
      attributes via decision structure to the character 
      statistics of the archtype based on what is chosen.
      @param archtypeSelection is updated via user input.
    */

    public void setArchtypeSelection(String archtypeSelection){
        while(true) {
            if (archtypeSelection.equals("1")) {
                this.archtypeSelection = "WARRIOR";
                this.strength += 14;
                this.stamina += 13;
                this.intelligence += 7;
                this.dexterity += 11;
                this.agility += 10;
                this.attackPower += 4;
                break;
            } else if (archtypeSelection.equals("2")) {
                this.archtypeSelection = "ROGUE";
                this.strength += 11;
                this.stamina += 9;
                this.intelligence += 9;
                this.dexterity += 14;
                this.agility += 12;
                this.attackPower += 4;
                break;
            } else if (archtypeSelection.equals("3")) {
                this.archtypeSelection = "BARD";
                this.strength += 12;
                this.stamina += 10;
                this.intelligence += 10;
                this.dexterity += 11;
                this.agility += 12;
                this.attackPower += 2;
                this.magicPower += 3;
                break;
            } else if (archtypeSelection.equals("4")) {
                this.archtypeSelection = "WIZARD";
                this.strength += 8;
                this.stamina += 10;
                this.intelligence += 15;
                this.dexterity += 11;
                this.agility += 11;
                this.attackPower += 1;
                this.magicPower += 5;
                break;
            } else if (archtypeSelection.equals("5")) {
                this.archtypeSelection = "RANGER";
                this.strength += 9;
                this.stamina += 10;
                this.intelligence += 10;
                this.dexterity += 15;
                this.agility += 11;
                this.attackPower += 3;
                this.magicPower += 1;
                break;
            } else if (archtypeSelection.equals("6")) {
                this.archtypeSelection = "CLERIC";
                this.strength += 8;
                this.stamina += 11;
                this.intelligence += 15;
                this.dexterity += 10;
                this.agility += 11;
                this.attackPower += 2;
                this.magicPower += 5;
                break;
            }
        }
    }
    
    
   /**
      Updates the value of professionSelection 
      @param archtypeSelection is updated via user input.
    */
    public void setProfessionSelection(String professionSelection){
        if (professionSelection.equals("1")) {
            this.professionSelection = "TINKERER";
        }
        else if (professionSelection.equals("2")){
            this.professionSelection = "BLACKSMITH";
        }
        else if (professionSelection.equals("3")){
            this.professionSelection = "TAILOR";
        }
        else if (professionSelection.equals("4")){
            this.professionSelection = "JEWELER";
        }
        else if (professionSelection.equals("5")){
            this.professionSelection = "POISON MAKING";
        }
        else if (professionSelection.equals("6")){
            this.professionSelection = "FLETCHING";
        }
    }
    
    
    /**
      Updates value of name
      @param user input is set as name
    */
    public void setName(String name){
        this.name = name;
    }
    
    
    //-----------------------GETTERS-----------------------------
    
    /**
      Returns the current value of raceSelection.
      @return race that was selected
    */
    public String getRaceSelection(){
        return raceSelection;
    }
    
    /**
      Returns the current value of archtypeSelection.
      @return archtype that was selected
    */
    public String getArchtypeSelection(){
        return archtypeSelection;
    }
    
    /**
      Returns the current value of professionSelection.
      @return profession that was selected
    */
    public String getProfessionSelection(){
        return professionSelection;
    }
    
    /**
      Returns the current value of strength.
      @return strength
    */
    public int getStrength(){
        return strength;
    }
    
    /**
      Returns the current value of stamina.
      @return stamina
    */
    public int getStamina(){
        return stamina;
    }
    
    /**
      Returns the current value of intelligence.
      @return intelligence
    */
    public int getIntelligence(){
        return intelligence;
    }
    
    /**
      Returns the current value of dexterity.
      @return dexterity
    */
    public int getDexterity(){
        return dexterity;
    }
    
    /**
      Returns the current value of agility.
      @return agility
    */
    public int getAgility(){
        return agility;
    }
    
    /**
      Returns the current value of attackPower.
      @return attackPower
    */
    public int getAttackPower(){
        return attackPower;
    }
    
    /**
      Returns the current value of magicPower.
      @return magicPower
    */
    public int getMagicPower(){
        return magicPower;
    }
    
    /**
      Returns the current value of name.
      @return name
    */
    public String getName(){
        return name;
    }
    
    /**
      Returns the current value of welcome
      @return welcome
    */
     public String getWelcome(){
        return welcome;
    }
    
    //-------------------------------------------------------------
    
    
    /**
      Returns the string welcome
      @return the toString() of the welcome variable
    */
    public String toString(){
        return welcome;
    }
}

