package hansung.songi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import hansung.songi.model.Class;
import org.springframework.jdbc.core.RowMapper;

public class ClassMapper implements RowMapper<Class> {

	public Class mapRow(ResultSet rs, int rowNum) throws SQLException {
		Class classes = new Class();
		classes.setYear(rs.getInt("수강년도"));
		classes.setSemester(rs.getInt("학기"));
		classes.setClass_code(rs.getString("교과코드"));
		classes.setClass_name(rs.getString("교과목명"));
		classes.setClass_division(rs.getString("구분"));
		classes.setCredit(rs.getInt("학점"));
		return classes;
	}

}

