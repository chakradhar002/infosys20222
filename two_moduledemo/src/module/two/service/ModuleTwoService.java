package module.two.service;


import module.one.service.ModuleOneService;
// access module one from here
public class ModuleTwoService {
	
	static ModuleOneService modOneServ = new ModuleOneService();
	
	public static void main(String[] args) {
		modOneServ.externalAccessible("Module Two Service");
	}
}