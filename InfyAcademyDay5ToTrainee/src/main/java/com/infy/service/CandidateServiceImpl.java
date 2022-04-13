package com.infy.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.infy.dao.CandidateDAO;
import com.infy.dao.CandidateDAOImpl;
import com.infy.exception.InfyAcademyException;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;
import com.infy.validator.Validator;
//Log all the exceptions thrown by the methods of this class.
//Make sure to let every exception propagate.
public class CandidateServiceImpl implements CandidateService {

	private CandidateDAO candidateDAO = new CandidateDAOImpl();

	
	public String addCandidate(Candidate candidate) throws InfyAcademyException {
		Validator validator = new Validator();
		
			validator.validate(candidate);
			Character tempResult = 'P';
			if (candidate.getMark1() < 50 || candidate.getMark2() < 50 || candidate.getMark3() < 50) {
				tempResult = 'F';
			}
			if (!candidate.getResult().equals(tempResult)) {
				throw new InfyAcademyException("Service.INCORRECT_RESULT");
			}
			return candidateDAO.addCandidate(candidate);
			}

	
	public String calculateGrade(CandidateReport candidateReportTO) {
		String grade = null;
		if (candidateReportTO.getResult() == 'F') {
			grade = "NA";
		} else {
			float average = (candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3())
					/ 3f;
			if(average >= 85.0) {
				grade="A";
			}
			else if((average >= 75.0 && average < 85.0)){
				grade="B";
			}
			else {
				grade="C";
			}
			
		}
		return grade;
	}

	
	public Map<Integer, String> getGradesForAllCandidates() throws InfyAcademyException {

		List<CandidateReport> allCandidates = candidateDAO.getAllCandidates();
		Map<Integer, String> finalList = new TreeMap<>();

		allCandidates.stream().forEach(candidate -> finalList.put(candidate.getCandidateId(), calculateGrade(candidate)));
		
		return finalList;
	}
}
