package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.Appoinment;

public interface AppoinmentRepository extends JpaRepository<Appoinment, Long> {
}

