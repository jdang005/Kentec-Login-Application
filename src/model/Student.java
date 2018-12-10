package model;

public class Student {
	
	String studentID;
	String studentName;
	String courseID;
	String professor;
	String semester;
	
	Student(String studentID, String studentName, String courseID, String professor, String semester) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.courseID = courseID;
		this.professor = professor;
		this.semester = semester;
	}

	public String getStudentID() {
		return studentID;
	}

	public boolean setStudentID(String studentID) {
		if(validateStudentID(studentID)) {
			this.studentID = studentID;
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean validateStudentID(String studentID) {
		if() {
		}
		else {
			return false;
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public boolean setStudentName(String studentName) {
		if(validateStudentName(studentName)) {
		}
		else {
			return false;
		}
		this.studentName = studentName;
		return false;
	}
	
	public boolean validateStudentName(String studentName) {
		if() {
		}
		else {
			return false;
		}
		return false;
	}

	public String getCourseID() {
		return courseID;
	}

	public boolean setCourseID(String courseID) {
		if(validateCourseID(courseID)) {
		}
		else {
			return false;
		}
		this.courseID = courseID;
		return false;
	}
	
	public boolean validateCourseID(String courseID) {
		if() {
		}
		else {
			return false;
		}
		return false;
	}
	
	public String getProfessor() {
		return professor;
	}

	public boolean setProfessor(String professor) {
		if(validateProfessor(professor)) {
		}
		else {
			return false;
		}
		this.professor = professor;
		return false;
	}
	
	public boolean validateProfessor(String professor) {
		if() {
		}
		else {
			return false;
		}
		return false;
	}

	public String getSemester() {
		return semester;
	}

	public boolean setSemester(String semester) {
		if(validateSemester(semester)) {
		}
		else {
			return false;
		}
		this.semester = semester;
		return false;
	}
	
	public boolean validateSemester(String semester) {
		if() {
		}
		else {
			return false;
		}
		return false;
	}

}
