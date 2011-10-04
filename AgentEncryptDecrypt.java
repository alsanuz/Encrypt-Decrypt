

public class AgentEncryptDecrypt {
	// PRECIFRADO
	public String preEncrypt(String input, int key) {
		// Cadena de caracteres original a sustituir.
	    String original = "áàäéèëíìïóòöúùuÁÀÄÉÈËÍÌÏÓÒÖÚÙÜçÇ";
	    // Cadena de caracteres ASCII que reemplazarán los originales.
	    String ascii = "aaaeeeiiiooouuuAAAEEEIIIOOOUUUcC";
	    String output = input;
	    for (int i=0; i<original.length(); i++) {
	        // Reemplazamos los caracteres especiales.
	        output = output.replace(original.charAt(i), ascii.charAt(i));
	    }//for i
	    
	    output = output.replaceAll(" ", "");
	    
	    int j = 5;
	    while (j<= output.length()){
	    	output = output.substring(0, j) + " " +  output.substring(j, output.length());
	    	j += 6;
	    }
	    return output.toUpperCase();
	}
	
}
