package ex1;

import ex2.Iterator;

public abstract class TestGeneric {
	public static void main(String[] args) {
		VectorGeneric<Pessoa> vp = new VectorGeneric<Pessoa>();
		for (int i=0; i<10; i++)
			vp.addElem(new Pessoa("Beb� no Vector "+i, 1000+i, Data.today()));
		Iterator<Pessoa> vec = vp.iterator();
			
		printSet(vp.iterator());
		ListaGeneric<Pessoa> lp = new ListaGeneric<Pessoa>();
		while ( vec.hasNext() )
			lp.addElem( vec.next() );
		
		Iterator<Pessoa> lista = lp.iterator();
		while ( lista.hasNext() )
			System.out.println( lista.next() );
		
		ListaGeneric<Figura> figList = new ListaGeneric<Figura>();
		figList.addElem(new Circulo (1,3, 1));
		figList.addElem(new Quadrado(3,4, 2));
		figList.addElem(new Rectangulo(1,2, 2,5));
		
		printSet(figList.iterator());
		System.out.println("Soma da Area de Lista de Figuras: " + sumArea(figList));
		
		// Partindo do principio que Quadrado extends Rectangulo:
		ListaGeneric< Rectangulo > quadList = new ListaGeneric<Rectangulo>();
		quadList.addElem(new Quadrado(3,4, 2));
		quadList.addElem(new Rectangulo(1,2, 2,5));
		System.out.println("Soma da Area de Lista de Quadrados: " + sumArea(quadList));
	}
	public static void  printSet (Iterator e){
		while( e.hasNext()){
			System.out.println(e.next());
		}
	}
	public static double sumArea (ListaGeneric<? extends Figura> f ){
		double sum=0;
		Iterator<? extends Figura> d = f.iterator();
		for(int i=0; i<f.totalElem(); i++){
			sum = sum + d.next().area();
		}
		return sum;
	}
}
