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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.toto.pokeapi.models.entity.Pokemon;

//ruta donde se puede consumir este servicio
@CrossOrigin(origins = {"https://totopokeapi.herokuapp.com/" })
@RestController
public class PokemonController {

	//metodo para conatruir la peticion 
	@Autowired(required = true)
	private RestTemplate restTemplate;
	
	//url para obtener la informacion de los pokemons
	private String url = "https://pokeapi.co/api/v2/pokemon/";
	
	//metodo GET para obtener la informacion de los pokemos por ID
	@GetMapping("/pokemon/{id}")
	public ResponseEntity<?> getPokemonsById(@PathVariable int id){
		Map<String, Object> response = new HashMap<>();
		try {
			//Construccion de la peticion
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            //obtencion de la informacion
            ResponseEntity<Pokemon> pokemon = restTemplate.exchange(url + id, HttpMethod.GET, entity, Pokemon.class);
            
            //retornando la informacion obtenida
            return new ResponseEntity<Pokemon>(pokemon.getBody(), HttpStatus.OK);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
		//mensaje de error en caso de que no exista el pokemon 
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
	}
	
	//metodo GET para obtener la informacion de los pokemos por nombre
	@GetMapping("/pokemon/name/{name}")
	public  ResponseEntity<?> getPokemonsByName(@PathVariable String name){
		Map<String, Object> response = new HashMap<>();
		try {
	            HttpHeaders headers = new HttpHeaders();
	            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

	            ResponseEntity<Pokemon> pokemon = restTemplate.exchange(url + name, HttpMethod.GET, entity, Pokemon.class);

	            return new ResponseEntity<Pokemon>(pokemon.getBody(), HttpStatus.OK);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		response.put("mensaje: ", " El pokemon no existe");
		response.put("status: ", " 404 Not Found");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);

	}
	
}
