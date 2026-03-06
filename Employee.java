import java.util.Objects;

public class Employee {
    private final Integer id;
    private String fullName;
    private Integer salary;
    private Integer departmenId;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmenId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmenId = departmenId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmenId() {
        return departmenId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmenId(Integer departmenId) {
        this.departmenId = departmenId;
    }
    public void printShortInfo(){
        System.out.printf("ФИО: %s, Зарплата: %d%n", fullName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departmenId=" + departmenId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }
}



