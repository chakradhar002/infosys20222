package flipkart.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



//dto


@Entity
@Table(name="product")
public class Product {
	/// it pointing primarkey in the databae
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)// automatically insert primary key in db
	private long id;
	private String productname;
	private String brand;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
