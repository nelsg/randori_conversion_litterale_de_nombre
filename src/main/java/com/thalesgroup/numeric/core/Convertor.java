package com.thalesgroup.numeric.core;

public class Convertor {

	private static final String DIX_NEUF = "DIX-NEUF";
	private static final String DIX_HUIT = "DIX-HUIT";
	private static final String DIX_SEPT = "DIX-SEPT";
	private static final String SEIZE = "SEIZE";
	private static final String QUINZE = "QUINZE";
	private static final String QUATORZE = "QUATORZE";
	private static final String TREIZE = "TREIZE";
	private static final String DOUZE = "DOUZE";
	private static final String ONZE = "ONZE";
	private static final String ERREUR_1_SAISIE_INCORRECTE = "ERREUR 1 : saisie incorrecte";
	private static final String UN = "UN";
	private static final String DEUX = "DEUX";
	private static final String TROIS = "TROIS";
	private static final String QUATRE = "QUATRE";
	private static final String CINQ = "CINQ";
	private static final String SIX = "SIX";
	private static final String SEPT = "SEPT";
	private static final String HUIT = "HUIT";
	private static final String NEUF = "NEUF";
	private static final String DIX = "DIX";

	public static String convert(int numberToConvert) {

		switch (numberToConvert) {
		case 1:
			return UN;
		case 2:
			return DEUX;
		case 3:
			return TROIS;
		case 4:
			return QUATRE;
		case 5:
			return CINQ;
		case 6:
			return SIX;
		case 7:
			return SEPT;
		case 8:
			return HUIT;
		case 9:
			return NEUF;
		case 10:
			return DIX;
		case 11:
			return ONZE;
		case 12:
			return DOUZE;
		case 13:
			return TREIZE;
		case 14:
			return QUATORZE;
		case 15:
			return QUINZE;
		case 16:
			return SEIZE;
		case 17:
			return DIX_SEPT;
		case 18:
			return DIX_HUIT;
		case 19:
			return DIX_NEUF;
		default:
			return ERREUR_1_SAISIE_INCORRECTE;
		}
	}

	public static String convertTens(int tensToConvert) {
		switch (tensToConvert) {
		case 1:
			return "DIX";
		case 2:
			return "VINGT";
		case 3:
			return "TRENTE";
		case 4:
			return "QUARANTE";
		case 5:
			return "CINQUANTE";
		case 6:
			return "SOIXANTE";
		default:
			return ERREUR_1_SAISIE_INCORRECTE;
		}
	}
	

}
