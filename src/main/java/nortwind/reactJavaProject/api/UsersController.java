package nortwind.reactJavaProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import nortwind.reactJavaProject.business.abstracts.UserService;
import nortwind.reactJavaProject.core.entities.User;
import nortwind.reactJavaProject.core.utilities.results.DataResult;
import nortwind.reactJavaProject.core.utilities.results.Result;


@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	@GetMapping("/user")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}

}
