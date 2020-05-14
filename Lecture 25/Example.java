interface i1
{
}

interface i2 
{
}

interface i3 extends i1,i2
{
}

interface i4
{
}

class A
{

}  

class B extends A implements i3,i4
{
    
}

public class Example
{
    public static void main(String[] args)
    {

    }    
}