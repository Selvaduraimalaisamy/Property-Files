package com.Proper.Controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Proper.Service.TestService;

@SpringBootApplication(scanBasePackages=("com.Proper"))
@RestController
@RequestMapping("/api/")

public class Controller {
	@Autowired Environment files;
	@Autowired TestService obj;

   String Calculation;
	@RequestMapping(value = "testApi", method = RequestMethod.GET)
	public ResponseEntity<?>testApi(@RequestParam String op)throws Exception{
		int n1=Integer.parseInt(files.getProperty("Selva"));
		int n2=Integer.parseInt(files.getProperty("Durai"));
		
		switch (op) {
		case "add":
			Calculation = "ADDITION = " + obj.add(n1, n2);
			break;
		case "sub":
			Calculation = "SUBTRACTION = " + obj.sub(n1, n2);
			break;
		case "mul":
			Calculation = "MULTIPLICATION = " + obj.mul(n1, n2);
			break;
		case "div":
			Calculation = "DIVISION = " + obj.div(n1, n2);
			break;
		}
		return new ResponseEntity<>(Calculation, HttpStatus.OK);

	
	
    
}
}
