public class FulltimeEmployee extends Employee{
    private int monthlySalary;

    FulltimeEmployee(String name, int id, int day, int month, int year,int monthlySalary) {
        super(name, id, day, month, year);
        this.monthlySalary=monthlySalary;
    }


    public int getSalary() {
        return monthlySalary;
    }

    public void setSalary(int salary) {
        this.monthlySalary = salary;
    }
}
