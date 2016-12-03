package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CourseService;

@Controller
public class CourseController {
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@RequestMapping("/course")
	public String showCourse(Model model, @RequestParam int year, @RequestParam int semester) {
		List<Course> getCourseByYearSemester = courseService.getCourseByYearSemester(year, semester);
		
		model.addAttribute("getCourseByYearSemester", getCourseByYearSemester);
		return "course";
	}
}
