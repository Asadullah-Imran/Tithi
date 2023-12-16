import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String name;
    int id;
    private Calendar dateOfBirth;
    Employee(String name, int id,int day,int month,int year){
        this.name=name;
        this.id=id;
        this.dateOfBirth=Calendar.getInstance();
        this.dateOfBirth.set(year,month,day);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary(){
        return 0;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getSalary()>o.getSalary()){
            return 1;
        }else if(this.getSalary()<o.getSalary()){
            return -1;
        }
        return 0;
    }
}
