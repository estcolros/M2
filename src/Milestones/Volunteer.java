package Milestones;

public class Volunteer extends Empleat {
	protected String nom;
	protected double sou;
	protected double ajut;

	public Volunteer(String nom, double ajut) {
		this.nom = nom;
		this.sou = 0;
		this.ajut = ajut;
		this.sou += ajut;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSou() {
		return sou;
	}

	public void setSou(double sou) {
		this.sou = sou;
	}

}