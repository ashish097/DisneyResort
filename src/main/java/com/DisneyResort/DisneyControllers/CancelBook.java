package com.DisneyResort.DisneyControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.DisneyResort.Disney.DiningReservation;
import com.DisneyResort.Disney.ResortReservation;
import com.DisneyResort.Disney.DisneyService.DisneyService;


@RestController
public class CancelBook {
	
	@Autowired
	private DisneyService disneyservice;
	
	
	@DeleteMapping("/resort/{id}")
	public ResponseEntity<ResortReservation> cancelResort(@PathVariable("id") int id) 
	{
		
		disneyservice.cancelresortbooking(id);
		return new ResponseEntity<ResortReservation>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/dining/{id}")
	public ResponseEntity<DiningReservation> cancelDining(@PathVariable("id") int id) 
	{
		
		disneyservice.canceldiningbooking(id);
		return new ResponseEntity<DiningReservation>(HttpStatus.ACCEPTED);
	}	

}
