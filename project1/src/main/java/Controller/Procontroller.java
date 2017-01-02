package Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Service.Proservice;
import Model.Promodel;

@RestController
@RequestMapping("/doc")
public class Procontroller {
@Autowired
Proservice proser;

@RequestMapping(value="/doctors", method=RequestMethod.GET)
public Collection<Promodel> getAll(){
return proser.getAll();
	}
@RequestMapping(value="/{id}" , method=RequestMethod.GET)
public Promodel getDoctorById( @PathVariable("id") int id)
{
return proser.getDoctorById(id);
}
@RequestMapping(value="/{id}" , method=RequestMethod.DELETE)
public void deleteByID(@PathVariable("id") int id){
	proser.remove(id);
}
@RequestMapping(method=RequestMethod.PUT ,consumes=MediaType.APPLICATION_JSON_VALUE)
public void updateDoctor(@RequestBody Promodel pro)
{
 proser.updateDoctor(pro);	
}
}
