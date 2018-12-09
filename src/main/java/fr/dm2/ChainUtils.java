package fr.dm2;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes.
 */
public class ChainUtils {

	/**
	 * Prend une chaine de caractères en paramètre et retourne le mot avec la première lettre en majuscule.
	 *
	 * Ex: en entrée "jE sUIS baTMan" retournera "Je Suis Batman"
	 *
	 * @param chain		Chaine de caractères
	 * @return
	 */
	public String capitalize(String chain) {
		// TODO
	
		String c;
		c = chain.toLowerCase();
		c.trim();
		c=c.replaceFirst(c.substring(0, 1), c.substring(0, 1).toUpperCase());
		int i;
		int t = chain.length();
		for(i=0; i<t; i++) {
			if(c.substring(i, i+1).equals (" ")) {
				c=c.substring(0, i+1)+c.substring(i+1, i+2).toUpperCase()+c.substring(i+2, t);
			}
		}
		System.out.println(c);
		
		return chain;
	}
}
