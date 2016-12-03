package hansung.songi.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hansung.songi.model.Class;

@Repository
public class ClassDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public List<Class> getClasses(){
		String sqlStatement="select * from class"; //sql��	
		return jdbcTemplateObject.query(sqlStatement, new ClassMapper());
	}
	
	public List<Map<String, Object>> getYearCredit() { //1. �б⺰ ���� ���
		String sqlStatement="select �����⵵, �б�, sum(����) as ���� from class group by �����⵵,�б�"; 	
		return jdbcTemplateObject.queryForList(sqlStatement);
	}

	public List<Map<String,Object>> getNameYear(int year, int semester){ //1. �б⺰ �̼����� ��ȸ - ����������
		String sqlStatement="select ������� from class where �����⵵=? and �б�=?"; 	
		return jdbcTemplateObject.queryForList(sqlStatement, new Object[]{year,semester});
	}
	public List<Map<String,Object>> getDivision(){//2. ���к� �̼����� ���� ��ȸ
		String sqlStatement="select ����, sum(����) as ���� from class group by ����"; 	
		return jdbcTemplateObject.queryForList(sqlStatement);
	}
	
	public boolean insert(Class classes){ //3. ������û�ϱ�
		int year = classes.getYear();
		int semester = classes.getSemester();
		String class_code = classes.getClass_code();
		String class_name = classes.getClass_name();
		String class_division = classes.getClass_division();
		int credit=classes.getCredit();
		
		String sqlStatement = "insert into class (�����⵵, �б�, �����ڵ�, �������, ����, ����) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year,semester,class_code,class_name,class_division,credit}) == 1);
	}
	
	public List<Class> getNew() { //4.������û ��ȸ �޴�
		String sqlStatement = "select * from class where �����⵵=2017";
		return jdbcTemplateObject.query(sqlStatement, new ClassMapper());
	}

	
	
}

