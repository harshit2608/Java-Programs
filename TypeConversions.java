public class TypeConversions
{
    public static void main(String[] args)
    {
        float floatValue = 1.0f;
        double doubleValue  = 4.0d;
        byte byteValue = 7;
        short shortValue = 9;
        long longValue = 13;

        /*Here we have to do explicit conversion because java could not perform long to short conversion implicitly*/
        short result1 = (short)longValue;

        /*The code will show error cause of implicit coonversion of long to short
        short  result2 = byteValue - longValue;
        */

        float result3 = longValue + floatValue;
        int result4  = (int)(byteValue / doubleValue);
        long result5 = (long)(doubleValue * shortValue);

        //The java compiler will print success if the conversion happens otherwise it will stop
        System.out.println(result1);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println("SUCCESS");
    }
}