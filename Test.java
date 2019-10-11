package no.itfakultetet;


public class Test {

	static String navn = "Petter";
	static String adresse = "Bakken 23";
	static String postnummer = "0345";

	
	public static void main(String[] args) {

		System.out.println(navn + " bor i " + adresse + ", med postnummer " + postnummer);
		
        String tekst1;
        String tekst2 = "Dette er tekst nummer 2\n"; // \ escaper teksten og utfører n for new line. \\ gir backslash
        String tekst3 = new String("Og DETTE er tekst nummer 3");
        StringBuffer tekst4 = new StringBuffer();
        StringBuffer tekst5 = new StringBuffer("Dette er tekst 5");

        // System.out.println(tekst1); Ville gitt feilmelding siden tekst1 ikke er
        // initialisert til en verdi.

        System.out.println(tekst2.repeat(5));
        System.out.println(tekst3);
        System.out.println(tekst4); // Gir ikke feilmelding, en tom tekstbuffer skrives til skjermen.
        System.out.println(tekst5 + " + " + tekst3);

        tekst5.append(" - ");
        
        System.out.println(tekst5.append(tekst3));
        
        System.out.println(tekst5.insert(8," et eksempel på å ")); // setter inn tekst i tekst5
        
        tekst5.replace(0, tekst5.length(), "Dette er tekst 5"); // gå tilbake til opprinnelig tekst5
        
        System.out.println(tekst5.replace(0,5,"Deretter")); // endrer Denne til Deretter.
        
        
        
	}

}
