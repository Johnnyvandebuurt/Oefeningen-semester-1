public class Person {
    private String firstName;

    private String lastName;

    private int age;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String newFirstName) {
        if (firstName.length() < 50) {
            firstName = newFirstName;
        }
        else {
            System.out.println("ERROR 911 : Gegevens zijn te lang");
        }
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 130) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }
}


