public class Example
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Employee e1 = new Employee();
        s1.setRollno(100);
        s1.setName("rahul");
        s1.setAge(18);
        e1.setEmpID(190347);
        System.out.println("Roll no " +s1.getRollno());
        System.out.println("Name is " + s1.getName());
        System.out.println("Age is " + s1.getAge());
        System.out.println("Emp ID is " + e1.getEmpID());
    }    
}