package fr.dm2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Comme vu en cours avec la fonction `generateSpaceTabs()`,
 * pour chaque fonction de la classe {@link MathUtils},
 * testez le cas nominal, vide (cf: 0 et/ou null et/ou ""), et d'erreur.
 * N'oubliez pas d'indiquer le nom des trois blocs dans chacunes de vos fonctions de test (cf: GIVEN/WHEN/THEN)
 * Vous ne devrez PAS modifier la classe {@link MathUtils}, mais observez attentivement l'implémentation des méthodes de la classe {@link MathUtils}
 */
public class MathUtilsTest {
	private MathUtils mathUtils = new MathUtils();

	// TODO: Créez les méthodes de test ICI
	@Test
	public void powernominal_Test(){
		//GIVEN
		int actual;
		int expected = 36;
		//WHEN
		actual = mathUtils.power(6, 6);
		//THEN
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void factorialnominal_Test(){
		//GIVEN
		int actual;
		int expected = 720;
		//WHEN
		actual = mathUtils.factorial(6);
		//THEN
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void factorialTest_error(){
		//GIVEN
		int i = -1;
		//WHEN
		mathUtils.factorial(i);
		//THEN => EXCEPTION
	}

	@Test
	public void fibonaccinominal_Test(){
		//GIVEN
		int actual;
		int expected = 987;
		//WHEN
		actual = mathUtils.fibonacci(16);
		//THEN
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void fibonacciTest_error(){
		//GIVEN
		int i = -1;
		//WHEN
		mathUtils.fibonacci(i);
		//THEN => EXCEPTION
	}
}