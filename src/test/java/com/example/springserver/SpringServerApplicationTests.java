package com.example.springserver;

import com.example.springserver.model.employee.Employee;
import com.example.springserver.model.employee.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao emplyeeDao;

//	@Test
//	void addEmployeeTest() {
//		Employee employee = new Employee();
//		employee.setName("Dima");
//		employee.setLocation("Batumi");
//		employee.setBranch("EE");
//		emplyeeDao.save(employee);
//	}

//	@Test
//	void getAllEmployees(){
//		List<Employee> employees = emplyeeDao.getAllEmployees();
//		System.out.print(employees);
	//}
//	@Test
//	void getAllEmployeesAddDeleteThem(){
//		List<Employee> employees = emplyeeDao.getAllEmployees();
//		for (Employee employee : employees){
//			emplyeeDao.delete(employee);
//		}
//	}
}
