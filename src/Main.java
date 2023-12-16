import java.util.*;

public class Main  {
    public static void main(String[] args) {
        ArrayList <Employee> employees= new ArrayList<>();
        ArrayList <Integer> ids= new ArrayList<>();

        System.out.println(ids);
        Employee fulltimeEmployee1=inputFulltime(ids);
        Employee fulltimeEmployee2=inputFulltime(ids);
        Employee fulltimeEmployee3=inputFulltime(ids);

        Employee parttimeEmployee1=inputPartTime(ids);
         Employee parttimeEmployee2=inputPartTime(ids);
        Employee parttimeEmployee3=inputPartTime(ids);

        employees.add(fulltimeEmployee1);
        employees.add(fulltimeEmployee2);
        employees.add(fulltimeEmployee3);
        employees.add(parttimeEmployee1);
        employees.add(parttimeEmployee2);
        employees.add(parttimeEmployee3);

        printEmployeeDetails(employees);
        printEmployeesByBirthYear(employees,2000);

        Collections.sort(employees);
        for(Employee employee:employees){
            System.out.println(employee.id);
            System.out.println(employee.getName());
            System.out.println(employee.getSalary());
        }

    }

    public static ParttimeEmployee inputPartTime(ArrayList <Integer> ids){
        Scanner scanner= new Scanner(System.in);
        System.out.println("FullTime Employee:");

        System.out.println("What is your name");
        String name= scanner.nextLine();
        int id;
        do {
            System.out.println("ID:");
            id = scanner.nextInt();

            if (ids.contains(id)) {
                System.out.println("This ID already exists. Please enter a different one.");
            }
        } while (ids.contains(id));
        ids.add(id);
        System.out.println(ids);
        int day,month,year;
        System.out.println("Birth date day:");
        day=scanner.nextInt();
        System.out.println("Birth date month:");
        month=scanner.nextInt();
        System.out.println("Birth date yeaer:");
        year=scanner.nextInt();
        System.out.println("hour:");
        int hour=scanner.nextInt();
        System.out.println("hourly rate:");
        int hourlyRate=scanner.nextInt();
        return new ParttimeEmployee(name,id,day,month,year,hour,hourlyRate);
    }
    public static FulltimeEmployee inputFulltime(ArrayList <Integer> ids){
        Scanner scanner= new Scanner(System.in);
        System.out.println("FullTime Employee:");
        System.out.println("What is your name");
        String name= scanner.nextLine();
        int id;


        do {
            System.out.println("ID:");
            id = scanner.nextInt();

            if (ids.contains(id)) {
                System.out.println("This ID already exists. Please enter a different one.");
            }
        } while (ids.contains(id));
        ids.add(id);
        System.out.println(ids);

        int day,month,year;
        System.out.println("Birth date day:");
        day=scanner.nextInt();
        System.out.println("Birth date month:");
        month=scanner.nextInt();
        System.out.println("Birth date yeaer:");
        year=scanner.nextInt();
        System.out.println("Monthly salary:");
        int monthlySalary=scanner.nextInt();

        return new FulltimeEmployee(name,id,day,month,year,monthlySalary);
    }

    private static void printEmployeeDetails(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            if (employee instanceof FulltimeEmployee) {
                System.out.println("Fulltime:");
            } else if (employee instanceof ParttimeEmployee) {
                System.out.println("Parttime");
            }

            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.id);
            System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
    private static void printEmployeesByBirthYear(ArrayList<Employee> employees, int year) {
        System.out.println("Employees with birth year " + year + ":");
        for (Employee employee : employees) {
            if (employee.getDateOfBirth().get(Calendar.YEAR) == year) {
                System.out.println("Name: " + employee.getName());
                System.out.println("ID: " + employee.id);
                System.out.println("Date of Birth: " + employee.getDateOfBirth().getTime());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println();
            }
        }
    }


}