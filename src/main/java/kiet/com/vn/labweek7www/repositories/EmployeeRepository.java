package kiet.com.vn.labweek7www.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kiet.com.vn.labweek7www.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}