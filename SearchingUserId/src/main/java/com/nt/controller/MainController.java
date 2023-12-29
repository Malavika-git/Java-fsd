package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.PatientDetails;
import com.nt.service.IPatientService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@Autowired
	private IPatientService service;
	
	
	@GetMapping("/")
	public String getAllReports(Map<String ,Object> map,@ModelAttribute("ee") PatientDetails ee) {
		List<PatientDetails> list = service.getAllDetails();
		map.put("list", list);
		return "home";
	}
	@PostMapping("/")
	public String updatemethod(@ModelAttribute("ee") PatientDetails ee,HttpSession ses) {
		List<PatientDetails> checkId = service.checkId(ee.getPatientId());
		if(checkId.isEmpty()) {
			ses.setAttribute("idMsg", "Please select Valid PatientId which is present in the Table..");
			return "redirect:.";
		}
		else {
			ses.setAttribute("id1", ee.getPatientId());
			return "alert";
		}
	}
	
	@GetMapping("/add")
	public String addDetail(@ModelAttribute("pat") PatientDetails pat) {
		return "addPage";
	}
		
	@PostMapping("/add")
	public String addDetailPost(HttpSession ses,@ModelAttribute("pat") PatientDetails pat) {
		String addDetail = null;
		 addDetail = service.addDetail(pat);
		ses.setAttribute("Msg", addDetail);
		return "redirect:.";
	}
	
	@GetMapping("/update")
	public String updatemethod(@ModelAttribute("pat") PatientDetails pat,@RequestParam("id")int id) {
		PatientDetails iidd = service.getEmployeeById(id);
		BeanUtils.copyProperties(iidd, pat);
		return "updatePage";
	}
	
	@PostMapping("/update")
	public String updateDetailPost(HttpSession ses,@ModelAttribute("pat") PatientDetails pat) {
		String addDetail = service.updateEmployee(pat);
		ses.setAttribute("Msg", addDetail);	
		return "redirect:.";
	}
	
}
