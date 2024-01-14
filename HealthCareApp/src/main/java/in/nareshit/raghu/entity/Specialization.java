package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="spec_tab")
public class Specialization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.IDENTITY) //for my sql
	@Column(name="spec_id_col")
	private Long specId;
	
	@Column(name="spec_code_col",length=30)
	private String specCode;
	
	@Column(name="spec_name_col",length=30)
	private String specName;
	
	@Column(name="spec_note_col",length=30)
	private String specNote;

}
