package Milestones;

public class Junior extends Empleat {
	protected String nom;
	protected double souBrutMens;
	protected double souNetMens;
	protected double souBrutAnu;
	protected double souNetAnu;

	public Junior(String nom, double sou, boolean bonus) {
		this.nom = nom;
		this.souBrutMens = sou * 0.85;

		if (this.souBrutMens < 900) {
			this.souBrutMens = 900;
		} else if (this.souBrutMens > 1600) {
			this.souBrutMens = 1600;
		}
		this.souNetMens = this.souBrutMens * 0.98;
		this.souBrutAnu = this.souBrutMens * 12;
		this.souNetAnu = this.souNetMens * 12;

		if (bonus) {
			this.souBrutAnu = bonus(souBrutAnu);
			this.souNetAnu = bonus(souNetAnu);
		}

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
		return "Junior [nom=" + nom + ", souBrutMens=" + souBrutMens + ", souNetMens=" + souNetMens + ", souBrutAnu="
				+ souBrutAnu + ", souNetAnu=" + souNetAnu + "]";
	}

}
