public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-12);
        person.setFirstName("Davino");
        person.setLastName("Heyse");
        System.out.println("Leeftijd: " + person.getAge());
        System.out.println("Naam :  " + person.getFirstName() + " " + person.getLastName());
    }
}


