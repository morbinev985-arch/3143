public class EmployeeBook {
    private static final Integer DEPARTMENT_COUNT = 3;
    private static final Integer EMPLOYEES_SIZE = 5;
    private static final Employee[] employees = new Employee[EMPLOYEES_SIZE];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public float calculateAverageSalary() {
        float sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public void calculateTaxes(String taxType) {
        System.out.println("Расчет налогов по шкале " + taxType);

        for (Employee employee : employees) {
            if (employee != null) {
                double tax = calculateTaxByEmployee(employee, taxType);
                System.out.printf("Сотрудник: %s, Зарплата: %d, Налог: %.2f%n", employee.getFullName(), employee.getSalary(), tax);
            }
        }
    }

    private double calculateTaxByEmployee(Employee employee, String taxType) {
        switch (taxType.toUpperCase()) {
            case "PROPORTIONAL":
                return employee.getSalary() * 0.13;

            case "PROGRESSIVE":
                int salary = employee.getSalary();
                if (salary <= 150) {
                    return salary * 0.13;
                } else if (salary <= 350) {
                    return salary * 0.17;
                } else {
                    return salary * 0.21;
                }

            default:
                System.out.println("неизвестный тип налогов");
                return 0.0;
        }
    }

    public void increaseSalaryOfDepartment(int departmentId, int percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartmenId() == departmentId) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public void findFirstEmployeeWithHigherSalary(int department, int minSalary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null &&
                    employee.getDepartmenId() == department &&
                    employee.getSalary() > minSalary) {
                break;
            }
        }
    }

    public void findEmployeesWithLowerSalary(int wage, int employeeNumber) {
        int count = 0;
        int index = 0;

        while (index < employees.length && count < employeeNumber) {
            Employee employee = employees[index];
            if (employee != null && employee.getSalary() < wage) {
                employee.printShortInfo();
                count++;
            }
            index++;

            if (count == employeeNumber) {
                break;
            }
        }

            if (count == 0) {
                System.out.println("Сотрудник с указаннами критериями не найден.");
            }
        }

        public boolean containsEmployeeBySalary(Employee targetEmployee) {
        for (Employee employee : employees) {
            if (employee != null && employee.equals(targetEmployee)) {
                    return true;
                    }
                }
                return false;
            }

    public boolean createEmployee(String fullName, int departmentId, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            System.out.println("Хранилище сотрудников заполнено. Нельзя создать нового");
            return false;
        }
        employees[index] = new Employee(fullName, salary, departmentId);
        return true;
    }

    private int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}





