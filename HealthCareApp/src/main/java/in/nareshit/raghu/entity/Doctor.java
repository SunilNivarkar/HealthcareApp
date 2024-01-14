package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data	
@Entity
@Table(name="doc_tab")
public class Doctor {
	@Id
	@Column(name="doc_id_col")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long docId;
	
	@Column(name="doc_Name_col")
	private String docName;
	
	@Column(name="doc_Email_col")
	private String docEmail;
	 
	@Column(name="doc_Addrs_col")
	private String docAddrs;
	
	@Column(name="doc_Mobile_col")
	private String docMobile;
	
	@Column(name="doc_Gen_col")
	private String docGen;
	
	@Column(name="doc_Note_col")
	private String docNote;

	//===========Module Integration=======
	@ManyToOne
	@JoinColumn(name="spec_id_fk_col")
	private Specialization specialization;
	
	
	
	
	
	
	
	
}
