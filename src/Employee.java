
public class Employee {
    String name;
    int workHours, hireYear, bonus;
    double salary, tax, raise;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax() {
        if (this.salary > 1000.0) {
            this.tax = salary * 0.03;
        } else {
            this.tax = 0;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = (this.workHours - 40) * 30;
        } else {
            this.bonus = 0;
        }
    }

    void raiseSalary() {
        if ((2021 - this.hireYear) < 10 && (2021 - this.hireYear) >= 2)
            this.raise = salary * 0.05;
        else if ((2021 - this.hireYear) < 20 && (2021 - this.hireYear) >= 10)
            this.raise = salary * 0.1;
        else if ((2021 - this.hireYear) >= 20)
            this.raise = salary * 0.15;
        else
            this.raise = 0;
    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("Çalışanın ismi: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Vergi kesintisi: " + this.tax);
        System.out.println("Bonus ödeneği: " + this.bonus);
        System.out.println("Zam miktarı: " + this.raise);
        System.out.println("Yatırılacak net maaş: " + (this.salary + this.bonus + this.raise - this.tax));
    }

}
