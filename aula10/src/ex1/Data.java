package ex1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
		private int dia;
		private int mes;
		private int ano;
		
		public Data(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
		public int getDia(){return dia;}
		public int getMes(){return mes;}
		public int getAno(){return ano;}
		
		public static boolean verify(int dia, int mes, int ano){
			if(dia <= 31 && dia >= 1){
				if(mes <= 12 && mes >= 1){
					if(ano >= 1 && ano <= 2016){ //Não vou por os casos todos (anos bissextos, Mês 2 so com 28/29 dias, etc...) por falta de gestão de tempo.
						return true;
					}
				}
			}
			return false;
		}
		
		public static Data today(){
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			String data = dateFormat.format(date);
			String [] aux = data.split("/");
			return new Data(Integer.parseInt(aux[0]), Integer.parseInt(aux[1]),Integer.parseInt(aux[2]));
		}
}
