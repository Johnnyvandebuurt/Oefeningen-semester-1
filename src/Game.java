public class Game {
    public static void main(String[] args) {
        GameCharacter warrior = new GameCharacter();
        warrior.setName("warrior Steve");
        warrior.setGender('m');
        warrior.setStrength(9);
        GameCharacter magician = new GameCharacter();
        magician.setName("magician John");
        magician.setGender('x');
        magician.setStrength(8);
        if (warrior.getStrength() > magician.getStrength()) {
            System.out.println("warrior" + " verslaat " + "magician");
        } else if (warrior.getStrength() < magician.getStrength()) {
            System.out.println("magician" + " verslaat " + "warrior");
        }
    }
}
