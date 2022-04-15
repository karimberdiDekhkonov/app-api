package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapi.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
