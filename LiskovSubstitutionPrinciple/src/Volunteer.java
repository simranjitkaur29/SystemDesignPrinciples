public class Volunteer extends Employee{
    protected Volunteer(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        throw new RuntimeException("Volunteers don't draw salary");

    }
}
