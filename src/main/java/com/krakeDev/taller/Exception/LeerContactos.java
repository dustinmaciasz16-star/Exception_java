package com.krakeDev.taller.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeerContactos {
	
	private static final Logger log = LoggerFactory.getLogger(LeerContactos.class);
	
	public static void leer() {
		
		BufferedReader buffer = null;
		
		try {
			FileReader lector = new FileReader("contactos.txt");
			buffer = new BufferedReader(lector);
			
			buffer.readLine();
			String linea;
			for (linea = buffer.readLine(); linea != null; linea =buffer.readLine()) {
				System.out.println(linea);
			}
			log.info("Contactos leidos correctamente");
			
		}catch(IOException e) {
			log.error("Error al intentar leer los contactos" + e.getMessage());
		}finally {
			try {
				if(buffer != null) {
					buffer.close();
				}
				log.info("El buffer se cerro correctamente");
			}catch(IOException e) {
				log.error("Error al intetar cerrar el buffer" + e.getMessage());
			}
		}

	}

}
