public class Student {
    private String name;
    private int historyExamPoints;
    private char group;
    public Student(String name, int historyExamPoints, char group) {
        this.name = name;
        this.historyExamPoints = historyExamPoints;
        this.group = group;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        if (name.length() > 5){
            if (name.length() < 62) {
                this.name = newName;
            }
            else {
                System.out.println("je naam heeft te veel karakters.");
            }
        }
        else {
            System.out.println("je naam heeft te weinig karakters.");
        }
    }
    public int getHistoryExamPoints() {
        return historyExamPoints;
    }
    public void setHistoryExamPoints(int newPoints) {
        if (newPoints > 0 && newPoints < 80){
                this.historyExamPoints = newPoints;
        }
        else {
            System.out.println("ERROR 78 : Je score moet tussen de 0 en de 80 liggen. ");
        }
    }
    public char getGroup() {
        return group;
    }
    public void setGroup(char newGroup) {
        if (newGroup == ('a') || newGroup == ('b') || newGroup == ('c') || newGroup == ('d') || newGroup == ('A') || newGroup == ('B') || newGroup == ('C') || newGroup == ('D')) {
            this.group = newGroup;
            if (newGroup == ('a')) {
                setGroup('A');
            }
            if (newGroup == ('b')) {
                setGroup('B');
            }
            if (newGroup == ('c')) {
                setGroup('C');
            }
            if (newGroup == ('d')) {
                setGroup('D');
            }
        }
        else {
            System.out.println("Je groep moet tussen de A en de D zitten.");
        }
    }
    public void printReport() {
            System.out.println("zijn punten op zijn geschiedenisexamen zijn " + historyExamPoints + " punten.");
            System.out.println("zijn klasgroep is " + group + ".");
        }
    }



