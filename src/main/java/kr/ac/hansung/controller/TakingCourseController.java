package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CourseService;

@Controller
public class TakingCourseController {
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value="/takingcourse", method=RequestMethod.GET)
	public String sugangCourse(Model model, Course course) {
		
		List<Course> getDivisionSum = courseService.getDivisionSum();
		model.addAttribute("getDivisionSum", getDivisionSum);
	
		return "takingcourse";
	}
	
	@RequestMapping(value="/takingcourse_register", method=RequestMethod.GET)
	public String sugangRegister(Model model, Course course) {
		
		System.out.println(course);
		courseService.insert(course);
		
		return "takingcourse_register";
	}
}
