class Dummy
{
    public void someFunction()
    {

    }
}

class MoreDummy extends Dummy
{
    public void someFunction()
    {

    }
}

public class Example
{
    private final int x;    //Final instance variable
    private final static int y;     //final static member variable
    
    static
    {
        y=10;
    }
    Example()
    {
        x =90;
    }
    public void fun()
    {
        final int k = 8;        //final local variable
        
    }
    public static void main(String[] args)
    {
        Example e1 = new Example();
    }
}