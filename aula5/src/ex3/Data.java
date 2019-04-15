package ex3;

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
}
