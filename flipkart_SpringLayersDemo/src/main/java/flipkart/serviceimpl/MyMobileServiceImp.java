package flipkart.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flipkart.bean.Product;
import flipkart.repositary.MobileRepository;
import flipkart.service.ProductService;

@Service
public class MyMobileServiceImp implements ProductService{
	
	// this is the way where we can combine the interface with service class using autowiring
	//DI process
	@Autowired
	MobileRepository mobileRepository;

         //this is the place where we asssembled the persistance layer logic
	public Product addMobileInfo(Product mobileprodcut) {
		
		Product prod = mobileRepository.save(mobileprodcut);// insert into tablename value
		//interact with db
		return prod;
	}

}
