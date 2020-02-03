package calculatorclass;

public class Main
{
    public static void main(String[] args)
    {
        CalculatorClass[] equations = new CalculatorClass[4];
        equations[0] = create(99.0d, 56.5687d, 'd');
        equations[1] = create(129.089d, 78.0d, 'a');
        equations[2] = create(100.0d, 12.9100000017d, 's');
        equations[3] = create(09876.0d, 123.123d, 'm'); 

        for (CalculatorClass equation: equations) 
        {
            equation.execute();
            System.out.println("Results = ");
            System.out.println(equation.getResults());  
        }
    }

    public static CalculatorClass create(double values1, double values2, char operationCode)
    {
        CalculatorClass equation = new CalculatorClass();
        equation.setValues1(values1);
        equation.setValues2(values2);
        equation.setOperationCode(operationCode);

        return equation;
    }

}