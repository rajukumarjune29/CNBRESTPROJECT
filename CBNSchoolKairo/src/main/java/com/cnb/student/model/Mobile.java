package com.cnb.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mobileId;
	@Column(length = 12)
	private String number;
	@ManyToOne
	@JoinColumn(name = "studentId")
	@JsonBackReference
	private Student student;

}
