package uz.pdp.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appapi.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Integer> {
}
