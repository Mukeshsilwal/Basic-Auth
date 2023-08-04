package com.info.controller;
import com.info.payloads.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.info.service.StudentService;


@Controller
@RequestMapping("/")
public class StudentController {
	

	private StudentService studentService;
	public StudentController(StudentService studentService){

		super();
		this.studentService=studentService;
	}


	@GetMapping("/map")
	public String getAll(Model model) {
		model.addAttribute("students",studentService.getAllStudents());

		return "view";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model,StudentDto studentDto) {
		
//		this object is introduce in order to hold studentDto data
		model.addAttribute("student", studentDto);
		return "Create_student";
	}
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") StudentDto studentDto){
		studentService.saveStudent(studentDto);
		return "redirect:/map";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable int id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")//for edit
	public String updateStudent(@PathVariable int id,@ModelAttribute StudentDto studentDto) {
		studentService.updateStudent(studentDto);
		return "redirect:/map";
	}
	
	@GetMapping("/students/{id}")//For delete
	public String deleteStudent(@PathVariable int id,Model model) {
		studentService.deleteById(id);
		return "redirect:/map";
	}

	@GetMapping("/Login")
	public String findByEmail(){
		return "Login";
	}
	}


