package com.aurionpro.service;

import com.aurionpro.dao.FeeDao;

public class FeesService {
	private FeeDao feeDao = null;
	
	public FeesService() {
		feeDao = new FeeDao();
	}
	
	public void paidFees() {
		feeDao.paidFees();
	}
	
	public void pendingFees() {
		feeDao.pendingFees();
	}
	
	public double feeByStudentId(int studentId) {
		return feeDao.feeByStudentId(studentId);
	}
	
	public void feeByCourseId(int courseId) {
		feeDao.feeByCourseId(courseId);
	}
	
	public void updateFeeOfCourse(int courseId, double courseFee) {
		feeDao.updateFeeOfCourse(courseId, courseFee);
	}
	
	public void totalEarning() {
		feeDao.totalEarning();
	}
	
	public void addFeeForStudent(double amount, int studentId) {
		feeDao.addFeeForStudent(amount, studentId);
	}
}
