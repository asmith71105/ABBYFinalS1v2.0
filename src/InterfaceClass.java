public class InterfaceClass implements Comparable
{
    public int compareTo(Object num)
    {
        if(Math.abs(Expression.value1) > Math.abs(Expression.value2))
        {
            return Math.abs(Expression.value1);
        } //end if statement
        else {
            return Math.abs(Expression.value2);
        } //end else statement
    } //end interface compareTo
} //end InterfaceClass class