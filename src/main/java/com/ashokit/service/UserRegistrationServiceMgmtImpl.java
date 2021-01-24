package com.ashokit.service;


import java.util.Random;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.entity.UserRegistration;
import com.ashokit.repository.UserRegistrationRepo;
@Service
public class UserRegistrationServiceMgmtImpl implements UserRegistrationServiceMgmt {
  @Autowired
	private UserRegistrationRepo repo;
  
	@Override
	public String saveUser(UserRegistration user) {
		String body=null;
		RestTemplate rt=new RestTemplate();
		String endPointUrl="http://localhost:2222/varifyUser/{ssnNo}";
		
		ResponseEntity<String> forEntity = rt.getForEntity(endPointUrl, String.class, user.getSsnNo());
		  int statusCode = forEntity.getStatusCodeValue();
		  if(statusCode==200) {
		     body = forEntity.getBody();
		}
		  //use repo
		// String s = ;
		  user.setRegId(generateId());
		  UserRegistration saveUser = repo.save(user);
		  if(saveUser!=null)
		return "User Registration successful with AR ID:"+user.getRegId();
		  else
			  return "User registration failed..!invalid ssn";
	}
	
	public static String generateId() {
        String uuid = UUID.randomUUID().toString().substring(1, 6).replace("-", "");
        return  uuid;
    }

}
