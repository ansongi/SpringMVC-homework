package hansung.songi.model;

public class Class {
	private int year;
	private int semester;
	private String class_code;
	private String class_name;
	private String class_division;
	private int credit;
	
	public Class(int year, int semester, String class_code, String class_name, String class_division, int credit) {

		this.year = year;
		this.semester = semester;
		this.class_code = class_code;
		this.class_name = class_name;
		this.class_division = class_division;
		this.credit = credit;
	}
	
	public Class(){
		
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getClass_code() {
		return class_code;
	}

	public void setClass_code(String class_code) {
		this.class_code = class_code;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_division() {
		return class_division;
	}

	public void setClass_division(String class_division) {
		this.class_division = class_division;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "Class [year=" + year + ", semester=" + semester + ", class_code=" + class_code + ", class_name="
				+ class_name + ", class_division=" + class_division + ", credit=" + credit + "]";
	}
	
	
}
