package com.toto.pokeapi.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.toto.pokeapi.models.entity.BerriesFirmnesses;
import com.toto.pokeapi.models.entity.Berry;

@RestController
public class BerryController {

	@Autowired(required = true)
	private RestTemplate restTemplate;
	
	private String url = "https://pokeapi.co/api/v2/berry/";
	private String berry_firmness_url = "https://pokeapi.co/api/v2/berry-firmness/";
	
	@GetMapping("/berry/{id}")
	public ResponseEntity<?> getBerryById(@PathVariable int id){
		Map<String, Object> response = new HashMap<>();
		try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<Berry> berry = restTemplate.exchange(url + id, HttpMethod.GET, entity, Berry.class);

            return new ResponseEntity<Berry>(berry.getBody(), HttpStatus.OK);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
	}

	@GetMapping("/berry/name/{name}")
	public ResponseEntity<?> getBerryByName(@PathVariable String name){
		Map<String, Object> response = new HashMap<>();
		try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<Berry> berry = restTemplate.exchange(url + name, HttpMethod.GET, entity, Berry.class);

            return new ResponseEntity<Berry>(berry.getBody(), HttpStatus.OK);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/berry-firmness/{id}")
	public ResponseEntity<?> getBerryFirmnessById(@PathVariable int id){
		Map<String, Object> response = new HashMap<>();
		try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<BerriesFirmnesses> berry = restTemplate.exchange(berry_firmness_url + id, HttpMethod.GET, entity, BerriesFirmnesses.class);

            return new ResponseEntity<BerriesFirmnesses>(berry.getBody(), HttpStatus.OK);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);

	}
	
	@GetMapping("/berry-firmness/name/{name}")
	public ResponseEntity<?> getBerryFirmnessByName(@PathVariable String name){
		Map<String, Object> response = new HashMap<>();
		try {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            ResponseEntity<BerriesFirmnesses> berry = restTemplate.exchange(berry_firmness_url + name, HttpMethod.GET, entity, BerriesFirmnesses.class);

            return new ResponseEntity<BerriesFirmnesses>(berry.getBody(), HttpStatus.OK);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);

	}
	
}
