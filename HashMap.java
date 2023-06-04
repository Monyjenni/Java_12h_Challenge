import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {

    private static final Map<Integer, Employee> employees = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add some initial employees to the map
        employees.put(1, new Employee(1, "John Doe", "Sales"));
        employees.put(2, new Employee(2, "Jane Smith", "Marketing"));
        employees.put(3, new Employee(3, "Bob Johnson", "Accounting"));

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("--------------------------");
            System.out.println("Please select an option:");
            System.out.println("a. Display all employees");
            System.out.println("b. Add a new employee");
            System.out.println("c. Delete employee by id");
            System.out.println("d. Update employee by id");
            System.out.println("e. Search employee by id");
            System.out.println("f. Exit");

            String option = scanner.nextLine();

            switch (option) {
                case "a":
                    displayAllEmployees();
                    break;
                case "b":
                    addNewEmployee(scanner);
                    break;
                case "c":
                    deleteEmployeeById(scanner);
                    break;
                case "d":
                    updateEmployeeById(scanner);
                    break;
                case "e":
                    searchEmployeeById(scanner);
                    break;
                case "f":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        }
    }

    private static void displayAllEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    private static void addNewEmployee(Scanner scanner) {
        System.out.println("Please enter the new employee's id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter the new employee's name:");
        String name = scanner.nextLine();
        System.out.println("Please enter the new employee's department:");
        String department = scanner.nextLine();

        Employee newEmployee = new Employee(id, name, department);
        employees.put(id, newEmployee);

        System.out.println("New employee added: " + newEmployee);
    }

    private static void deleteEmployeeById(Scanner scanner) {
        System.out.println("Please enter the id of the employee to delete:");
        int id = Integer.parseInt(scanner.nextLine());

        Employee removedEmployee = employees.remove(id);

        if (removedEmployee != null) {
            System.out.println("Employee successfully deleted: " + removedEmployee);
        } else {
            System.out.println("No employee found with id " + id);
        }
    }

    private static void updateEmployeeById(Scanner scanner) {
        System.out.println("Please enter the id of the employee to update:");
        int id = Integer.parseInt(scanner.nextLine());

        Employee existingEmployee = employees.get(id);

        if (existingEmployee != null) {
            System.out.println("Please enter the updated name (or press Enter to keep current value):");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                existingEmployee.setName(name);
            }

            System.out.println("Please enter the updated department (or press Enter to keep current value):");
            String department = scanner.nextLine().trim();
            if (!department.isEmpty()) {
                existingEmployee.setDepartment(department);
            }

            System.out.println("Employee successfully updated: " + existingEmployee);
        } else {
            System.out.println("No employee found with id " + id);
        }
    }

    private static void searchEmployeeById(Scanner scanner) {
        System.out.println("Please enter the id of the employee to search:");
        int id = Integer.parseInt(scanner.nextLine());

        Employee existingEmployee = employees.get(id);

        if (existingEmployee != null) {
            System.out.println("Employee found: " + existingEmployee);
        } else {
            System.out.println("No employee found with id " + id);
        }
    }
