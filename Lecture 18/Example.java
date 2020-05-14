class Box
{
    private int L, B, H;

    public void setDimension(int L, int B, int H)
    {
        this.L=L;
        this.B=B;
        this.H=H;
    }
}

public class Example
{
    public static void main(String[] args)
    {
        Box b1 = new Box();
        b1.setDimension(12,24,20);
    }
}