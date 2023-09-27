package questions;

public class CheckBox extends Question {

    public CheckBox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponses(getNumCorrect());
    }

    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE OR MORE" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
