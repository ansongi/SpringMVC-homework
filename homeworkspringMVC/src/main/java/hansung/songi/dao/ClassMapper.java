package hansung.songi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import hansung.songi.model.Class;
import org.springframework.jdbc.core.RowMapper;

public class ClassMapper implements RowMapper<Class> {

	public Class mapRow(ResultSet rs, int rowNum) throws SQLException {
		Class classes = new Class();
		classes.setYear(rs.getInt("�����⵵"));
		classes.setSemester(rs.getInt("�б�"));
		classes.setClass_code(rs.getString("�����ڵ�"));
		classes.setClass_name(rs.getString("�������"));
		classes.setClass_division(rs.getString("����"));
		classes.setCredit(rs.getInt("����"));
		return classes;
	}

}

