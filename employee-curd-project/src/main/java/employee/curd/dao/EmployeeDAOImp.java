package employee.curd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import employee.curd.beans.Employee;
import employee.curd.db.DBConnection;

public class EmployeeDAOImp implements EmployeeDAO {

	private static Connection connection = DBConnection.getConnection();
	@Override
	public boolean insertEmployee(Employee employee) {
			try {
				String SQL = "insert into employee (name, email, phone, address) values (?, ?, ?, ?)";
				PreparedStatement pstmt = connection.prepareStatement(SQL);
				pstmt.setString(1, employee.getName());
				pstmt.setString(2, employee.getEmail());
				pstmt.setString(3, employee.getPhone());
				pstmt.setString(4, employee.getAddress());
				
				int res = pstmt.executeUpdate();
				
				return res == 1 ? true : false;	
			} catch (Exception e) { 
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		try {
			String SQL = "update employee set name = ?, email = ?, phone = ?, address = ?";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("adi");
		employee.setEmail("adiv@gmail.com");
		employee.setPhone("794823450");
		employee.setAddress("beng");
		 
		EmployeeDAOImp employeeDAOImp = new EmployeeDAOImp();
		
		System.out.println(employeeDAOImp.insertEmployee(employee));
		
		
		
		
		
	}

}
