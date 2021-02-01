package fr.formation.afpa.gitExoIOSF.ExoIOSF;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 * Hello world!
 *
 */
public class App 
{private static final Log Log = LogFactory.getLog(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Log.debug("message debug");  
        Log.info("message info");
        Log.warn("message warn");
        Log.error("message error");
        Log.fatal("message fatal");
        
        OutputStream outLog;
  	try {
  		outLog = new FileOutputStream("logs/journal.txt");
  		DataOutputStream doutLog = new DataOutputStream(outLog);
  		
  	
  	} catch (FileNotFoundException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    }
}
