package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link ListUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 */
public class ListUtilsTest {
	private ListUtils listUtils = new ListUtils();

	// TODO: Créez les méthodes de test ICI
	public void cutnominal_test() {
        // GIVEN
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(13);
        list.add(19);
        list.add(50);
        list.add(11);
        list.add(4);
        list.add(12);
        list.add(6);
        list.add(3);
        list.add(14);
        list.add(17);
        list.add(15);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(77);
        list.add(55);
        list.add(10);
        int size = 5;
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(new ArrayList<Integer>(list.subList(5,10)));
        expected.add(new ArrayList<Integer>(list.subList(10,15)));
        expected.add(new ArrayList<Integer>(list.subList(15,20)));
        expected.add(new ArrayList<Integer>(list.subList(20,25)));
        expected.add(new ArrayList<Integer>(list.subList(25,27)));

        // WHEN
        List<List<Integer>> actual = listUtils.cut(list,size);

        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cuttest_emptylist(){
        //GIVEN
        List<Integer> list = new ArrayList<Integer>();
        int size = 10;
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        //WHEN
         List<List<Integer>> actual = listUtils.cut(list, size);
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class )
    public void cuttest_error(){
        //GIVEN
        List<Integer> list = null;
        int size = 10;
        //WHEN
            List<List<Integer>> actual = listUtils.cut(list, size);

        //THEN => EXCEPTION
    }





}
