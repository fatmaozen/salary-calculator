public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("e1", 20000, 45, 2018);
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.print();
    }
}
