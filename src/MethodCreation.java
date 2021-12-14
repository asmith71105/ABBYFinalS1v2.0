//This class creates the if statements/while loops that will determine which of the five methods the primary brain
//method, Calculate, will call

public class MethodCreation
{
    //Brain Methods
    public static void main(String[] args)
    {

    }

    public static int Calculate(Expression expression1)
    {
        if (Expression.getOperator().equals(Expression.operators[0]))
        {
            SetUp.calcAdd(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals(Expression.operators[1]))
        {
            SetUp.calcSub(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals(Expression.operators[2]))
        {
            SetUp.calcMult(Expression.value1, Expression.operator, Expression.value2);
        }
        else if (Expression.getOperator().equals(Expression.operators[3]))
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