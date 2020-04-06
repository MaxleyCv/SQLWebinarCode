package ua.lviv.iot.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.rest.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}