package flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flipkart.bean.Product;
import flipkart.service.ProductService;
import flipkart.serviceimpl.MyMobileServiceImp;

@RestController
@RequestMapping(value="/mobile")
public class ProductMobileController {
	// api for add product in db by admin

	// injecting the dependency of service class here in controller class  as DI
	@Autowired
	ProductService productService;

	@PostMapping(value = "/addmobileproduct")
	Product addMobileInfo(@RequestBody Product mobileproduct) {

		Product p = productService.addMobileInfo(mobileproduct);

		return p;

	}
             ///
	@GetMapping(value="/viewproductbyid")
	Product viewProductById() {
		return null;
		
	}
	
	 ///  we we need to update the url
	@PutMapping(value="/updateproductbyid")
	Product updateProductById() {
		return null;
		
	}
	
	 // delete api
	@DeleteMapping
	 ///  we need to delele based on id
		@PutMapping(value="/deleteproductbyid")
		String  deleteProductById() {
			return null;
		
		  //// first you need to check whether this id -101 exist or not
		   //// you need to check by calling in service viewProductById() where id is in db or not
		
		
		// if(id exist)
		///delete logic===== return "; "sucessfully delet this
	    //else{
		// return "id does exit
	       }
		   
			
			
			
		

}
