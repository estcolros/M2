package Milestones;

public class Senior extends Empleat {
	protected String nom;
	protected double souBrutMens;
	protected double souNetMens;
	protected double souBrutAnu;
	protected double souNetAnu;

	public Senior(String nom, double sou, boolean bonus) {
		super();
		this.nom = nom;
		this.souBrutMens = sou * 0.95;

		if (this.souBrutMens < 2700) {
			this.souBrutMens = 2700;
		} else if (this.souBrutMens > 4000) {
			this.souBrutMens = 4000;
		}
		this.souNetMens = this.souBrutMens * 0.76;
		this.souBrutAnu = this.souBrutMens * 12;
		if (bonus) {
			souBrutAnu = bonus(souBrutAnu);
		}

		this.souNetAnu = this.souNetMens * 12;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSouBrutMens() {
		return souBrutMens;
	}

	public void setSouBrutMens(double souBrutMens) {
		this.souBrutMens = souBrutMens;
	}

	public double getSouNetMens() {
		return souNetMens;
	}

	public void setSouNetMens(double souNetMens) {
		this.souNetMens = souNetMens;
	}

	public double getSouBrutAnu() {
		return souBrutAnu;
	}

	public void setSouBrutAnu(double souBrutAnu) {
		this.souBrutAnu = souBrutAnu;
	}

	public double getSouNetAnu() {
		return souNetAnu;
	}

	public void setSouNetAnu(double souNetAnu) {
		this.souNetAnu = souNetAnu;
	}

	@Override
	public String toString() {
		return "Senior [nom=" + nom + ", souBrutMens=" + souBrutMens + ", souNetMens=" + souNetMens + ", souBrutAnu="
				+ souBrutAnu + ", souNetAnu=" + souNetAnu + "]";
	}

}