package Dao;

import Model.Promodel;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class ProDao {


	
	static Map<Integer,Promodel> doc= new HashMap <Integer,Promodel>();
	static{
		doc.put(1,new Promodel(1,"khyati","doctor","gfdhgf") );
		doc.put(2,new Promodel(2,"khyata","doctor","gfdhgf") );
	}

public Collection<Promodel> getAll(){
	return ProDao.doc.values();
}
public Promodel getDoctorById(int id)
{
return doc.get(id);
}
public void remove(int id) {
	doc.remove(id);
	// TODO Auto-generated method stub
	
}
public void updateDoctor(Promodel pro3) {
	// TODO Auto-generated method stub
 doc.put(pro3.getId(), pro3);
}
}
