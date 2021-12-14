public class Expression
{
    //Variables
    public static int value1;
    public static int value2;
    public static String operator;

    public static String[] operators = {"+", "-", "*", "/"};


    //Constructors
    public Expression(int value1, int value2)
    {
        this.value1 = value1;
        this.value2 = value2;
    } //end Expression


    //Getters
    public static int getValue1()
    {
        return value1;
    } //end getValue1

    public static int getValue2()
    {
        return value2;
    } //end getValue2

    public static String getOperator()
    {
        return operator;
    } //end getOperator

    //Setters
    public void setValue1(int value1)
    {
        this.value1 = value1;
    } //end setValue1

    public void setValue2(int value2)
    {
        this.value2 = value2;
    } //end setValue2

    public void setOperator(String operator)
    {
        this.operator = operator;
    } //end setOperator
} //end Expression class