
public class Employee implements OnBench, Allocates {

    OnBench onBench;
    Allocates allocates;

    Employee(OnBench onBench, Allocates allocates){
        this.onBench = onBench;
        this.allocates = allocates;
    }

    @Override
    public void benchEmployee() {
        onBench.benchEmployee();
    }

    @Override
    public void allocatedEmployee() {
        allocates.allocatedEmployee();
    }
}

