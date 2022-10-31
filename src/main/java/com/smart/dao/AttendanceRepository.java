package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entites.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
