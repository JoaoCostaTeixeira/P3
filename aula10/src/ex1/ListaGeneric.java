package ex1;

import java.util.ArrayList;
import java.util.LinkedList;

import ex2.Iterator;


public class ListaGeneric<T> {
	private LinkedList<T> vector = new LinkedList<T>();
	
	public boolean addElem(T elem){
		if(!vector.contains(elem)){
			vector.add(elem);
			return true;
		}
		return false;
	}
	
	public boolean removeElem(T elem){
		if(vector.contains(elem)){
			vector.remove(elem);
			return true;
		}
		return false;
	}
	public T[] toArray(){
		return  (T[]) vector.toArray();
	}
	public int totalElem(){
		return vector.size();
	}
	public class ListaIterador<E> implements Iterator<E>{
		private int i=0;
		public boolean hasNext(){
			return i<vector.size();
		}
		public E next(){
			if(hasNext()){
				i++;
				return (E) vector.get(i-1);
			}
			throw new IndexOutOfBoundsException("only "+ vector.size() + " elements");
		}
		public void remove(){
			throw new UnsupportedOperationException(
					"Operação não suportada!");
		}
	}
	public Iterator<T> iterator(){
		return (this).new ListaIterador<T>();
	}
	public String toString() {
		return iterator().next().toString();
	}
}

