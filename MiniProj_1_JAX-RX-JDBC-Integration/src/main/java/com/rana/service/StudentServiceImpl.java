package com.rana.service;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import com.rana.dao.IStudentDao;
import com.rana.student.Student;

public class StudentServiceImpl implements IStudentService {
	@Inject
	private IStudentDao dao;// has a 
	
	@Override
	public Integer saveStudent(Student std) {
		//discount calculation.....
		Double fee = std.getStdFee();
		Double disC = fee*.1;
		std.setStdDiscount(disC);
		return dao.saveStudent(std);
	}
	//.................................fetchin all students.......................
	@Override
	public List<Student> getAllStudents() {
		List<Student> list = dao.getAllStudents();
		//.............................................................
		Collections.sort(list, (o1, o2)->o1.getStdId()-o2.getStdId()); //ID accending...
		//Collections.sort(list,  (o1, o2)->o2.getStdId()-o1.getStdId());   // ID decending ......
		//Collections.sort(list, (o1, o2)->o1.getStdName().compareTo(o2.getStdName()));   // name alphabetically..
		return list;
	}
	//...................................removing one student data.......................................
	
public	boolean removeOneStudent(Integer id) {
		return dao.removeOneStudent(id);
	}
	//...................get one student details based on id...

@Override
public Student getOneStudent(Integer sid) {
	return dao.getOneStudent(sid);
}
//.....................updating one student record........

@Override
public boolean updateStudent(Student s) {
	return dao.updateStudent(s);
}

}// end of class......
