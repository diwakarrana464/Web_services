package com.rana.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rana.connection.DbCon;
import com.rana.student.Student;
//this line is written for helping in staging
public class StudentDaoImpl implements IStudentDao {
	
	@Override
	public Integer saveStudent(Student std) {
		String QUERY = "insert into students values(?,?,?,?,?) ";
		Integer count = 0;
		try {
			PreparedStatement ps = DbCon.getConnection().prepareStatement(QUERY);
			// set the values to query from student objects ....
			ps.setInt(1, std.getStdId());
			ps.setString(2, std.getStdName());
			ps.setString(3, std.getStdCourse());
			ps.setDouble(4, std.getStdFee());
			ps.setDouble(5, std.getStdDiscount());
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
//................................fetching all student data......................
	
	@Override
	public List<Student> getAllStudents() {
		String QUERY = "SELECT * FROM STUDENTS";
		List<Student> list = null;
		
				try {
					PreparedStatement ps = DbCon.getConnection().prepareStatement(QUERY);
					ResultSet rs = ps.executeQuery();
					list = new ArrayList<>();
					while(rs.next()) {
							list.add(new Student(
									rs.getInt(1),
									rs.getString(2),
									rs.getString(3),
									rs.getDouble(4),
									rs.getDouble(5)));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return list;
	}
	//........................removing one student by id...............
	@Override
	public boolean removeOneStudent(Integer id) {
		System.out.println("Dao class"+id);
		String QUERY = "DELETE FROM STUDENTS WHERE SID = ?";
		Integer count = 0;
		try {
			PreparedStatement ps = DbCon.getConnection().prepareStatement(QUERY);
			ps.setInt(1, id);
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (count>0)?true:false;
	}
	//.........................getting specific student details...
	@Override
	public Student getOneStudent(Integer sid) {
		Student std = new Student();
		String QUERY = "SELECT * FROM STUDENTS WHERE SID = ?";
		try {
			PreparedStatement ps = DbCon.getConnection().prepareStatement(QUERY);
			ps.setInt(1, sid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				std.setStdId(rs.getInt(1));
				std.setStdName(rs.getString(2));
				std.setStdCourse(rs.getString(3));
				std.setStdFee(rs.getDouble(4));
				std.setStdDiscount(rs.getDouble(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}
	//.................................update student based on id .....................
	@Override
	public boolean updateStudent(Student s) {
		boolean isUpdated = false;
		String QUERY = "UPDATE STUDENTS SET SNAME = ?, SCOURSE = ?, SFEE = ?, SDISCOUNT = ? WHERE SID = ?";
	
		try {
			PreparedStatement ps = DbCon.getConnection().prepareStatement(QUERY);
			ps.setString(1, s.getStdName());
			ps.setString(2, s.getStdCourse());
			ps.setDouble(3, s.getStdFee());
			ps.setDouble(4, s.getStdDiscount());
			ps.setInt(5, s.getStdId());
			
			 isUpdated = ps.executeUpdate() == 1 ? true : false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdated;
	}
}
