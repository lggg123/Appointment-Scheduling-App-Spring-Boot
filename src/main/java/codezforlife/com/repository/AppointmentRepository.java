package main.java.codezforlife.com.repository;

import main.java.codezforlife.com.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    
}
