import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args) {

        Map<Integer, Map<String, String>> employees = new HashMap<>();

        addEmployee(employees, 1, "Chan Dara", "ITE");
        addEmployee(employees, 2, "Sok Sophea", "BIOE");
        addEmployee(employees, 3, "Keo Tola", "TEE");

        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Display the menu and process user input
        while (choice != 6) {
            System.out.println("1. Display all employees");
            System.out.println("2. Add a new employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Update employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayEmployees(employees);
                    break;
                case 2:
                    addNewEmployee(employees, input);
                    break;
                case 3:
                    deleteEmployee(employees, input);
                    break;
                case 4:
                    updateEmployee(employees, input);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
    private static void addEmployee(Map<Integer, Map<String, String>> employees, int id, String name, String department) {
        Map<String, String> employeeData = new HashMap<>();
        employeeData.put("name", name);
        employeeData.put("department", department);
        employees.put(id, employeeData);
    }
    private static void displayEmployees(Map<Integer, Map<String, String>> employees) {
        System.out.println("Employee ID | Employee Name | Department");
        for (Map.Entry<Integer, Map<String, String>> entry : employees.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue().get("name");
            String department = entry.getValue().get("department");
            System.out.printf("%11d | %-13s | %s\n", id, name, department);
        }
    }
    private static void addNewEmployee(Map<Integer, Map<String, String>> employees, Scanner input) {
        System.out.print("Enter the new employee's ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter the new employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter the new employee's department: ");
        String department = input.nextLine();

        addEmployee(employees, id, name, department);
        System.out.println("Employee added successfully.");
    }

    private static void deleteEmployee(Map<Integer, Map<String, String>> employees, Scanner input) {
        System.out.print("Enter the employee ID to delete: ");
        int id = input.nextInt();
        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee with ID " + id + " deleted successfully.");
        } else {
            System.out.println("No employee found with ID " + id + ".");
        }
    }
    private static void updateEmployee(Map<Integer, Map<String, String>> employees, Scanner input) {
        System.out.print("Enter the employee ID to update: ");
        int id = input.nextInt();
        input.nextLine(); // consume the remaining newline character

        if (employees.containsKey(id)) {
            Map<String, String> employeeData = employees.get(id);
            System.out.println("Enter the updated name for employee with ID " + id + ": ");
            String name = input.nextLine();
            employeeData.put("name", name);

            System.out.println("Enter the updated department for employee with ID " + id + ": ");
            String department = input.nextLine();
            employeeData.put("department", department);

            System.out.println("Employee with ID " + id + " updated successfully.");
        } else {
            System.out.println("No employee found with ID " + id + ".");
        }
    }
}