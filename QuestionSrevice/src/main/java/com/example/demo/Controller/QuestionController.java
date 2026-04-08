package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.Question;
import com.example.demo.Repo.QuestionRepo;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	QuestionRepo repo;

	@PostMapping("/")
	public Question addQuestion(@RequestBody Question question) {
		return repo.save(question);
	}

	@GetMapping("/")
	public List<Question> getAllQuestions() {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public Question getQuestionById(@PathVariable int id) {
		return repo.findById(id).orElse(null);
	}

	@PutMapping("/update/{id}")
	public Question updateQuestion(@PathVariable int id, @RequestBody Question newQuestion) {
		Question q = repo.findById(id).orElse(null);

		if (q != null) {
			q.setQname(newQuestion.getQname());
			q.setQid(newQuestion.getQid());
			return repo.save(q);
		}
		return null;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteQuestion(@PathVariable int id) {
		repo.deleteById(id);
		return "Question deleted with id: " + id;
	}
}