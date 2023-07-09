public class Main {
  public static void main(String[] args) {
      Person person = new Person ("Mony", 19, 'F');
      System.out.println("Person Class");
      System.out.println("Person: " + person.getName() + " " + "Age: " + person.getAge() + " " + "Gender: " + person.getGender() + " ");

      Employee employee = new Employee("Mony", 19, 'F', 18246, "Frontend", 300);
      System.out.println("Employee Extend Class");
      System.out.println("Employee's Name: " + person.getName() + " " + "Age: " + person.getAge() + " " + "Gender: " + person.getGender() + " " + "EmployeeID: " + employee.getEmployeeID() + " " + "JobTitle: " + employee.getJobTitle() +" "+ "Salary: " + employee.getSalary());

      Customer customer = new Customer("Jcennie",19,'F',18245,"LA",123);
      System.out.println("Customer Extend Class");
      System.out.println("Customer's Name: " + person.getName()+ " " + "Age: " + person.getAge()  + " " + "Gender: " +"  " + person.getGender() + "CustomerID :" + customer.getCustomerID () + "  " + "Address" + " " + customer.getAddress() + "  " + " Phonenumber: " + customer.getPhonenumber ());
      }

}
public class Main {
  public static void main(String[] args) {
      Person person = new Person ("Mony", 19, 'F');
      System.out.println("Person Class");
      System.out.println("Person: " + person.getName() + " " + "Age: " + person.getAge() + " " + "Gender: " + person.getGender() + " ");

      Employee employee = new Employee("Mony", 19, 'F', 18246, "Frontend", 300);
      System.out.println("Employee Extend Class");
      System.out.println("Employee's Name: " + person.getName() + " " + "Age: " + person.getAge() + " " + "Gender: " + person.getGender() + " " + "EmployeeID: " + employee.getEmployeeID() + " " + "JobTitle: " + employee.getJobTitle() +" "+ "Salary: " + employee.getSalary());

      Customer customer = new Customer("Jcennie",19,'F',18245,"LA",123);
      System.out.println("Customer Extend Class");
      System.out.println("Customer's Name: " + person.getName()+ " " + "Age: " + person.getAge()  + " " + "Gender: " +"  " + person.getGender() + "CustomerID :" + customer.getCustomerID () + "  " + "Address" + " " + customer.getAddress() + "  " + " Phonenumber: " + customer.getPhonenumber ());
      }





}