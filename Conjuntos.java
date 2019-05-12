package Indiscretas;
import java.util.*;

public class Conjuntos {

	public static void main(String[] args) {
		OP GOO = new OP();
		System.out.println("Ingrese el conjunto de numeros que desea.");
		System.out.println("Por favor que los dos conjuntos tengan la misma longitud.");
		String con0,con1,selc ;
		String sep=",";
		String [] cont0;
		String [] cont1;
		con0 = GOO.tec();
		con1 = GOO.tec();
		cont0= con0.split(sep);
		cont1= con1.split(sep);
		int n=0;
		
		do {
			System.out.println("Ingresa -a- para ver la union.");
			System.out.println("Ingresa -b- para ver la intersepcion.");
			System.out.println("Ingresa -c- para ver la diferenci.");
			System.out.println("Ingresa -d- para ver la diferencia simetrica.");
			System.out.println("Ingreda -f- para ver el conjunto plano cartesiano");
			selc=GOO.tec();
			switch(selc){
			case "a":
				GOO.uni(cont0, cont1);
				
				break;
				
			case "b":
				GOO.inter(cont0, cont1);
				
				break;
				
			case "c":
				GOO.dife(cont0, cont1);
				
				break;
			case "d":
				GOO.difesi(cont0, cont1);
				
				break;
				
			case "f":
				GOO.pla_car(cont0, cont1);
			
			
			
			}
			System.out.println("Si termino Ingrese 1");
			System.out.println("Si desea analizar otros casos ingrse 0");
			n = GOO.tecI();
			
		}while(n==0);
		
	}

}
