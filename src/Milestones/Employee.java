package Milestones;

public class Employee extends Empleat{
	protected String nom;
	protected double sou;
	protected final double souBaseMen=1000;

	public Employee(String nom) {
		super();
		this.nom = nom;
		//Antes el souBaseMen estaba en la clase empleat
		this.sou = souBaseMen*0.85;
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

	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", sou=" + sou + "]";
	}

}