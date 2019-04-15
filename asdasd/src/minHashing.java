

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class minHashing {
	private int khashF;
	List<String> lst;
	 Set<Integer> intersect = new HashSet<>();
    Set<Integer> union = new HashSet<>();
	public minHashing(List<String> lst,int khashF){
		this.lst= lst;
		this.khashF = khashF;
	}

	public int[] initHashBuckets(){
        return initHashBuckets(lst,khashF);
    }
	
	public int [] initHashBuckets (List<String> lista, int khashF){
		int[] minhash = new int[khashF];
		String str;
		int hash;

		for(int i=0; i<khashF;i++){
			int aux = Integer.MAX_VALUE;
			for(int j=0;j<lista.size();i++){ 
				str = lista.get(j);     
				hash = Math.abs(str.hashCode()/lista.size());

				if(hash<aux)
					aux=hash;
			}

			minhash[i]=aux;
		}
		return minhash;
	}
	

	public double compute(Set<Integer> set1, Set<Integer> set2) //gives the jaccardIndex(Aplicar a fórmula dos slides)
    {
        intersect.clear();
        intersect.addAll(set1);
        intersect.retainAll(set2);
        
        union.clear();
        union.addAll(set1);
        union.addAll(set2);
        return (double)intersect.size()/(double)union.size();
    }
	
	public static double similarity(int[] a,int[] b){ //compara 2 assinaturas
        int size=1;
        int similar=0;
        if (a.length != b.length){
        	throw new IllegalArgumentException("O tamanho das duas assinauras tem de ser igual! "); 
        }

        if(a.length == b.length){
            size = a.length;
            for(int i=0; i< size; i++){
                if(a[i] ==b[i]){
                	similar+=1;
                }
                 
            }
        }
        
        return (double)similar/size;
	}
}
