package fr.dm2;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Implémentez les méthodes de la classe courante. Vous n'avez pas le droit de modifier la signature des méthodes de la classe courante..
 */
public class ListUtils {

	/**
	 * Prend une liste en paramètre, la découpe et retourne une liste de liste avec la taille indiquée.
	 *
	 * Ex: en entrée j'ai une liste de 41 éléments, j'indique la taille (size) de découpage à 10,
	 * et j'obtiens en sortie une liste de 5 listes dont les 4 premières listes contiennent 10 éléments et la dernière liste 1 élément
	 *
	 * @param list		Une liste
	 * @param size		Taille désirée
	 * @return
	 */
	public <T> List<List<T>> cut(List<T> list, int size) throws RuntimeException {
		// TODO
		if(list == null){
			throw new RuntimeException("Check you're list it's empty !");
		}
		List<List<T>> newList = new ArrayList<List<T>>();
		int taille = list.size();
		int i;
		
		if(size > taille) {
			throw new RuntimeException("Please select an appropriate cutting number !");
		}
		
		for (i = 0; i < taille; i += size) {
			if((i+size) < taille) {
			newList.add(new ArrayList<T>(list.subList(i, i + size)));
			}
			else {
				newList.add(new ArrayList<T>(list.subList(i, taille)));
			}
		}
		return newList;
	}
}
