package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.EmployeeDAOImpl;
import com.rays.dao.EmployeeDAOInt;
import com.rays.dto.EmployeeDTO;

@Service
@Transactional
public class EmployeeServiceImpl extends BaseServiceImpl<EmployeeDTO, EmployeeDAOInt> implements EmployeeServiceInt {

	@Autowired
	EmployeeDAOImpl employeeDAOImpl;
}