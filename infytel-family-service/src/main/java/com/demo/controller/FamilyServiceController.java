package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Family;



@RestController
public class FamilyServiceController {

	private static Map<String, List<Family>> familyDB = new HashMap<String, List<Family>>();

	static {
		familyDB = new HashMap<String, List<Family>>();

		List<Family> lst = new ArrayList<Family>();
		Family std = new Family("Gupta s family", "indian family");
		lst.add(std);
		std = new Family("Singh", "indian");
		lst.add(std);

		familyDB.put("family", lst);

	

	}

	@RequestMapping(value = "/getFamilyDetails/{familyname}", method = RequestMethod.GET)
	public List<Family> getFamilys(@PathVariable String familyname) {
		System.out.println("Getting Family details for " + familyname);

		List<Family> FamilyList = familyDB.get(familyname);
		if (FamilyList == null) {
			FamilyList = new ArrayList<Family>();
			Family std = new Family("Not Found", "N/A");
			FamilyList.add(std);
		}
		return FamilyList;
	}
}
