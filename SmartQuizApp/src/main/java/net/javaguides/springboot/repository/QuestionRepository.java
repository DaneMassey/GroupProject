package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Question;
import net.javaguides.springboot.web.dto.QuestionRegistrationDto;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	void save(QuestionRegistrationDto registrationDto);

}
