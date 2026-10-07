package com.krakeDev.taller.Exception;

import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuardarContacto {
	
	private static final Logger log = LoggerFactory.getLogger(GuardarContacto.class);
	
	public static void guardar() {
		FileWriter escritor = null; // se declara fuera
		
		try {
			escritor = new FileWriter("contactos.txt", true);
			escritor.write("Nombre: Dustin\n");
			escritor.write("Apellido: Macias\n");
			escritor.write("Telefono: 0951187756\n");
			log.info("Se agrago correctamoente al contacto.txt");
		} catch (IOException e) {
			log.error("No se pudo guardar el contacto" + e.getMessage());
		}finally {
			try {
				if(escritor != null) {					
					escritor.close();
				}
			}catch(IOException e) {
				log.error("Error al cerrar el archivo" + e.getMessage());
			}
		}
	}
}
