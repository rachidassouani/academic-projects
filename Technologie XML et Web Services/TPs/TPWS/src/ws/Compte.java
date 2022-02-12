package ws;

import java.util.Date;

public class Compte {

	private int code;
	private double solde;
	private Date creationDate;
	
	/*
	 * Constructors
	 */
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compte(int code, double solde, Date creationDate) {
		super();
		this.code = code;
		this.solde = solde;
		this.creationDate = creationDate;
	}

	/*
	 * Getters & Setters
	 */
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
