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

import com.nt.entity.Citizens;
import com.nt.entity.Login;
import com.nt.entity.VaccinationCenter;
import com.nt.repository.ILoginRepo;
import com.nt.service.ILoginService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@Autowired
	private ILoginService service;
	@Autowired
	private ILoginRepo repo;
	
	@GetMapping("/")
	public String loginPage(@ModelAttribute("login") Login login) {
		System.out.println(login.getPwd()+" "+login.getEmail());
		
		return "login";
	}
	
	@PostMapping("/")
	public String loginPagePost(@ModelAttribute("login") Login login,HttpSession ses) {
		List<Login> li = repo.findByEmailAndfindByPwd(login.getEmail(), login.getPwd());
		if(li.isEmpty()) {
			ses.setAttribute("li","Invalid Credintials");
			return "login";
		}
		else {
		    return "vaccinationcenterHome";
		}
	}
	
	@GetMapping("/register")
	public String registerPage(@ModelAttribute("reg") Login reg) {
		return "register";
	}

	@PostMapping("/register")
	public String registerPagePost(@ModelAttribute("reg") Login reg,HttpSession ses) {
		String reg1 = service.register1(reg);
		ses.setAttribute("reg1", reg1);
		return "redirect:./";
	}
	
	@GetMapping("vaccinationcenter")
	public String VaccinationCenter(Map<String,Object> map,HttpSession ses) {
		List<VaccinationCenter> allVaccinationCenters = service.getAllVaccinationCenters();
		long vacCentersCount = service.vacCentersCount();
		String vacCentersCount1="Total "+vacCentersCount+" Vaccination Centers found..";
		map.put("vacCenters", allVaccinationCenters);
		ses.setAttribute("count1", vacCentersCount1);
		return "vaccinationcenter1";
	}
	
	@GetMapping("addVacCenter")
	public String addVaccination(@ModelAttribute("cent")VaccinationCenter cent) {
		return "addVacCenter1";
	}
	
	@PostMapping("addVacCenter")
	public String addVaccinationPost(@ModelAttribute("cent")VaccinationCenter cent) {
		String regAddNewCenter = service.regAddNewCenter(cent);
		return "redirect:vaccinationcenter";
	}
	
	@GetMapping("view")
	public String viewVaccinationCenter(@RequestParam("id")int id,Map<String,Object> map) {
		VaccinationCenter elementsbyId = service.getElementsbyId(id);
		
		System.out.println(elementsbyId.getCid());
		Citizens citizensById = service.getCitizensById(elementsbyId.getCid());
		
		map.put("listById", elementsbyId);
		map.put("citById", citizensById);
		return "viewVaccinationCenter";
	}
	
	@GetMapping("citview")
	public String citviewVaccinationCenter(@RequestParam("id")int id,Map<String,Object> map) {
		  Citizens citizensById2 = service.getCitizensById(id);
		  System.out.println(id);
		map.put("citById1", citizensById2);
		return "viewCitizenHistory";
	}
	
	
	@GetMapping("editCenter")
	public String editCenterVaccination(@ModelAttribute("cent")VaccinationCenter cent,@RequestParam("id")int id) {
		VaccinationCenter elementsbyId = service.getElementsbyId(id);
		BeanUtils.copyProperties(elementsbyId, cent);
		return "editCenterVacCenter1";
	}
	
	@PostMapping("editCenter")
	public String editVaccinationPost(@ModelAttribute("cent")VaccinationCenter cent) {
		String regAddNewCenter = service.updateNewCenter(cent);
		return "redirect:vaccinationcenter";
	}
	

	@GetMapping("deleteCenter")
	public String deleteVaccinationPost(@RequestParam("id")int id) {
		service.deleteBysId(id);
		return "redirect:vaccinationcenter";
	}


	@GetMapping("citizens")
	public String Citizens(Map<String,Object> map,HttpSession ses) {
		List<Citizens> allCitizens = service.getAllCitizens();
		System.out.println(allCitizens);
		long citizensCount = service.citizensCount();
		String allCitizenCount1="Total "+citizensCount+" citizens found..";
		map.put("vacCenters10", allCitizens);
		ses.setAttribute("count1", allCitizenCount1);
		return "citizensList1";
	}

	@GetMapping("addcitizen")
	public String addCitizen(@ModelAttribute("cit")Citizens cit) {
		return "addCitizen1";
	}
	
	@PostMapping("addcitizen")
	public String addCitizenPost(@ModelAttribute("cent")Citizens cent) {
		service.regAddNewCenter(cent);
		return "redirect:citizens";
	}

	@GetMapping("editCitizen")
	public String editCitizen(@ModelAttribute("cent")Citizens cent,@RequestParam("id")int id) {
		Citizens elementsbyId = service.getCitizensById(id);
		BeanUtils.copyProperties(elementsbyId, cent);
		return "editCitizens1";
	}
	
	@PostMapping("editCitizen")
	public String editCitizen(@ModelAttribute("cent")Citizens cent) {
		String regAddNewCenter = service.updateCitizen(cent);
		return "redirect:citizens";
	}
	

	@GetMapping("deleteCitizen")
	public String deleteCitizenPost(@RequestParam("id")int id) {
		service.deleteByCitizenId(id);
		return "redirect:citizens";
	}
}
