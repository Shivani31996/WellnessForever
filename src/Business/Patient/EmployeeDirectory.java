/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        if(this.checkIfEmployeeIsUnique(name))
        {
            Employee employee = new Employee();
            employee.setName(name);
            employeeList.add(employee);
            return employee;            
        }
            return null;
    }
    
    public void deleteEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }

    private boolean checkIfEmployeeIsUnique(String username) {
        for(Employee ua : employeeList)
        {
            if(ua.getName().equals(username))
                return false;
        }
        return true;
    }
}