package ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class exercicio1 {

	public static void main(String[] args) {
		Circulo c = new Circulo(20.5 , 10.5 , 15);
		print(c);
	
	}
	
	public static void print(Object o){
		Class<?> c = o.getClass();
		printModifiers(c);
		
		System.out.print("class "); 
		
		System.out.print(c.getSimpleName() + " "); // nome da class
		
		if(c != c.getSuperclass()){
			System.out.print("extends " + c.getSuperclass().getSimpleName());	// Super class
		}
		
		if(c.getInterfaces().length > 0 ){
			System.out.print("implements " + c.getInterfaces().toString());  //interfaces implementadas
		}
		System.out.println(" {");
		Field[] s = c.getDeclaredFields();
		
		for(int i=0; i<s.length; i++){
			if(s[i].isAccessible()){
				System.out.println("public " + s[i].getGenericType() + ";\n");
			}else{
				System.out.println("private " + s[i].getGenericType() + ";\n");
			}
		}
		
		Constructor<?> contrs[] = c.getConstructors();
		for(int i=0; i<contrs.length; i++){
				printModifiers(contrs[i].getDeclaringClass());
			System.out.print(contrs[i].getDeclaringClass().getSimpleName() + " ( ");
			
			Class<?> [] d = contrs[i].getParameterTypes();
			for(int j=0; j<d.length;j++){
				System.out.print(d[j].getSimpleName());
				if(j<(d.length-1))System.out.print(", ");
			}
			
			System.out.println(" ){ (...)}");
		}
		
		
		Method[] ss = c.getDeclaredMethods();
		for(int i=0; i<ss.length;i++){
			printModifiers(ss[i].getClass());
			System.out.print(ss[i].getReturnType().getSimpleName() + " " + ss[i].getName() + " (");
			
			Class<?>[] pp = ss[i].getParameterTypes();
			for(int j=0; j<pp.length;j++){
				System.out.print(pp[j].getSimpleName());
			}
			System.out.println(" ){ (...) }");
		}
		
		System.out.println("}");
		
		// Existe um erro no programa pois adicionar sempre Final
	}
	
	public static void printModifiers(Object o) {
		
		Class<?> c = o.getClass(); // returns the Class object of o
		
		int m = c.getModifiers(); // return the class modifiers
		if (Modifier.isPublic(m)) // checks if is public
			System.out.print("public ");
		if (Modifier.isAbstract(m)) // checks if it is abstract
			System.out.print("abstract ");
		if (Modifier.isFinal(m)) // checks if it is final  
			System.out.print("final "); 
	}

}
