package com.tka.project.RMS.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.project.RMS.entity.Manager;
import com.tka.project.RMS.entity.Scheff;
import com.tka.project.RMS.entity.Staff;

@Repository
public class ManagerDao {
	
	@Autowired
	private SessionFactory sf;

	public List<Manager> getAllManager() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		List<Manager>list = criteria.list();
		return list;
		
		
	}

	public String insertAllManager(Manager manager) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(manager);
		tr.commit();
		return "Manager details added sucessfully...!!!";
		
	}
	
	// list of managers whose salary is more than 20 k

	public List<Manager> getMngSalaryMor20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.gt("salary", "20000"));
		List<Manager>list= criteria.list();
		return list;
		
		
	}
	// list of managers whose salary is more than 20 k

	public List<Manager> Sname20kplusSal() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.like("name", "s%"));
		List<Manager>list = criteria.list();
		return list;
		
	}

	public List<Manager> puneManagerList() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.eq("branchName", "Pune"));
		List<Manager>list= criteria.list();
		return list;
		
		
	}

	public List<Manager> nonPuneManager() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Manager.class);
		criteria.add(Restrictions.ne("branchName", "Pune"));
		List<Manager>list= criteria.list();
		return list;
		
	}

	public List<Staff> getAllStaff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		List<Staff>list = criteria.list();
		return list;
	}

	public List<Staff> getStaffSalLT14000() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.lt("staffSalary", "14000"));
		List<Staff>list = criteria.list();
		return list;
		
	}

	public List<Staff> washerStaff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.ilike("staffDes", "washer"));
		List<Staff>list= criteria.list();
		return list;
		
	}

	public List<Staff> getRnamedStaff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Staff.class);
		criteria.add(Restrictions.like("staffName", "r%"));
		List<Staff>list= criteria.list();
		return list;
		
	}

	public String insertStaff(Staff staff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(staff);
		tr.commit();
		return "Staff details inserted sucessfully";
	}

	
	public List<Scheff> GetAllScheff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		List<Scheff>list= criteria.list();
		return list;	
	}

	public String insertScheff(Scheff scheff) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(scheff);
		tr.commit();
		return "Scheff details inserted sucessfully";
		
	}

	public List<Scheff> getPuneScheff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.ilike("branch", "Pune"));
		List<Scheff>list = criteria.list();
		return list;
	}

	public List<Scheff> scheffSalLessThn20k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.lt("salary", "20000"));
		List<Scheff>list = criteria.list();
		return list;
		
	}

	public List<Scheff> ScheffNameFromA() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.like("name", "a%"));
		List<Scheff>list = criteria.list();
		return list;
		
	}

	public List<Scheff> ScheffAbove25WithAname() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.gt("age", "25"));
		criteria.add(Restrictions.like("name", "a%"));
		List<Scheff> list = criteria.list();
		return list;
		
	}

	public List<Scheff> scheffAgeBelow25() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.lt("age", "25"));
		List<Scheff> list = criteria.list();
		return list;
		
	}

	public List<Scheff> getScheffSalBetween20to30k() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Scheff.class);
		criteria.add(Restrictions.between("age", "20", "30"));
		List<Scheff> list = criteria.list();
		return list;
		
	}

	public String deleteScheffRecord(int id) {
		Session session = sf.openSession();
		Scheff sf =session.load(Scheff.class, id);
		session.delete(sf);
		System.out.println("record deleted sucessfully");
		return "record is deleted";
		
	}

	

	

}
