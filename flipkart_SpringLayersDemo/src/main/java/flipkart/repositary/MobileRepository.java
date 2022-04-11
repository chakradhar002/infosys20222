package flipkart.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import flipkart.bean.Product;
//Long is object type and it respresent primary key (unique)
@Repository
public interface MobileRepository  extends JpaRepository<Product, Long>{

}
