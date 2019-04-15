package ex1;

import java.util.ArrayList;

import ex2.Iterator;

public class VectorGeneric <T> {
	private ArrayList<T> vector = new ArrayList<T>();
	
	public boolean addElem(T elem){
		return vector.add(elem);
	}
	
	public boolean removeElem (T elem){
			return vector.remove(elem);
	}
	
	public int totalElem(){
		return vector.size();
	}	
	
	public class VectorIterator<E> implements Iterator<E>{
		private int i;
		public VectorIterator() {
			i = 0;
		}
		public boolean hasNext(){
			return i<vector.size();
		}
		public E next(){
			if (hasNext()) {
				E r =  (E) vector.get(i);
				i++;
				return  r;
			}throw new IndexOutOfBoundsException("only "+ vector.size() + " elements");
		}
		public void remove(){
			throw new UnsupportedOperationException(
					"Operação não suportada!");
		}
	}
	
	
	public Iterator<T> iterator(){
		return (this).new VectorIterator<T>();
	}

	@Override
	public String toString() {
		return iterator().next().toString();
	}
}