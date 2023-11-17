package Management_System;

public class Data {

	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	private String studentstd;
	private String studentdiv;
	private String studentexam;
	private String studentmarks;
	

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentPhone() {
		return studentPhone;
	}


	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}


	public String getStudentCity() {
		return studentCity;
	}

	
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentstd() {
		return studentstd;
	}

	public void setStudentstd(String studentstd) {
		this.studentstd = studentstd;
	}

	public String getStudentdiv() {
		return studentdiv;
	}

	public void setStudentdiv(String studentdiv) {
		this.studentdiv = studentdiv;
	}

	public String getStudentexam() {
		return studentexam;
	}

	public void setStudentexam(String studentexam) {
		this.studentexam = studentexam;
	}

	public String getStudentmarks() {
		return studentmarks;
	}

	public void setStudentmarks(String studentmarks) {
		this.studentmarks = studentmarks;
	}
	
	public Data(int studentID, String studentName, String studentPhone, String studentCity, String studentstd, String studentdiv, String studentexam, String studentmarks) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentstd = studentstd;
		this.studentdiv = studentdiv;
		this.studentexam = studentexam;
		this.studentmarks = studentmarks;
	}


	public Data(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		
	}

	
	public Data(String studentName, String studentPhone, String studentCity, String studentstd, String studentdiv, String studentexam, String studentmarks) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentstd = studentstd;
		this.studentdiv = studentdiv;
		this.studentexam = studentexam;
		this.studentmarks = studentmarks;
	}


	public Data() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student[Student ID=" + studentID + ", Student Name=" + studentName + ", Student Phone=" + studentPhone
				+ ", Student City=" + studentCity + ", Student Std=" + studentstd +", Student Div=" + studentdiv +", Student Exam=" + studentexam 
				+ ", Student Marks=" + studentmarks +"]";
	}
}