package com.thalesgroup.numeric.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ConvertorTest {

	private static final String UN = "UN";
	private static final String ERREUR_1_SAISIE_INCORRECTE = "ERREUR 1 : saisie incorrecte";

	@Test
	public void convert_1() {
		// GIVEN
		Integer un = 1;
		// WHEN
		String result = Convertor.convert(un);
		// THEN
		Assert.assertEquals(UN, result);
	}

	@Test
	public void convert_Error() {
		// GIVEN
		Integer zero = 0;
		// WHEN
		String result = Convertor.convert(zero);
		// THEN
		Assert.assertEquals(ERREUR_1_SAISIE_INCORRECTE, result);
	}

	@Test
	public void convert_1_to_19() {
		// GIVEN
		List<String> numbers = new ArrayList<>();		
		numbers.add("UN");
		numbers.add("DEUX");
		numbers.add("TROIS");
		numbers.add("QUATRE");
		numbers.add("CINQ");
		numbers.add("SIX");
		numbers.add("SEPT");
		numbers.add("HUIT");
		numbers.add("NEUF");
		numbers.add("DIX");
		numbers.add("ONZE");
		numbers.add("DOUZE");
		numbers.add("TREIZE");
		numbers.add("QUATORZE");
		numbers.add("QUINZE");
		numbers.add("SEIZE");
		numbers.add("DIX-SEPT");
		numbers.add("DIX-HUIT");
		numbers.add("DIX-NEUF");
		for (int i = 1; i < 20; i++) {
			// WHEN
			String result = Convertor.convert(i);
			// THEN
			Assert.assertEquals(numbers.get(i-1), result);
		}
	}
	
	@Test
	public void convert_tens() {
		// GIVEN : 20 à 60	
		List<String> tens = new ArrayList<>();
		tens.add("DIX");
		tens.add("VINGT");
		tens.add("TRENTE");
		tens.add("QUARANTE");
		tens.add("CINQUANTE");
		tens.add("SOIXANTE");
		
		List<String> results =new ArrayList<>(); 
		
		for (int i = 1; i < 7 ; i++) {
			// WHEN
			results.add(Convertor.convertTens(i));
			
		}				
		// THEN		
		Assert.assertArrayEquals(tens.toArray(), results.toArray());
		
	}
	
	@Test
	public void convert_70_Error() {
		// GIVEN
		Integer soixante_dix = 7;
		// WHEN
		String result = Convertor.convertTens(soixante_dix);
		// THEN
		Assert.assertEquals(ERREUR_1_SAISIE_INCORRECTE, result);
	}
	
}
