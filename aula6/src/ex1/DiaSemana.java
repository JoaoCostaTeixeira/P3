package ex1;

public enum DiaSemana {
	Segunda{
			public String toString() {return "Segunda";}
	}, Terça{
		public String toString() {return "Terça";}
	}, Quarta{
		public String toString() {return "Quarta";}
	}, Quinta{
		public String toString() {return "Quinta";}
	}, Sexta{
		public String toString() {return "Sexta";}
	}, Sabado{
		public String toString() {return "Sabado";}
	}, Domingo{
		public String toString() {return "Domingo";}
	};

	public static DiaSemana rand() {
		switch ((int) (Math.random() * 7)) {
			default:
			case 0:
				return DiaSemana.Segunda;
			case 1:
				return DiaSemana.Terça;
			case 2:
				return DiaSemana.Quarta;
			case 3:
				return DiaSemana.Quinta;
			case 4:
				return DiaSemana.Sexta;
			case 5:
				return DiaSemana.Sabado;
			case 6:
				return DiaSemana.Domingo;
		}
	}
}
