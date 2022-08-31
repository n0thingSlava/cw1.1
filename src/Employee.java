import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Employee {
    public int Department; //отдел
    public String Fcs; //фио
    public int Salary; //зп
    public int Id;//Порядковый номер
    public static int Counter;

    public Employee(int Department, String Fcs, int Salary) {
        this.Department = Department;
        this.Fcs = Fcs;
        this.Salary = Salary;
        Id = ++Counter;
    }


    public int getDepartment() {
        return Department;
    }

    public int getSalary() {
        return Salary;
    }


    @Override
    public String toString() {
        return "№: " + Id + " ФИО: " + Fcs + " Отдел: " + Department + " ЗП: " + Salary;
    }

        public static void main(String[] args) {
            Employee[] employee = new Employee[10];

            employee[0] = new Employee(1, "Рудольф", 1000); // и таких ровно 10
            employee[1] = new Employee(1, "Афаыа", 2000);
            employee[2] = new Employee(1, "Аыпвып", 3000);
            employee[3] = new Employee(1, "Афыаыфа", 4000);
            employee[4] = new Employee(1, "Ркрукр", 4000);
            employee[5] = new Employee(1, "Ркуццуп", 4000);
            employee[6] = new Employee(1, "Айпйыи", 4000);
            employee[7] = new Employee(1, "Пиылдыв", 6000);
            employee[8] = new Employee(1, "Млыфлафы", 4000);
            employee[9] = new Employee(1, "АФцйдм", 5000);

            IntSummaryStatistics result = Arrays.stream(employee).collect(Collectors.summarizingInt(Employee::getSalary));
            System.out.println("Сумма затрат - " + result.getSum());
            System.out.println("Минимальная ЗП - " + result.getMin());
            System.out.println("Максимальная ЗП - " + result.getMax());
            System.out.println("Средняя ЗП - " + result.getAverage());
            for (Employee e : employee) {
                System.out.println(e);
            }
        }
    }
