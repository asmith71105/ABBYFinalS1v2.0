public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Expression expression1 = new Expression(2, "+", 21);
        Expression expression2 = new Expression(8, "-", 45);
        Expression expression3 = new Expression(44, "*", 9);

        int answer1 = MethodCreation.Calculate(expression1);
        int answer2 = MethodCreation.Calculate(expression2);
        int answer3 = MethodCreation.Calculate(expression3);

        System.out.println(answer1);
    }
}