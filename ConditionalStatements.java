public class ConditionalStatements
{
    public static void main(String[] args)
    {
        //NEW CODE
        double[] values1 = {100.0d, 25.0d, -15.0d, 11.0d};
        double[] values2 = {50.0d, 92.5d, 6.78d, 44.987d};
        char[] operationCode = {'d', 'a', 's', 'm'};
        double[] results = new double [operationCode.length];

        for (int i =0; i < operationCode.length; i++)
        {
            switch (operationCode[i])
            {
                case 'a' :
                    {
                        results[i] = values1[i] + values2[i];
                    }
                    break;

                case 's' :
                    {
                        results[i] = values1[i] - values2[i];
                    }
                    break;

                case 'd' :
                    {
                        if (values2[i] != 0.0d )
                        {
                            results[i] = values1[i] / values2[i];
                        }
                        else
                        {
                            results[i] = 0.0d;
                        }
                    }
                    break;

                case  'm' :
                    {
                        results[i] = values1[i] * values2[i];
                    }
                    break;

                default : 
                    {
                        System.out.println("Error - invalid operatorCode");
                        results[i] = 0.0d;
                    }
                    break;

            }
        }

        for (double theResults : results) 
        {
            System.out.println("Results = ");
            System.out.println(theResults);  
        }


        /*==========================================*/
            //OLD CODE
            /*==========================================*/
            /*
            double value1 = 100.0d;
            double value2 = 0.0d;
            double result;
            char operatorCode = 'd';

            if (operatorCode == 'a')
            {
                result = value1 + value2;
            }
            else if (operatorCode == 's')
            {
                result = value1 - value2;
            }
            else if (operatorCode == 'd')
            {
                if (value2 != 0.0d )
                {
                    result = value1 / value2;
                }
                else
                {
                    result = 0.0d;
                }
            }
            else if (operatorCode == 'm')
            {
                result = value1 * value2;
            }
            else 
            {
                System.out.println("Error - invalid operatorCode");
                result = 0.0d;
            }

            System.out.print(result);
        */
    }
}