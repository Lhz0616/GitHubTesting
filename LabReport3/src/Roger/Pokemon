package Lab_report_3;

public class Pokemon {
    private String ID;
    private String Pokemon_Name;
    private String Element_Type;
    private int Hit_Point;
    private int Attack;
    private int Defense;
    private int Speed;
    private int Special;
    private int Level = 1;    

    public Pokemon(String ID, String Pokemon_Name, String Element_Type) {
        this.ID = ID;
        this.Pokemon_Name = Pokemon_Name;
        this.Element_Type = Element_Type;
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPokemon_Name() {
        return Pokemon_Name;
    }

    public void setPokemon_Name(String pokemon_Name) {
        Pokemon_Name = pokemon_Name;
    }

    public String getElement_Type() {
        return Element_Type;
    }

    public void setElement_Type(String element_Type) {
        Element_Type = element_Type;
    }

    public int getHit_Point() {
        return Hit_Point;
    }

    public void setHit_Point(int hit_Point) {
        Hit_Point = hit_Point;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getSpecial() {
        return Special;
    }

    public void setSpecial(int special) {
        Special = special;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void randomGenerator(){
        Hit_Point = (int) (Math.random() * (25 - 15 + 1) + 15);
        Attack = (int) (Math.random() * (17 - 10 + 1) + 10);
        Defense = (int) (Math.random() * (17 - 10 + 1) + 10);
        Speed = (int) (Math.random() * (15 - 5 + 1) + 5);
        Special = (int) (Math.random() * (10 - 5 + 1) + 5);
    }

    public void levelUp(int level){
        int count=0;
        Level += level;
        while(count<level){
            Hit_Point += (int) (Math.random() * (5 - 2 + 1) + 2);
            Attack += (int) (Math.random() * (3 - 1 + 1) + 1);
            Defense += (int) (Math.random() * (3 - 1 + 1) + 1);
            Speed += (int) (Math.random() * (3 - 1 + 1) + 1);
            Special += (int) (Math.random() * (3 - 1 + 1) + 1);
            count++;
        }
    }
}
