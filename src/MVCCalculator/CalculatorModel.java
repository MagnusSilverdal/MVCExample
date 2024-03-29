package MVCCalculator;

/**
 * Created by magnus on 2017-01-27.
 */
// The Model performs all the calculations needed
// and that is it. It doesn't know the View
// exists
public class CalculatorModel {
    // Holds the value of the sum of the numbers
    // entered in the view
    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }

    public static void main(String[] args) {
        CalculatorModel test = new CalculatorModel();
        test.addTwoNumbers(5,7);
        System.out.println(test.getCalculationValue());
    }
}