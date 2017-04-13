/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.arqsoft.messenger.endpoint;

import co.edu.unal.arqsoft.messenger.dto.UserDTO;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author alex
 */
@RestController
public class UserEP {
    //-------------------Retrieve All Users--------------------------------------------------------

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> listAllUsers() {
//		List<User> users = userService.findAllUsers();
//		if(users.isEmpty()){
//			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
//		}
//		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
        return null;
    }

    //-------------------Retrieve Single User--------------------------------------------------------
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") long id) {
        UserDTO user = new UserDTO();
//		System.out.println("Fetching User with id " + id);
//		User user = userService.findById(id);
//		if (user == null) {
//			System.out.println("User with id " + id + " not found");
//			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<User>(user, HttpStatus.OK);
        return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
    }

    //-------------------Create a User--------------------------------------------------------
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody UserDTO user, UriComponentsBuilder ucBuilder) {
//		System.out.println("Creating User " + user.getName());
//
//		if (userService.isUserExist(user)) {
//			System.out.println("A User with name " + user.getName() + " already exist");
//			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//		}
//
//		userService.saveUser(user);
//
        HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //------------------- Update a User --------------------------------------------------------
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") long id, @RequestBody UserDTO user) {
        System.out.println("Updating User " + id);

        UserDTO currentUser = new UserDTO();
//		
//		if (currentUser==null) {
//			System.out.println("User with id " + id + " not found");
//			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//
//		currentUser.setName(user.getName());
//		currentUser.setAge(user.getAge());
//		currentUser.setSalary(user.getSalary());
//		
//		userService.updateUser(currentUser);
        return new ResponseEntity<UserDTO>(currentUser, HttpStatus.OK);
    }

    //------------------- Delete a User --------------------------------------------------------
}
