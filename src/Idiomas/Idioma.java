package Idiomas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{
	public static Idioma language = null;
			public FileInputStream xd = null;
			public String idim = null;
    
    private static final long serialVersionUID = 1L;
	        
    public Idioma(String idioma){
    	this.idim=idioma;
    	switch(idioma){
	    	case "Español":
                    getProperties("espanol.properties");
                    break;
	    	case "English":
                    getProperties("english.properties");
                    break;
	    	default:
                    getProperties("espanol.properties");}
	   	}

    	public static Idioma getIdioma(){
    		if(language==null){
    			language=new Idioma("English");
    			
    		}
    		return language;
    	} 	
    

    private void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
        
        }
   }
}
