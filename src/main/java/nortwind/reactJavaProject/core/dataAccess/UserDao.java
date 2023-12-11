package nortwind.reactJavaProject.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import nortwind.reactJavaProject.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
