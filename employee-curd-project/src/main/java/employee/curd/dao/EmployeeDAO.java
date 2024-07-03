package employee.curd.dao;

import java.util.List;

import employee.curd.beans.Employee;

public interface EmployeeDAO {
	
	//In this we need to promise the method we need
/*    add the pure abstract method for implementing 
 *    the method
 * 
 * 
 * */
	
	//Insert Employee;
	
	public boolean insertEmployee(Employee employee); 
	
	// Update Employee;
	
	public boolean updateEmployee(Employee employee);
	
	// Delete Employee;
	
	public boolean deleteEmployee(int employeeId);
	
	// Get All Employee;
	
	public List<Employee> getAllEmployee();
	
	// Get one employee;
	
	public Employee getEmployee(int employeeId); 

}
