package com.tka.project.RMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.project.RMS.entity.Manager;
import com.tka.project.RMS.entity.Scheff;
import com.tka.project.RMS.entity.Staff;
import com.tka.project.RMS.service.ManagerService;

@RestController
public class ManagerController {
	@Autowired
	private ManagerService ms;
	
	@GetMapping("allManagers")
	public List<Manager> getAllManager() {
		
		System.out.println("In method");
		return ms.getAllManager();
		
	}
	
	@PostMapping("insertManager")
	public String insertAllManager(@RequestBody Manager manager) {
		return ms.insertAllManager(manager);
	}
	
	// list of managers whose salary is more than 20 k
	
	@GetMapping("moreThn20k")
	public List<Manager> getMngSalaryMor20k() {
		return ms.getMngSalaryMor20k();
	}
	
	// Manager name starts with 's' and salary more than 20k
	
	@GetMapping("SnameWith20kSal")
	public List<Manager> Sname20kplusSal() {
		return ms.Sname20kplusSal();
	}
	
	// Manager from pune 
	
	@GetMapping("puneManagers")
	public List<Manager> puneManagerList() {
		return ms.puneManagerList();
	}
	
	@GetMapping("nonpunemgr")
	public List<Manager> nonPuneManager() {
		return ms.nonPuneManager();
	}
	
	
	//<<<<<<<<<<<<<<<<<<<<Staff APIs>>>>>>>>>>>>>>>>>>>>
	
	@GetMapping("allStaff")
	public List<Staff> getAllStaff() {
		return ms.getAllStaff();
	}
	
	@GetMapping("stafSalLT14000")
	public List<Staff> getStaffSalLT14000() {
		return ms.getStaffSalLT14000();
	}
	
	@GetMapping("allWashers")
	public List<Staff> washerStaff() {
		return ms.washerStaff();
	}
	
	@GetMapping("RnameStaff")
	public List<Staff> getRnamedStaff() {
		return ms.getRnamedStaff();
	}
	
	@PostMapping("insertStaff")
	public String insertStaff(@RequestBody Staff staff) {
		return ms.insertStaff(staff);
	}
	
	//<<<<<<<<<<<<<<<<<<<< Scheff APIs>>>>>>>>>>>>>>>>>>>>
	
	@GetMapping("AllSchefDetails")
	public List<Scheff> GetAllScheff() {
		return ms.GetAllScheff();
	}
	
	@PostMapping("InsertScheff")
	public String insertScheff(@RequestBody Scheff scheff) {
		return ms.insertScheff(scheff);
	}
	
	@GetMapping("PuneScheff")
	public List<Scheff> getPuneScheff() {
		return ms.getPuneScheff();
	}
	
	@GetMapping("ScheffSalBelow20k")
	public List<Scheff> scheffSalLessThn20k() {
		return ms.scheffSalLessThn20k();
	}
	
	@GetMapping("ScheffNameFromA")
	public List<Scheff> ScheffNameFromA() {
		return ms.ScheffNameFromA();
	}
	
	@GetMapping("ScheffAbove25WithAname")
	public List<Scheff> ScheffAbove25WithAname() {
		return ms.ScheffAbove25WithAname();
	}
	
	@GetMapping("scheffAgeBelow25")
	public List<Scheff> scheffAgeBelow25() {
		return ms.scheffAgeBelow25();
	}
	
	@GetMapping("getScheffSalBetween20to30k")
	public List<Scheff> getScheffSalBetween20to30k() {
		return ms.getScheffSalBetween20to30k();
	}
	
	@DeleteMapping("Delete/{id}")
	public String deleteScheffRecord(@PathVariable("id")int id) {
	
		return ms.deleteScheffRecord(id);
	}
	

}
