package module.one.service;

import module.one.util.ModuleOneUtil;

public class ModuleOneService {

	static ModuleOneUtil modOneUtil = new ModuleOneUtil();

	public void externalAccessible(String text) {
		System.out.println(" accessing logic here - " + text);//invoke this logic
		// Accessing Internal Package Within the Same Module:
		System.out.println("Module One Service can access - " + modOneUtil.internalAccessible());
	}

}
