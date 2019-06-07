package nest.poc.demo.springboot2swagger2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nest.poc.demo.springboot2swagger2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
