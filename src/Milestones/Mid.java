package Milestones;

public class Mid extends Empleat {
	protected String nom;
	protected double souBrutMens;
	protected double souNetMens;
	protected double souBrutAnu;
	protected double souNetAnu;

	public Mid(String nom, double sou, boolean bonus) {
		super();
		this.nom = nom;
		this.souBrutMens = sou * 0.9;

		if (this.souBrutMens < 1800) {
			this.souBrutMens = 1800;
		} else if (this.souBrutMens > 2500) {
			this.souBrutMens = 2500;
		}
		this.souNetMens = this.souBrutMens * 0.85;
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
		return "Mid [nom=" + nom + ", souBrutMens=" + souBrutMens + ", souNetMens=" + souNetMens + ", souBrutAnu="
				+ souBrutAnu + ", souNetAnu=" + souNetAnu + "]";
	}

}