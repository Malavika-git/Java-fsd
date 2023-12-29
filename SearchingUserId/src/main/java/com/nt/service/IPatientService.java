package com.nt.service;

import java.util.List;

import com.nt.model.PatientDetails;

public interface IPatientService {
    List<PatientDetails> getAllDetails();
    public String addDetail(PatientDetails pat);
    
    public PatientDetails getEmployeeById(int id);
    public String updateEmployee(PatientDetails det);
    public String deleteEmployeeByEno(int id);
    
    public List<PatientDetails> checkId(int id);
}
