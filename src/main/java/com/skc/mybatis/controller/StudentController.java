package com.skc.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
import org.springframework.web.bind.annotation.RequestMapping;

import com.skc.mybatis.domain.Student;
import com.skc.mybatis.service.StudentService;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;

<<<<<<< HEAD
	// 전체 리스트 화면
	@GetMapping
	public String list(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student/list";
	}
		
	//등록 form
	@GetMapping("/new")
	public String createForm(Model model) {

=======
//	list화면: 전체 학생 목록
	@GetMapping
	public String list(Model model) {
		model.addAttribute("students", studentService.getAllStudents());

		return "student/list";
	}

//	등록폼:form화면: 새로운 학생 정보를 입력하기위한 빈화면.
	@GetMapping("/new")
	public String createForm(Model model) {
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
		model.addAttribute("student", new Student());
		return "student/form";
	}

<<<<<<< HEAD
	//등록처리
	@PostMapping
	public String create(@ModelAttribute Student student) {
=======
//	등록처리:학생정보 기록후 저장버튼 클릭을 하면, 학생정보를 insert
	@PostMapping
	public String create(@ModelAttribute Student student) {
//		이미 학생 저장이 완료되요
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
		studentService.createStudent(student);
		return "redirect:/students";
	}

<<<<<<< HEAD
	//수정 form
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudent(id));
		return "student/form";
	}
	
	//수정처리
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Student student) {

=======
//	http://localhost:8080/students/11/edit
//	수정폼
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudent(id));
		return "student/form";
	}

//	수정처리:
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Student student) {
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
		student.setId(id);
		studentService.updateStudent(student);
		return "redirect:/students";
	}
<<<<<<< HEAD
	
	//삭제처리
=======

//	http://localhost:8080/students/11/delete
	// 삭제 처리
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
	@PostMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

<<<<<<< HEAD

}
=======
}
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9
