package nortwind.reactJavaProject.business.abstracts;

import java.util.List;

import nortwind.reactJavaProject.core.entities.User;
import nortwind.reactJavaProject.core.utilities.results.DataResult;
import nortwind.reactJavaProject.core.utilities.results.Result;


public interface UserService {
	
	Result add(User user);
	DataResult<User> findByEmail(String email);
	DataResult<List<User>> getAll();
	

}
