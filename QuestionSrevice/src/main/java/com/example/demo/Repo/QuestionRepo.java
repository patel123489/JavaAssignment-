package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

	List<Question> findByQuiz(String qid);
}