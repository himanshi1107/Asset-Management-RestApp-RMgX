package com.example.RMgX_Assest_Management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RMgX_Assest_Management.model.Assest;
import com.example.RMgX_Assest_Management.repository.AssestRepository;

@Service
public class AssestService {
	
	@Autowired
    AssestRepository assetRepository;

    public List<Assest> getAllAsset() {
        List<Assest> assests = new ArrayList<Assest>();
        assetRepository.findAll().forEach(assest -> assests.add((Assest) assest));
        return assests;
    }

    public Assest getAssestById(int id) {   	
    	Assest obj =  getDataById(id);
    	 return obj;
    }
    
	public Assest getDataById(int id) {
		 return assetRepository.findById(id).get();
	}
    public void delete(int id){
        assetRepository.deleteById(id);
    }

    public void saveOrUpdate(Assest asset) {
        assetRepository.save(asset);
    }

    public void assignAssest(String name, int empID) {
    	Assest asset = getAssestById(empID);
        asset.setAssignmentStatus("Assigned");
        asset.setAssignedEmployeeId(empID);
        saveOrUpdate(asset);
    }

    public void recoverAssest(int id) {
    	Assest asset = getAssestById(id);
        asset.setAssignmentStatus("Recovered");
        saveOrUpdate(asset);
    }

}
