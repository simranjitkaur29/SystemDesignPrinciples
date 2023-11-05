public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee(0);
        CalculateSalary calculateSalary=new CalculateSalary();
        PrintPerformanceReport printPerformanceReport=new PrintPerformanceReport();
        System.out.println(calculateSalary.calculateSalary(employee));
        System.out.println(printPerformanceReport.printPerformanceReport(employee));


    }
}