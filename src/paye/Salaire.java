package paye;

public class Salaire {
	
	private static final float majoration = (float) 0.25;

	/**
	 * 
	 * @param nombreHeures
	 * @param tauxHoraire
	 * @return
	 * @throws Exception
	 */
	public float calculer(int nombreHeures, int tauxHoraire) throws Exception{
		if(nombreHeures > 80) throw new Exception("Heures > 80");
		if(nombreHeures <= 0) throw new Exception("Heures <= 0");
		if(tauxHoraire <= 0) throw new Exception("Taux horaire <= 0");
		if(tauxHoraire > 50) throw new Exception("Taux horaire > 50");
		float salaire = nombreHeures * tauxHoraire;
		if(nombreHeures > 35) {
			salaire = (float) (salaire + (nombreHeures-35) * tauxHoraire * majoration);
		}
		return salaire;
	}

}
