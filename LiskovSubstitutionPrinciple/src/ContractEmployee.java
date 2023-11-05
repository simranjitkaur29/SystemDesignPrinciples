public class ContractEmployee extends Employee {
    protected ContractEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating ContractEmployee SALAry");
        return 0;
    }
}
