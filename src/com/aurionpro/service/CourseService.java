package com.aurionpro.service;

import com.aurionpro.dao.CourseDao;
import com.aurionpro.model.Course;
import com.aurionpro.model.Subject;

public class CourseService {
	private CourseDao courseDao = null;
	
	public CourseService() {
		this.courseDao = new CourseDao();
	}
	
	public void showAllActiveCourses() {
		courseDao.showAllActiveCourses();
	}
	
	public void showAllInactiveCourses() {
		courseDao.showAllInactiveCourses();
	}
	
	public void showAllActiveSubjects() {
		courseDao.showAllActiveSubjects();
	}
	
	public void showAllInactiveSubjects() {
		courseDao.showAllInactiveSubjects();
	}
	
	public void addCourse(Course course) {
		courseDao.addCourse(course);
	}
	
	public void addSubject(Subject subject) {
		courseDao.addSubject(subject);
	}
	
	public void addSubjectIntoCourse(int courseId, int subjectId) {
		courseDao.addSubjectIntoCourse(courseId, subjectId);
	}
	
	public void showAllSubjectsOfCourse(int courseId) {
		courseDao.showAllSubjectsOfCourse(courseId);
	}
	
	public void checkIfCourseExist(int courseId) {
		courseDao.courseExist(courseId);
	}
	
	public void checkIfCourseExist(String courseName) {
		courseDao.courseExist(courseName);
	}
	
	public void deleteCourse(int courseId) {
		courseDao.deleteCourse(courseId);
	}
	
	public void deleteSubject(int subjectId) {
		courseDao.deleteSubject(subjectId);
	}
	
}
