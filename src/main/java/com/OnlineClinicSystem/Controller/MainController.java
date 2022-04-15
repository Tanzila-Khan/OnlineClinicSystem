package com.OnlineClinicSystem.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.OnlineClinicSystem.entity.*;
import com.OnlineClinicSystem.entityRepo.userProfileRepo;



@Controller
public class MainController {
	
	private userProfileRepo repo;
	

	@Autowired
	public void setRepo(userProfileRepo repo) {
		this.repo = repo;
	}
	
	
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@PostMapping(value = "/userRegistration/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<userProfile> createUser(@RequestBody final userProfile user) {
	
		repo.save(user);
	return new ResponseEntity<userProfile>(user, HttpStatus.CREATED);
	}
	@GetMapping("/user/{email}")
	public ResponseEntity<userProfile> getUserByemail(@PathVariable("email") final String email) {
	Optional	<userProfile> user = Optional.of(repo.findByemail(email));
	userProfile u=user.get();
	System.out.println(u.getId()+" " +u.getDob()+" "+u.getFirstname());
	return new ResponseEntity<userProfile>(u, HttpStatus.OK);
	}
	
}
