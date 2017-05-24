package Idiomas;

import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class Idioma extends Properties{

	private static ResourceBundle idiomas;
	
    public Idioma(String idioma){
        if(idioma.equals("Español")){//Español
            idiomas = ResourceBundle.getBundle("_ES");
        }else if(idioma.equals("English")){//Ingles
            idiomas = ResourceBundle.getBundle("_EN");
        }else{
            idiomas = ResourceBundle.getBundle("_ES");
        }
    }

     public ResourceBundle getIdioma() {
        
    	 return idiomas;
   }

}

