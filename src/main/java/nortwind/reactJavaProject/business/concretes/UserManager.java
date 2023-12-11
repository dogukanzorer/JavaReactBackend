package nortwind.reactJavaProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import nortwind.reactJavaProject.business.abstracts.UserService;
import nortwind.reactJavaProject.core.dataAccess.UserDao;
import nortwind.reactJavaProject.core.entities.User;
import nortwind.reactJavaProject.core.utilities.results.DataResult;
import nortwind.reactJavaProject.core.utilities.results.Result;
import nortwind.reactJavaProject.core.utilities.results.SuccessDataResult;
import nortwind.reactJavaProject.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Success!");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Eklendi!");
	}

}
