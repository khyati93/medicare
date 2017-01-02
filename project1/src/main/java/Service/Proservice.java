package Service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Dao.ProDao;
import Model.Promodel;

@Service
public class Proservice{
	
	@Autowired
	ProDao pro;
	
	public Collection<Promodel> getAll(){
		
	return pro.getAll();
	}
	public Promodel getDoctorById(int id)
	{
	return pro.getDoctorById(id);
	}
	public void remove(int id) {
		pro.remove(id);
		// TODO Auto-generated method stub
		
	}
	public void updateDoctor(Promodel pro2) {
		// TODO Auto-generated method stub
		 pro.updateDoctor(pro2);
	}

}
