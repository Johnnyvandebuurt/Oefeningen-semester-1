public class Main {
    public static void main(String[] args) {
        Student student = new Student("Freddy", 5, 'f');
        student.setName("Freddy");
        student.setHistoryExamPoints(100);
        student.setGroup('d');
        student.printReport();
    }
}
