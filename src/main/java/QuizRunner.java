import questions.*;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        // Create questions
        String q1 = "Which of the following are Marvel Characters?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Spiderman", true),
                new Choice("Wonder Woman"),
                new Choice("Batman"),
                new Choice("Iron Man", true),
        };
        CheckBox question1 = new CheckBox(q1, q1Choices);

        String q2 = "Is the Scarlet Witch more powerful then the Sorcerer Supreme?";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False"),
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "Who was able to pick up Thor's hammer in End Game";
        Choice[] q3Choices = new Choice[] {
                new Choice("Iron Man"),
                new Choice("Hulk"),
                new Choice("Captain America", true),
                new Choice("Black Widow"),
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        // Add questions to the quiz
        quiz.addQuestions(new Question[]{ question3, question2, question1});


        // Interact with user (run quiz, give score)

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);
    }
}
