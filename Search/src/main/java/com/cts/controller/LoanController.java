package com.cts.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bean.Loan;
import com.cts.service.LoanService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/loan")
public class LoanController {
	
	@Autowired
	LoanService service;
	
	@GetMapping(value = "/get/{loanNumber}")
	Optional<Loan> getLoanById(@PathVariable Long loanNumber) {
		return service.getLoanById(loanNumber);
	}

	
	

}
