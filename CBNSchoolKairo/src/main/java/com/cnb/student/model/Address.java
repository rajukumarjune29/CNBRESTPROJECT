package com.cnb.student.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer addressId;
	@Column(length = 100)
	private String address1;
	@Column(length = 100)
	private String address2;
	@Column(length = 40)
	private String village;
	@Column(length = 40)
	private String street;
	@Column(length = 40)
	private String block;
	@Column(length = 40)
	private String district;
	@Column(length = 40)
	private String state;
	@Column(length = 40)
	private String country;
	@ManyToMany(mappedBy = "addresses")
	@JsonBackReference
	private Set<Student> students;
}
