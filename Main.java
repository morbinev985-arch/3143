//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook =new EmployeeBook();

        employeeBook.createEmployee("Иванов Иван Иванович", 1, 50);
        employeeBook.createEmployee("Сергеев Сергей Сергеевич", 3, 100);
        employeeBook.createEmployee("Алексеев Алексей Алексеевич", 2, 70);
        employeeBook.createEmployee("Степанов Степан Степанович", 3, 140);
        employeeBook.createEmployee("Попов Михаил Игоревич", 1, 400);
        employeeBook.createEmployee("Гаврилова Ольга Михайловна", 2, 350);
        employeeBook.createEmployee("Григорьева Юлия Александровна", 1, 300);
        employeeBook.createEmployee("Сидоров Кирилл Михайлович", 3, 350);
        employeeBook.createEmployee("Волков Егор Константинович", 1, 250);
        employeeBook.createEmployee("Романова Наталья Степановна", 2, 50);
        employeeBook.createEmployee("Орлов Тимофей Петрович", 3, 200);


        System.out.println("printEmployees");
        employeeBook.printEmployees();

        System.out.println("printDeportment");

        System.out.println("printDeportment: 1");

        System.out.println("printFullNames");

        System.out.println("printEmployees");
        employeeBook.printEmployees();

        System.out.println("printEmployeesWithLessSalaryThan");

        System.out.println("printEmployeesWithLessSalaryThan");

        employeeBook.calculateTaxes("PROPORTIONAL");
        System.out.println();
        employeeBook.calculateTaxes("PROGRESSIVE");
        System.out.println("end");
    }
    }
