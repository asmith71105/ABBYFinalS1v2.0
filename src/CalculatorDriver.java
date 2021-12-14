public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Expression expression1 = new Expression(2, "+", 21);
        Expression expression2 = new Expression(8, "-", 45);
        Expression expression3 = new Expression(44, "+", 9);

//        int answer1 = MethodCreation.Calculate(expression1);
//        int answer2 = MethodCreation.Calculate(expression2);
        int answer3 = MethodCreation.Calculate(expression3);

//        System.out.println(answer1);
//        System.out.println(expression2.getValue1());
//        System.out.println(answer2);
        System.out.println(expression3.getValue1());
        System.out.println(expression3.getOperator());
        System.out.println(expression3.getValue2());

        System.out.println(SetUp.calcAdd(44, "+", 9));
        System.out.println(SetUp.calcAdd(2, "+", 21));
        System.out.println(SetUp.calcAdd(8, "-", 45));

    }
}