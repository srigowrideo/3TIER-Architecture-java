package threetierarch;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Employer extends Person {

	private String company;
		
	public Employer(){}
		
	public Employer(String name, String company) {
		super(name);
		this.company = company;
	}
}