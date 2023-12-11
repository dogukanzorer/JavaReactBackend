package nortwind.reactJavaProject.business.abstracts;

import java.util.List;



import nortwind.reactJavaProject.core.utilities.results.DataResult;
import nortwind.reactJavaProject.core.utilities.results.Result;
import nortwind.reactJavaProject.entities.concretes.Product;

public interface ProductService {
	
	 DataResult<List<Product>> getAll();
	 
     DataResult<List<Product>> getAll(int pageNo, int pageSize);
     
     Result add(Product product);
     
     DataResult<Product> findById(int id);
    
     DataResult<Product> getByProductName(String productName);
	  
     DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
     DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	  
     DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
     DataResult<List<Product>> getByProductNameContains(String productName);
	  
     DataResult<List<Product>> getByProductNameStartsWith(String productName);

     DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

}
