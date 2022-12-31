package com.example.empapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.empapi.entity.EmpEntity;
import com.example.empapi.model.Employee;
import com.example.empapi.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{

	private EmpRepository empRepository;
	
	public EmpServiceImpl(EmpRepository empRepository)
	{
		this.empRepository=empRepository;
	}
	
	@Override
	public Employee createEmployee(Employee employee)
	{
		EmpEntity empEntity = new 	EmpEntity();
		
		BeanUtils.copyProperties(employee,empEntity);
		
		empRepository.save(empEntity);
		
		return employee;
	}
	
	@Override
	public List<Employee> getAllEmp()
	{
		List<EmpEntity> empEntity = empRepository.findAll();
	
	  List<Employee> employees = empEntity.stream().map(emp -> new Employee(
			  
			  emp.getId(),
			  emp.getFirstName(),
			  emp.getLastName(),
			  emp.getEmailId())).collect(Collectors.toList());
	return null;
	}
}
