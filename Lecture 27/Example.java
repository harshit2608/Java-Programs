import java.util.Scanner;

class Example
{
    public static void main(String[] args)
    {
        int arr[] =new int[5];
        System.out.println("Enter 5 numbers");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("Arr[ " + i + " ] = " + arr[i]);
        }
    }
}