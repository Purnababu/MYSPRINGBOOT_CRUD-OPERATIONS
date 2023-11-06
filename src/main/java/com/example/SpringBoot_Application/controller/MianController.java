package com.example.SpringBoot_Application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot_Application.entity.Students;
import com.example.SpringBoot_Application.repo.Studentrepo;

@RestController
public class MianController {

	@Autowired
	private Studentrepo stu;

	private Students sss;

	   @GetMapping("/list")
	 public ResponseEntity <List<Students>> getliset(){
		  return new ResponseEntity<>(stu.findAll(), HttpStatus.OK);
	 }

	
	
	@PostMapping("/add")
	public ResponseEntity<Students> savestudent(@RequestBody Students sttd) {
		return new ResponseEntity<>(stu.save(sttd), HttpStatus.CREATED);
	}

	

	@GetMapping("/list/{id}")
	public ResponseEntity<Students> getstudent(@PathVariable int id) {
		Optional<Students> st = stu.findById(id);
		if (st.isPresent()) {
			return new ResponseEntity<>(st.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	

	@PutMapping("/update/{id}")
	public ResponseEntity<Students> updatestudent(@PathVariable int id, @RequestBody Students std) {
		Optional<Students> tt = stu.findById(id);
		if (tt.isPresent()) {
			tt.get().setName(std.getName());
			tt.get().setPhno(std.getPhno());
			tt.get().setCity(std.getCity());

			return new ResponseEntity<>(stu.save(tt.get()), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


	@DeleteMapping("/del/{id}")
	public ResponseEntity<Void> delet(@PathVariable int id) {
		Optional<Students> jj = stu.findById(id);
		if (jj.isPresent()) {
			stu.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

}
