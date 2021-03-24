package projeto_integrador;

import java.lang.reflect.*;
import java.util.logging.*;

public class Reflexao {

	public static void refletirAtributo(Object obj, Class<?> classe) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("\n");
		Field[] atributos = classe.getDeclaredFields();
		for(Field F : atributos) {
			F.setAccessible(true);
			
			System.out.println(F.getName() + ": " + F.get(obj));
		}
	}
}
