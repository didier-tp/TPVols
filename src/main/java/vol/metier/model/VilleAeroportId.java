package vol.metier.model;

import java.io.Serializable;

public class VilleAeroportId implements Serializable {

	private Long ville;
	private Long aeroport;

	public Long getVille() {
		return ville;
	}

	public void setVille(Long ville) {
		this.ville = ville;
	}

	public long getAeroport() {
		return aeroport;
	}

	public void setAeroport(Long aeroport) {
		this.aeroport = aeroport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aeroport ^ (aeroport >>> 32));
		result = prime * result + (int) (ville ^ (ville >>> 32));
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
		VilleAeroportId other = (VilleAeroportId) obj;
		if (aeroport != other.aeroport)
			return false;
		if (ville != other.ville)
			return false;
		return true;
	}

}
