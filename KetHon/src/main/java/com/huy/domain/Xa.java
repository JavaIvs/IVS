package com.huy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "xa")
public class Xa implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "xa_id", nullable = false)
	private int id;

	@Column(name = "xa_ten", nullable = false)
	private String name;
	
	@Column(name = "huyen_id", nullable = false)
	private String mahuyen;
	
	public Xa() {
        super();
    }

	public Xa(int id, String name, String mahuyen) {
		super();
		this.id = id;
		this.name = name;
		this.mahuyen = mahuyen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMahuyen() {
		return mahuyen;
	}

	public void setMahuyen(String mahuyen) {
		this.mahuyen = mahuyen;
	}
}
