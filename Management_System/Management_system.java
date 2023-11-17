package Management_System;

import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Management_system {

	public static void main(String[] args) throws Exception {
		try (// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter User Name: \n");
			String user = sc.nextLine();
			System.out.println("Welcome" + " " + user);

			while (true) {
				System.out.println("PRESS 1 to ADD student");
				System.out.println("PRESS 2 to DELETE student");
				System.out.println("PRESS 3 to DISPLAY student");
				System.out.println("PRESS 4 to UPDATE student");
				System.out.println("PRESS 5 to EXIT App");

				int opt = Integer.parseInt(sc.nextLine());

				if (opt == 1) {
					// Add student

					System.out.println("Enter Student Name: ");
					String Name = sc.nextLine();
					System.out.println("Enter Student Phone: ");
					String Phone = sc.nextLine();
					System.out.println("Enter Student City: ");
					String City = sc.nextLine();
					System.out.println("Enter Student Standard: ");
					String Std = sc.nextLine();
					System.out.println("Enter Student Divison");
					String Div = sc.nextLine();
					System.out.println("Add Academics: ");
					String exam = sc.nextLine();
					System.out.println("Add Marks: ");
					String Marks = sc.nextLine();

					// create student object
					try {
						Data st = new Data(Name, Phone, City, Std, Div, exam, Marks);
						boolean ans = Operations.insert(st);
						if (ans) {
							System.out.println("Record Inserted Successfully...");
							System.out.println("Student Record:" + st);
						} else {
							System.out.println("Error Occured While Inserting!");
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println(e);
					}
				}

				else if (opt == 2) {
					// Delete student
					System.out.println("Enter Student ID To Delete: ");
					int userID = Integer.parseInt(sc.nextLine());
					boolean f = Operations.delete(userID);
					if (f) {
						System.out.println("Student Of ID " + userID + " Record Deleted... ");
					} else {
						System.out.println("Something Went Wrong.. Please try Again!");
					}
				} else if (opt == 3) {
					// Display student
					Operations.showrecords();
				}

				else if (opt == 4) {
					// Update student
					System.out.println("PRESS 1 to UPDATE Name");
					System.out.println("PRESS 2 to UPDATE Phone");
					System.out.println("PRESS 3 to UPDATE City");
					System.out.println("PRESS 4 to UPDATE Std");
					System.out.println("PRESS 5 to UPDATE Div");
					System.out.println("PRESS 6 to UPDATE Academics");
					System.out.println("PRESS 7 to UPDATE Marks");

					int uopt = Integer.parseInt(sc.nextLine());

					if (uopt == 1) {
						// Update Name
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						Data st = new Data();
						System.out.println("Enter name to UPDATE...");
						String name = sc.nextLine();
						st.setStudentName(name);
						boolean f = Operations.update(uopt, name, id, st);
						if (f) {
							System.out.println("Student Name Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					} else if (uopt == 2) {
						// Update Phone
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter phone to UPDATE...");
						String phone = sc.nextLine();
						Data st = new Data();
						st.setStudentPhone(phone);
						boolean f = Operations.update(uopt, phone, id, st);
						if (f) {
							System.out.println("Student Phone Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}

					else if (uopt == 3) {
						// Update city
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter city to UPDATE...");
						String city = sc.nextLine();
						Data st = new Data();
						st.setStudentCity(city);
						boolean f = Operations.update(uopt, city, id, st);
						if (f) {
							System.out.println("Student City Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					} else if (uopt == 4) {
						// Update city
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter STD to UPDATE...");
						String std = sc.nextLine();
						Data st = new Data();
						st.setStudentstd(std);
						boolean f = Operations.update(uopt, std, id, st);
						if (f) {
							System.out.println("Student STD Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					} else if (uopt == 5) {
						// Update city
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter Div to UPDATE...");
						String div = sc.nextLine();
						Data st = new Data();
						st.setStudentdiv(div);
						boolean f = Operations.update(uopt, div, id, st);
						if (f) {
							System.out.println("Student Div Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					} else if (uopt == 6) {
						// Update city
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter Academics to UPDATE...");
						String exam = sc.nextLine();
						Data st = new Data();
						st.setStudentexam(exam);
						boolean f = Operations.update(uopt, exam, id, st);
						if (f) {
							System.out.println("Student Acadeemics Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					} else if (uopt == 7) {
						// Update city
						System.out.println("Enter ID to identify student!");
						int id = Integer.parseInt(sc.nextLine());
						System.out.println("Enter Marks to UPDATE...");
						String marks = sc.nextLine();
						Data st = new Data();
						st.setStudentmarks(marks);
						boolean f = Operations.update(uopt, marks, id, st);
						if (f) {
							System.out.println("Student Marks Updated Successfully...");
						} else {
							System.out.println("Something Went Wrong Please try Again!");
						}
					}
				}

				else if (opt == 5) {
					// Exit

					System.out.println("Thank You.." + user);
					break;
				} else {

				}

			}
		}
	}
}