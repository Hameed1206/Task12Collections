package comm.example.hrTest;
//QUE 1
// Import the Employee class from the com.example.hr package
import com.example.hr.Employee;

public class EmployeeTest {
    
        public static void main(String[] args) {
        
        // Create an instance of the Employee class
        Employee employee = new Employee();
        
        // Call the printName method of the Employee class and pass the employee's name
        employee.printName("Guvi Geek");
        
        // Call the printID method of the Employee class and pass the employee's ID
        employee.printID(897969);
        
        // Call the printSalary method of the Employee class and pass the employee's salary
        employee.printSalary(75000);
    }
}
