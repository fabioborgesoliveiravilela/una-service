package br.com.una.unaservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_aluno")
@SequenceGenerator(name = "seq_aluno", sequenceName = "seq_aluno", allocationSize = 1, initialValue = 1)
public class Aluno implements Serializable {

	private static final long	serialVersionUID	= 1L;

	@Id
	@Column(name = "id_aluno")
	@GeneratedValue(generator = "seq_aluno", strategy = GenerationType.SEQUENCE)
	private Integer				id;

	@Column(name = "name_aluno", nullable = false, length = 100)
	private String				name;

	@Column(name = "course_aluno", nullable = false, length = 100)
	private String				course;

	@Column(name = "birth_date_aluno", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date				birthDate;

	public Integer getId() {

		return id;
	}

	public void setId(Integer id) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getCourse() {

		return course;
	}

	public void setCourse(String course) {

		this.course = course;
	}

	public Date getBirthDate() {

		return birthDate;
	}

	public void setBirthDate(Date birthDate) {

		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
