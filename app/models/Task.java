package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Task extends Model 
{
	@Id
	public Long id;
	
	@Required
	public String description;
	
	public static void listar()
	{
		List<Task> tasks = null;
	}
	
	public static void crear(String descripcion)
	{
		
	}
	
	public static void delete(Long id)
	{
		
	}

}
