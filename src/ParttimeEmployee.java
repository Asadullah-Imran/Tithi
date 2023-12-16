public class ParttimeEmployee extends Employee{
    int hours;
    int hourlyRate;

    ParttimeEmployee(String name, int id, int day, int month, int year,int hour,int hourlyRate) {
        super(name, id, day, month, year);
        this.hours=hour;
        this.hourlyRate=hourlyRate;
    }


    public void setHours(int h) {
        this.hours = h;
    }

    public void setHourlyRate(int hRate) {
        this.hourlyRate = hRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public int getSalary() {
        return hours*hourlyRate;
    }
}
