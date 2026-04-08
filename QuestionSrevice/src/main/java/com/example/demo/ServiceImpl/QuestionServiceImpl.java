package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Question;
import com.example.demo.Repo.QuestionRepo;
import com.example.demo.Service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question saveQuestion(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}

	@Override
	public Question getQuestionById(int id) {
		return questionRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteQuestion(int id) {
		questionRepo.deleteById(id);
	}

	@Override
	public void QuestionByQuiz(int id) {
		// TODO Auto-generated method stub
		
	}
}