//This class creates the if statements/while loops that will determine which of the five methods the primary brain
//method, Calculate, will call

public class MethodCreation
{
    //Variables
    public static int sum = Expression.value1 + Expression.value2;
    public static int diff = Expression.value1 - Expression.value2;
    public static int product = Expression.value1 * Expression.value2;
    public static int quotient = Expression.value1 / Expression.value2;

    //Brain Methods
    public static int Calculate(Expression expression1)
    {
        if (Expression.getOperator().equals("+"))
        {
            SetUp.calcAdd(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals("-"))
        {
            SetUp.calcSub(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals("*"))
        {
            SetUp.calcMult(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals("/"))
        {
            if(Expression.getValue1() < 0 && Expression.getValue2() == 0 || Expression.getValue1() > 0 && Expression.getValue2() == 0)
            {
                SetUp.calcError(Expression.value1, Expression.operator, Expression.value2);
            }
            else
            {
                SetUp.calcDivi(Expression.value1, Expression.operator, Expression.value2);
            }
        }
        return 0;
    }
}