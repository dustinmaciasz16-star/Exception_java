package com.krakeDev.taller.Exception;

public class ValidarContacto {

	public static void validarTelefono(String telefono) throws IllegalArgumentException {
		// si el telefono no tiene 10 digitos
		// lanza la excepcion con throw
		if(telefono.length() != 10) {			
			throw new IllegalArgumentException("Este numero tiene menos de 10 ");
		}
		
	}

}
