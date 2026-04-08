package com.example.demo.Service;

import java.util.List;
import com.example.demo.Model.Question;

public interface QuestionService {

	Question saveQuestion(Question question);

	List<Question> getAllQuestions();

	Question getQuestionById(int id);

	void deleteQuestion(int id);
	
	void QuestionByQuiz(int id);
}