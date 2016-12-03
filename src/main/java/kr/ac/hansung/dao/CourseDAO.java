package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.ac.hansung.model.Course;

@Component
public class CourseDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from course";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	public int getSumCredit() {
		String sqlStatement = "select sum(credit) from course";
		int total = jdbcTemplateObject.queryForObject(sqlStatement,Integer.class);
		return total;
	}
	
	public Course getCourse(String name) {
		String sqlStatement = "select * from course where year = ?";
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[]{name}, new CourseMapper());
	}
	
	public List<Course> getCourseByYearSemester(int year, int semester) {
		String sqlStatement = "select * from course where year=? and semester=?";
		return  jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester}, new CourseMapper());
	}
	
	public List<Course> getCourse() {
		String sqlStatement = "select * from course";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper()); 
	}
	
	public List<Course> getDivisionSum() {
		String sqlStatement = "select division, sum(credit) from course group by division";
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();
				course.setDivision(rs.getString("division"));
				course.setCredit(rs.getInt("sum(credit)"));
				return course;
			}
		});
	}
	
	public List<Course> getYearSemesterSum() {
		String sqlStatement = "select year, semester, sum(credit) from course group by year, semester";
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Course>() {
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();
				course.setYear(rs.getInt("year"));
				course.setSemester(rs.getInt("semester"));
				course.setCredit(rs.getInt("sum(credit)"));
				return course;
			}
		});
	}
	
	public boolean insert(Course course) {
		int id = course.getId();
		int year = course.getYear();
		int semester = course.getSemester();
		String course_code = course.getCourse_code();
		String course_name = course.getCourse_name();
		String division = course.getDivision();
		int credit = course.getCredit();
		
		String sqlStatement = "insert into course (id, year, semester, course_code, course_name, division, credit) values (?,?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {id, year, semester, course_code, course_name, division, credit} )==1);
	}
}