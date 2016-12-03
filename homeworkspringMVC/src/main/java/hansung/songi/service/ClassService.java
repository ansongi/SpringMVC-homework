package hansung.songi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hansung.songi.model.Class;
import hansung.songi.dao.ClassDAO;

@Service
public class ClassService {

	private ClassDAO classDAO;

	@Autowired
	public ClassService(ClassDAO classDAO) {
		this.classDAO = classDAO;
	}
	
	public List<Class> getCurrent(){
		return classDAO.getClasses();
	}
	public List<Map<String, Object>> getyearCredit() { //1.구분별 출력
		return classDAO.getYearCredit();
	}
	public List<Map<String, Object>> getNameList(int year, int semester) { //1.학기별 과목명출력
		return classDAO.getNameYear(year,semester);
	}
	
	public List<Map<String, Object>> getDivisionList() { //구분별 출력
		return classDAO.getDivision();
	}
	
	public void insert(Class classes) {
		classDAO.insert(classes);
	}
	
	public List<Class> getNewClass(){
		return classDAO.getNew();
	}
	
}
