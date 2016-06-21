/**
 * 
 */
package com.javatpoint;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
/**
 * @author sagar.cheke
 * @Description Hibernate Annotations are based on the JPA 2 specification and supports all the features.
 * All the JPA annotations are defined in the javax.persistence.* package. Hibernate EntityManager implements the interfaces and life cycle defined by the JPA specification.
 * The core advantage of using hibernate annotation is that you don't need to create mapping (hbm) file.
 * Here, hibernate annotations are used to provide the meta data.

 * @Entity annotation marks this class as an entity.
 * @Table annotation specifies the table name where data of this entity is to be persisted. 
 * If you don't use @Table annotation, hibernate will use the class name as the table name by default.
 * @Id annotation marks the identifier for this entity.
 * @Column annotation specifies the details of the column for this property or field. 
 * If @Column annotation is not specified, property name will be used as the column name by default.
 */

@Entity
@Table(name = "Employee12")
public class Employee {
	@Id
	private int Id;
	private String firstName, lastName;
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
