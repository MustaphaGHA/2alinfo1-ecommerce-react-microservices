package org.o7planning;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Facture {
	@Id
	@GeneratedValue
	private int numFact;
	private float totalFact;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateFact;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateRelance ;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date datePaiement ;
	public int getNumFact() {
		return numFact;
	}
	public void setNumFact(int numFact) {
		this.numFact = numFact;
	}
	public float getTotalFact() {
		return totalFact;
	}
	public void setTotalFact(float totalFact) {
		this.totalFact = totalFact;
	}
	public Date getDateFact() {
		return dateFact;
	}
	public void setDateFact(Date dateFact) {
		this.dateFact = dateFact;
	}
	public Date getDateRelance() {
		return dateRelance;
	}
	public void setDateRelance(Date dateRelance) {
		this.dateRelance = dateRelance;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public Facture(int numFact, float totalFact, Date dateFact, Date dateRelance, Date datePaiement) {
		super();
		this.numFact = numFact;
		this.totalFact = totalFact;
		this.dateFact = dateFact;
		this.dateRelance = dateRelance;
		this.datePaiement = datePaiement;
	}
	@Override
	public String toString() {
		return "Facture [numFact=" + numFact + ", totalFact=" + totalFact + ", dateFact=" + dateFact + ", dateRelance="
				+ dateRelance + ", datePaiement=" + datePaiement + "]";
	}
	public Facture() {
		super();
	}


}
