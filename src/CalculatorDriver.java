public class CalculatorDriver
{
    public static void main(String[] args)
    {
        Expression expression1 = new Expression(44, 89);

        System.out.println(expression1.getValue1());
        System.out.println(expression1.getValue2());


        System.out.println(SetUp.calcAdd(44, 89));
        System.out.println(SetUp.calcSub(44, 89));
        System.out.println(SetUp.calcMult(44, 89));
    } //end main method
} //end CalculatorDriver class