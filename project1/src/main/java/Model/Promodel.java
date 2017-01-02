package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promodel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String expertise;
	private String eid;
	
	public Promodel(){}
	public Promodel(int id,String name, String expertise, String eid) {
		
	    this.id=id;
		this.name = name;
		this.expertise = expertise;
		this.eid = eid;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}

}
