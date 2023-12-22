package com.tka.project.RMS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tka.project.RMS.dao.ManagerDao;
import com.tka.project.RMS.entity.Manager;
import com.tka.project.RMS.entity.Scheff;
import com.tka.project.RMS.entity.Staff;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerDao dao;

	
	public List<Manager> getAllManager() {
		return dao.getAllManager();
		
	}


	public String insertAllManager(Manager manager) {
		
		return dao.insertAllManager(manager);
	}
	
	// list of managers whose salary is more than 20 k

	public List<Manager> getMngSalaryMor20k() {
		return dao.getMngSalaryMor20k();
		}
	
	// list of managers whose salary is more than 20 k
	
	public List<Manager> Sname20kplusSal() {
		List<Manager> list = dao.Sname20kplusSal();
		List<Manager> al= new ArrayList<>();
		for (Manager manager : list) {
			if(Integer.parseInt(manager.getSalary())>Integer.parseInt("20000")) {
				al.add(manager);
			}else {
				return null;
			}
			
		}
		return al;
		
	}


	public List<Manager> puneManagerList() {
		return dao.puneManagerList();
		
	}


	public List<Manager> nonPuneManager() {
		return dao.nonPuneManager();
		
	}

	//<<<<<<<<<<<<<<<<<<<<Staff APIs>>>>>>>>>>>>>>>>>>>>
	public List<Staff> getAllStaff() {
		return dao.getAllStaff();
		
	}


	public List<Staff> getStaffSalLT14000() {
		return dao.getStaffSalLT14000();
		
	}


	public List<Staff> washerStaff() {
		return dao.washerStaff();
		
	}


	public List<Staff> getRnamedStaff() {
		return dao.getRnamedStaff();
		
	}


	public String insertStaff(Staff staff) {
		return dao.insertStaff(staff);
		
	}


	//<<<<<<<<<<<<<<<<<<<< Scheff APIs>>>>>>>>>>>>>>>>>>>>
	
	public List<Scheff> GetAllScheff() {
		return dao.GetAllScheff();
		
	}


	public String insertScheff(Scheff scheff) {
		return dao.insertScheff(scheff);
		
	}


	public List<Scheff> getPuneScheff() {
		return dao.getPuneScheff();
		
	}


	public List<Scheff> scheffSalLessThn20k() {
		return dao.scheffSalLessThn20k();
		
	}


	public List<Scheff> ScheffNameFromA() {
		return dao.ScheffNameFromA();
		
	}


	public List<Scheff> ScheffAbove25WithAname() {
		return dao.ScheffAbove25WithAname();
		
	}


	public List<Scheff> scheffAgeBelow25() {
		return dao.scheffAgeBelow25();
		
	}


	public List<Scheff> getScheffSalBetween20to30k() {
		return dao.getScheffSalBetween20to30k();
		
	}


	public String deleteScheffRecord(int id) {
		return dao.deleteScheffRecord(id);
		
	}
	

}
