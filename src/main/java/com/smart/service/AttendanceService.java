package com.smart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.AttendanceRepository;
import com.smart.entites.Attendance;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepository repo;
	
	public void saveAttendance(Attendance a) {
		repo.save(a);
	}
}
