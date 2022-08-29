package com.springboot.test.controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.model.Client;
@RestController
public class ClientController {

 @RequestMapping(value = "/client", method = RequestMethod.GET)

 public Client firstPage() {

	 Client client1 = new Client();

	 client1.setName("sagarika");

	 client1.setProject("Bank management");

	 client1.setProjectId("BM121");

 
 return client1;

 }
}