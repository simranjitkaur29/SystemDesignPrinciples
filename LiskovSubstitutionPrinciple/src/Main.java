import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SalaryDistrubuter salaryDistrubuter=new SalaryDistrubuter();
        List<Employee>employee=new ArrayList<>();
        employee.add(new InternEmployee(1));
        employee.add(new Volunteer(2));
        employee.add(new ContractEmployee(3));
        salaryDistrubuter.distributeSalary(employee);


    }
}