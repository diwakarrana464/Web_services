package com.rana.controller;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.rana.model.Result;
import com.rana.model.Student;
import com.rana.model.SubResult;
import com.rana.model.Subject;

@Path("/std")
public class StudentResultController {
	
	@Path("/result")
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Result findExamResultInfo(Student std){
		//local variables initialization
		String finalResult = "Pass";
		//creating Subject result list 
		List<SubResult> subResultList = new ArrayList<SubResult>();
		Integer totalMarks = 0;
		// Default grade Initializing
		String grade = "NA";
		
		//creating object of Result model Class
		Result result = new Result();
		//adding Serial id 
		result.setSid(std.getSid());
		//adding student name 
		result.setSname(std.getSname());
		
		//processing each and every subject one by one  
		for( Subject sub :  std.getSubjectList())
		{
			totalMarks+=(sub.getMaxThryMark()+sub.getLabMark());
			SubResult subResult = new SubResult();
			subResult.setSubName(sub.getSubName());
			
			//individual subject percentage
			Integer perTh =    sub.getThryMarks()*100/sub.getMaxThryMark();  
			Integer perLab =   sub.getLabMark()*100/sub.getMaxLabMark();    
			
			//setting to result subject 			
			subResult.setThryMarksPer(perTh);
			subResult.setLabMarkPer(perLab);
			
			//logic to find  pass or fail in individual subject
			if(perTh > 40 && perLab >30)
				subResult.setPassFail("Pass");
			else {
				subResult.setPassFail("Fail");
				finalResult = "Fail";
			}
			//adding subject info to list
			subResultList.add(subResult);
		}// end of for each loop
		//adding list object to result 
		result.setSubResultList(subResultList);
		
		// adding total marks to result 
		result.setTotalMrks(totalMarks);
		
		//calculating over All average of student marks 
		Integer avg = totalMarks/(subResultList.size()*2);
		result.setAvg(avg);
		
		//adding final result status of student
		result.setFinalResult(finalResult);
		
		//assigning grade accordingly 
		if(avg > 75) {
			grade = "A+";
		}else if (avg  >= 60) {
			grade = "A";
		}
		else if (avg  >= 50) {
			grade = "B+";
		}
		else if (avg  >= 40) {
			grade = "B";
		}
		// adding  grade
		result.setGrade(grade);
		
		return result;
	}//end of function 
}//end of class
