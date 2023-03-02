package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService s1;
	
	//get
	@GetMapping("/getstu")
	public List<Student> displayDetail(){
		return s1.getStuDetail();
	}
	
	//post
	@PostMapping("/poststu")
	public String putDetail(@RequestBody Student t) {
		s1.add(t);
		return "Added Family details "+t.getId();
	}
	//put
	@PutMapping("/putstu")
	public Student updateFam(@RequestBody Student fl) {
		return s1.updateStuDetail(fl);
	}
	//delete
	@DeleteMapping("/deletestu")
	public  String deleteInfo(@RequestBody Student w) {
		 s1.deleteStuDetail(w);
		 return "Deleted the Family Details";
	}
	

}
