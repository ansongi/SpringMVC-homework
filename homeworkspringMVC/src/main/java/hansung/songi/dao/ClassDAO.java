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
		String sqlStatement="select * from class"; //sql문	
		return jdbcTemplateObject.query(sqlStatement, new ClassMapper());
	}
	
	public List<Map<String, Object>> getYearCredit() { //1. 학기별 학점 출력
		String sqlStatement="select 수강년도, 학기, sum(학점) as 학점 from class group by 수강년도,학기"; 	
		return jdbcTemplateObject.queryForList(sqlStatement);
	}

	public List<Map<String,Object>> getNameYear(int year, int semester){ //1. 학기별 이수학점 조회 - 교과목명출력
		String sqlStatement="select 교과목명 from class where 수강년도=? and 학기=?"; 	
		return jdbcTemplateObject.queryForList(sqlStatement, new Object[]{year,semester});
	}
	public List<Map<String,Object>> getDivision(){//2. 구분별 이수학점 내역 조회
		String sqlStatement="select 구분, sum(학점) as 학점 from class group by 구분"; 	
		return jdbcTemplateObject.queryForList(sqlStatement);
	}
	
	public boolean insert(Class classes){ //3. 수강신청하기
		int year = classes.getYear();
		int semester = classes.getSemester();
		String class_code = classes.getClass_code();
		String class_name = classes.getClass_name();
		String class_division = classes.getClass_division();
		int credit=classes.getCredit();
		
		String sqlStatement = "insert into class (수강년도, 학기, 교과코드, 교과목명, 구분, 학점) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year,semester,class_code,class_name,class_division,credit}) == 1);
	}
	
	public List<Class> getNew() { //4.수강신청 조회 메뉴
		String sqlStatement = "select * from class where 수강년도=2017";
		return jdbcTemplateObject.query(sqlStatement, new ClassMapper());
	}

	
	
}

