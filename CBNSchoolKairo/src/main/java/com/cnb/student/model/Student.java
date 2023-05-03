package com.cnb.student.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	@Column(length = 50)
	private String name;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "StudentSubject", joinColumns = { @JoinColumn(name = "studentId") }, inverseJoinColumns = {
			@JoinColumn(name = "subjectId") })
	@JsonManagedReference
	@JsonIgnore
	private Set<Subject> subjects;
	@Column(length = 50)
	private String className;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "StudentAddress", joinColumns = { @JoinColumn(name = "studentId") }, inverseJoinColumns = {
			@JoinColumn(name = "addressId") })
	@JsonManagedReference
	@JsonIgnore
	private Set<Address> addresses;
	@Column(length = 100)
	private String emails;
	@OneToMany(mappedBy = "student")
	@JsonManagedReference
	@JsonIgnore
	private Set<Mobile> mobiles;
	@Column(length = 20)
	private String gender;
	private String dob;

}
