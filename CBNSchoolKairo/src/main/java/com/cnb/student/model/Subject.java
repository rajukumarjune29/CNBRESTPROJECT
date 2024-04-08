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
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer subjectId;
	@Column(length = 30)
	private String name;
	@ManyToMany(mappedBy = "subjects")
	@JsonBackReference
	private Set<Student> students;
}
