package calculatorclass;

public class CalculatorClass
{
    private double values1;
    private double values2;
    private double results;
    private char operationCode;

    public double getValues1()
    {
        return values1;
    }
    
    public void setValues1(double values1)
    {
        this.values1 = values1;
    }

    public double getValues2() 
    {
        return values2;
    }
    
    public void setValues2(double values2)
    {
        this.values2 = values2;
    }

    public double getOperationCode()
    {
        return operationCode;
    }

    public void setOperationCode(char operationCode)
    {
        this.operationCode = operationCode;
    }

    public double getResults()
    {
        return results;
    }

    public void execute()
    {
        switch (operationCode) {
        case 'a': {
            results = values1 + values2;
        }
            break;

        case 's': {
            results = values1 - values2;
        }
            break;

        case 'd': {
            if (values2 != 0.0d) {
                results = values1 / values2;
            } else {
                results = 0.0d;
            }
        }
            break;

        case 'm': {
            results = values1 * values2;
        }
            break;

        default: {
            System.out.println("Error - invalid operatorCode");
            results = 0.0d;
        }
            break;
        }
    }
}