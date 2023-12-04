public class GameCharacter {
    private String name;
    private char gender;
    private double strength;
    public String getName() {
        String name1 = name;
        return name1;
    }
    public char getGender() {
        return gender;
    }
    public double getStrength() {
        return strength;
    }
    public void setName(String name) {

        }
    public char setGender(char gender){
        char setGender = gender;
        return setGender;
    }
    public double setStrength(double strength) {
        double setStrength = strength;
        return setStrength;
    }
    public void GameCharacter(String name,char gender,double strength) {
        this.name = name;
        this.gender = gender;
        this.strength = strength;
    }
    public void GameCharacter(String name,double strength) {
        this.name = name;
        this.strength = strength;
    }
}

