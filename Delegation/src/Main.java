
public class Main {
    public static void main(String[] args) {
        Employee ryan = new Employee(new OnBenchImpl(), new AllocatesImpl());
        ryan.benchEmployee();
        ryan.allocatedEmployee();
    }
}