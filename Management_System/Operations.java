package Management_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Operations {

	public static boolean insert(Data st) {
		boolean o = false;
		try {
			Connection conn = Database.db();
			String query = "insert into records(Name, Phone, City, Std, Sdiv, Exam, Marks) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setInt(2, Integer.parseInt(st.getStudentPhone()));
			pstmt.setString(3, st.getStudentCity());
			pstmt.setString(4, st.getStudentstd());
			pstmt.setString(5, st.getStudentdiv());
			pstmt.setString(6, st.getStudentexam());
			pstmt.setString(7, st.getStudentmarks());
			
			//execute..
			pstmt.execute();
			
			o = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return o;
	}


	public static boolean delete(int userID) {
		// TODO Auto-generated method stub
		boolean o = false;
		try {
			Connection conn = Database.db();
			String query = "delete from records where Id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, userID);
			
			//execute..
			pstmt.executeUpdate();
			
			o = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return o;
	}


	public static void showrecords() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		boolean o = false;
		try {
			Connection conn = Database.db();
			String query = "select * from records";
			java.sql.Statement st = conn.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				int phone = Integer.parseInt(set.getString(3));
				String city = set.getString(4);
				String Standard = set.getString(5);
				String Div = set.getString(6);
				String Academics = set.getString(7);
				String Marks = set.getString(8);
				
				System.out.println("Student ID: " + id + " \nStudent Name: " + name + " \nStudent Phone: " + phone +
						" \nStudent city: " + city + " \nStudent Std: " + Standard + " \nStudent Div: " + Div + " \nStudent Academics: " + Academics 
						+ "\nStudent Marks: " + Marks);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
		
	}


	public static boolean update(int val,String toUpdate,int id,Data st) {
		// TODO Auto-generated method stub
		boolean o = false;
		
		try {
			  Connection conn = Database.db();
			 if(val == 1) {
					//Update Name
					
						String query = "update records set Name=? where Id = ?";
						PreparedStatement pstmt = conn.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						o = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update records set Phone=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update records set City=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}else if(val == 4) {
					//Update Std
					String query = "update records set Std=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}else if(val == 5) {
					//Update Divison
					String query = "update records set Sdiv=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}else if(val == 6) {
					//Update Academics
					String query = "update records set Exam=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}else if(val == 7) {
					//Update Marks
					String query = "update records set Marks=? where Id = ?";
					PreparedStatement pstmt = conn.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					o = true;
				}
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return o;
	}
}
