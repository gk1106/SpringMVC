package emp.Controller;

import com.dao.EmployeeDAO;
import com.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
//      Employee e1 = new Employee();
//      e1.setName("Amar");
//      e1.setEmail("amar@1223gmail.com");
//      e1.setSal(18000.0);
//      e1.setPhno(9551632613l);
//      
		EmployeeDAO dao = new EmployeeDAO();
//      Employee e = dao.saveEmployee(e1);
////      System.out.println(e);

		Employee e = new Employee();
		e.setName("Akash");
//		e.setSal(16500);
//		e.setPhno(9551632612l);
		Employee updateEmployee = dao.updateEmployee(e, 2);
		System.out.println(updateEmployee);

		// Employee e2 = dao.deleteEmployee(4);
//	    System.out.println(e2);
	}

}
