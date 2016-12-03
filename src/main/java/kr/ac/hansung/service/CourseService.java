package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;

@Service("courseService")
public class CourseService {
	private CourseDAO courseDAO;

	@Autowired
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	public List<Course> getCurrent() {
		return courseDAO.getCourse();
	}
	
	public List<Course> getDivisionSum() {
		return courseDAO.getDivisionSum();
	}

	public int getSumCredit() {
		return courseDAO.getSumCredit();
	}
	
	public List<Course> getSemesterList() {
		return courseDAO.getYearSemesterSum();
	}
	public List<Course> getCourseByYearSemester(int year, int semester) {
		return courseDAO.getCourseByYearSemester(year, semester);
	}
	
	public void insert(Course course) {
		courseDAO.insert(course);
	}
}
