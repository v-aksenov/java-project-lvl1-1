package hexlet.code.games;

public final class Question {

    private String item1;
    private String item2;
    private String item3;

    Question(String evenGameNumber) {
        item1 = evenGameNumber;
    }

    Question(String calculatorOperand1, String calculatorOperator, String calculatorOperand2) {
        item1 = calculatorOperand1;
        item2 = calculatorOperator;
        item3 = calculatorOperand2;
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }
}
