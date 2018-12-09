package fr.dm2;
import java.util.Arrays;

/**
 * TODO: Impl�mentez les m�thodes de la classe courante. Vous n'avez pas le droit de modifier la signature des m�thodes de la classe courante
 * TODO: Attention, vous n'avez pas le droit d'utiliser la fonction `sort()` de la biblioth�que Java, sinon ce serait trop facile.
 */
public class SortUtils {

	/**
	 * Prend un param�tre un tableau et tri les valeurs dans l'entre croissant.
	 *
	 * Ex: en entr�e => "[6, 4, 3, 4, 8, 9]" donne en sortie "[3, 4, 4, 6, 8, 9]"
	 *
	 * Un tableau vide (un tableau qui existe mais qui n'a pas d'�l�ment) devra retourner un tableau vide.
	 * Un tableau null devra d�clencher un {@link IllegalArgumentException}
	 *
	 * @param array 	Tableau avec des �l�ment en d�sordre
	 * @return			Tableau avec des �l�ment dans l'ordre
	 */
	public int[] sort(int[] array) {
		if(array == null){
			throw new IllegalArgumentException("Array can't be null");
		}
	 int t=array.length;
	 for(int j=0; j<t-1; j++) {
		for(int i=0; i<t-1; i++) {
			if(array[i]>array[i+1]){
				int y =array[i];
				array[i]=array[i+1];
				array[i+1]=y;
				
			}
		}}
		//System.out.println(Arrays.toString(array));
	return array;
	
	}
} 