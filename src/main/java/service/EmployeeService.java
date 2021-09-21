package service;

import base.service.BaseService;
import domain.Employee;

public interface EmployeeService extends BaseService<Employee, Long> {

    void firstMenu();

    void validateEmployee();

    void employeeMenu();

    void activeAccount();
}
