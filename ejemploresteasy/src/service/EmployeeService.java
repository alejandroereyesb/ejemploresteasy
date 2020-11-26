package service;

import javax.ws.rs.core.Response;

import model.Employee;

public interface EmployeeService {

	public Response addEmployee(Employee e);
	
	public Response deleteEmployee(int id);
	
	public Employee getEmployee(int id);
	
	public Employee[] getAllEmployees();

}