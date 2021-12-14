//This class sets up all the methods that the primary brain method, Calculate, will call based on the input

public class SetUp
{
    //Variables
    public static int firstValue = Expression.getValue1();
    public static int secondValue = Expression.getValue2();
    public static int answer = 0;


    // Methods

    /*
    //This method will perform the addition process of a calculator. It takes in the variables "value1" and "value2"
    //**
    //reenter the value of int answer
    //return answer, the sum of firstValue and secondValue
     */
    public static int calcAdd(int value1, int value2)
    {
        answer = firstValue + secondValue;
        return answer;
    } //end calcAdd

    /*
    //This method will perform the subtraction process of a calculator. It takes in the variables "value1" and "value2"
    //**
    //reenter the value of int answer
    //return answer, the difference of firstValue and secondValue
     */
    public static int calcSub(int value1, int value2)
    {
        answer = firstValue - secondValue;
        return answer;
    } //end calcSub

    /*
    // This method will perform the multiplication process of a calculator. It takes in the variables "value1" and
    //**
    //reenter the value of int answer
    //return answer, the product of firstValue and secondValue
    */
  public static int calcMult(int value1, int value2)
    {
        answer = firstValue * secondValue;
        return answer;
    } //end calcMult

    /*
    //This method will perform the division process of a calculator. It takes in the variables "value1" and "value2"
    //**
    //reenter the value of int answer
    //return answer, the quotient of firstValue and secondValue
     */
    public static int calcDivi(int value1, int value2)
    {
        answer = firstValue / secondValue;
        return answer;
    } //end calcDivi

    /*
    //This method will display an error for expressions that do not produce a valid sum/difference/product/quotient,
    // such as "5/0". It takes in the variables "value1", "operator", and "value2".
    //**
    //return string
     */
    public static String calcError(int value1, String operator, int value2)
    {
        return "Error";
    } //end calcError

    //------------------------------------------------------------------------------------------------------------------
} //end SetUp class