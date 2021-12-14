//This class sets up all the methods that the primary brain method, Calculate, will call based on the input

public class SetUp
{
    public static int firstValue = Expression.getValue1();
    public static int secondValue = Expression.getValue2();
    public static int answer = 0;
    // Methods ---------------------------------------------------------------------------------------------------------

    //This method will perform the addition process of a calculator
    public static int calcAdd(int value1, String operator, int value2)
    {
        answer = firstValue + secondValue;
        return answer;
    }

    //This method will perform the subtraction process of a calculator
    public static int calcSub(int value1, String operator, int value2)
    {
        answer = firstValue - secondValue;
        return answer;
    }

    //This method will perform the multiplication process of a calculator
    public static int calcMult(int value1, String operator, int value2)
    {
        answer = firstValue * secondValue;
        return answer;
    }

    //This method will perform the division process of a calculator
    public static int calcDivi(int value1, String operator, int value2)
    {
        answer = firstValue / secondValue;
        return answer;
    }

    //This method will display an error for expressions that do not produce a valid sum/difference/product/quotient,
    // such as "5/0"
    public static String calcError(int value1, String operator, int value2)
    {
        return "Error";
    }

    //------------------------------------------------------------------------------------------------------------------
}