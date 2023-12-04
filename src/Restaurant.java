public class Restaurant {
    public static void main(String [] args) {
        Fooditem spaghetti = new Fooditem();
        spaghetti.name = "spaghetti";
        spaghetti.cookTime = 15;
        spaghetti.foodType = "Hoofdgerecht";
        spaghetti.isVegetarian = true;
        System.out.println("Naam van het gerecht : " + spaghetti.name);
        System.out.println("Tijd : " + spaghetti.cookTime + "min");
        System.out.println("Type gerecht : " + spaghetti.foodType);
        if (spaghetti.isVegetarian == true) {
            System.out.println("Vegetarisch? Ja");
        }
        else if (spaghetti.isVegetarian == false) {
            System.out.println("Vegetarisch? Nee");
        }
    }
}
