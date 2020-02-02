public class Operators
{
    public static void main(String[] args)
    {
        /*Decleration of variables */
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        //Arithmetic Operations1
        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        //Arithmetic Operations2
        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        /**Printing the values on screen */
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}