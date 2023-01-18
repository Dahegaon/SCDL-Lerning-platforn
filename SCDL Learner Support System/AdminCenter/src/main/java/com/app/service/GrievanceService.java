package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.GrievanceRequest;
import com.app.dto.GrievanceResponse;
import com.app.model.Grievance;
import com.app.repo.GrievanceRepository;

@Service

public class GrievanceService {
	@Autowired GrievanceRepository repo;

	public GrievanceResponse addGrievance(Grievance grievance) {
		// TODO Auto-generated method stub
		
		
			GrievanceResponse response = new GrievanceResponse();
			Grievance pro = repo.save(grievance);
			
			if(pro!=null) {
				response.setGrievance(grievance);;
				response.setStatus("Success");
				
			}
			else {
				response.setGrievance(grievance);
				response.setStatus("Fail");
				
		       }
				
					return response;
					}

}
