package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo f;
	
	//add
	public String add(Student g) {
		f.save(g);
		return "Added";
	}
	
	//get
	public List<Student> getStuDetail(){
		return f.findAll();
	}
	
	//update
	public Student updateStuDetail(Student v) {
		return f.saveAndFlush(v);
	}
	
	//delete
	public void deleteStuDetail(Student v1) {
		f.delete(v1);
	}

}
