public class SetUp
{
    public static double value1;
    public double value2;
    public String operator;

    //Methods
    public double calcAdd(double value1, String operator, double value2)
    {
        return value1 + value2;
    }

    public double calcSub(double value1, String operator, double value2)
    {
        return value1 - value2;
    }

    public double calcMult(double value1, String operator, double value2)
    {
        return value1 * value2;
    }

    public double calcDivi(double value1, String operator, double value2)
    {
        return value1 / value2;
    }

    //Getters
    public double getValue1()
    {
        return value1;
    }

    public double getValue2()
    {
        return value2;
    }

    public String getOperator()
    {
        return operator;
    }

    //Setters
    public void setValue1(double value1)
    {
        this.value1 = value1;
    }

    public void setValue2(double value2)
    {
        this.value2 = value2;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }
}