package com.krakeDev.taller.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class test {
	private static final Logger log = LoggerFactory.getLogger(test.class);
	public static void main(String[] args) {
		
		String telefono= "0967858410";
		
		try {
			ValidarContacto.validarTelefono(telefono);
			GuardarContacto.guardar();
			LeerContactos.leer();
			log.info("Todo salio correctamente");
			
		}catch(IllegalArgumentException e) {
			log.error("Telefono invalido" + e.getMessage());
		}finally {
			try {
				log.info("Todo exitoso");
			}catch(IllegalArgumentException e) {
				log.error("errro algo fallo" + e.getMessage());
			}
		}
		
	}
}
