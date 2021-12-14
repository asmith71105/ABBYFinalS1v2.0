//This class creates the if statements/while loops that will determine which of the five methods will run

public class MethodCreation {
    //Brain Methods
    public static void main(String[] args) {
        if (Expression.getOperator().equals(Expression.operators[0]))
        {
            SetUp.calcAdd(Expression.value1, Expression.value2);
        } //end if loop
        else if (Expression.getOperator().equals(Expression.operators[1]))
        {
            SetUp.calcSub(Expression.value1, Expression.value2);
        }//end else if loop
        else if (Expression.getOperator().equals(Expression.operators[2]))
        {
            SetUp.calcMult(Expression.value1, Expression.value2);
        } //end else if loop
        else if (Expression.getOperator().equals(Expression.operators[3]))
        {
            while (Expression.getValue1() < 0 && Expression.getValue2() == 0 || Expression.getValue1() > 0 && Expression.getValue2() == 0)
            {
                SetUp.calcError(Expression.value1, Expression.operator, Expression.value2);
            } //end while loop
            while (Expression.getValue1() >= 0 && Expression.getValue2() != 0 || Expression.getValue1() <= 0 && Expression.getValue2() != 0)
            {
                SetUp.calcDivi(Expression.value1, Expression.value2);
            } //end while loop
        }//end else if statement
    } //end main method
} //end MethodCreation class