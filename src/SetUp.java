//This class sets up all the methods that the primary brain method, Calculate, will call based on the input

public class SetUp
{
    // Methods ---------------------------------------------------------------------------------------------------------

    //This method will perform the addition process of a calculator
    public static int calcAdd(int value1, String operator, int value2)
    {
        return MethodCreation.sum;
    }

    //This method will perform the subtraction process of a calculator
    public static int calcSub(int value1, String operator, int value2)
    {
        return MethodCreation.diff;
    }

    //This method will perform the multiplication process of a calculator
    public static int calcMult(int value1, String operator, int value2)
    {
        return MethodCreation.product;
    }

    //This method will perform the division process of a calculator
    public static int calcDivi(int value1, String operator, int value2)
    {
        return MethodCreation.quotient;
    }

    //This method will display an error for expressions that do not produce a valid sum/difference/product/quotient,
    // such as "5/0"
    public static String calcError(int value1, String operator, int value2)
    {
        return "Error";
    }

    //------------------------------------------------------------------------------------------------------------------
}