package StreamApi;

public class Employee
{
    static int numOfObject = 0;
    public Employee(){
        numOfObject++;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        Employee e7 = new Employee();
        System.out.println("The number of objects is: " + numOfObject);
    }
}
