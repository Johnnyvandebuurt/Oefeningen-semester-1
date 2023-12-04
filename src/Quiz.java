public class Quiz {
    public static void main(String[] args) {
        QuestionItem myQuestion = new QuestionItem(("Hoeveel poten heeft een spin?"), "Acht.");
        System.out.println(myQuestion.getQuestion());
        System.out.println(myQuestion.getCorrectAnswer());
    }
}
