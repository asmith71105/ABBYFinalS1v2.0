public class InterfaceClass implements Comparable
{
    public int compareTo(Object num)
    {
        if(Math.abs(Expression.value1) > Math.abs(Expression.value2))
        {
            return Math.abs(Expression.value1);
        }
        else {
            return Math.abs(Expression.value2);
        }
    }
}