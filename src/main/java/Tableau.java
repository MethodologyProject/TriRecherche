import java.util.ArrayList;

import recherche.Recherche;
import tri.Tri;

public class Tableau implements Tri , Recherche{

	private ArrayList tab;
	
	public Tableau(){
		this.tab = new ArrayList();
	}
	public Tableau(ArrayList tab){
		this.tab = tab;
	}
	@Override
	public String toString() {
		return "Tableau :" + tab ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tab = new ArrayList<String>();
		tab.add("zf");
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		for(int i=11;i>0;i--){
			tab2.add(i);
		}

		Tableau t = new Tableau(tab);
		Tableau t2 = new Tableau(tab2);
		
		System.out.println(t.toString());
		System.out.println(t2.toString());
		t2.triTab(tab2);
		System.out.println(t2.toString());
		int a = t2.getIndice(tab2, 0, 10, 8);
		System.out.println(a);
	}
	@Override
	public int getIndice(ArrayList<Integer> tab, int i, int j, int val) {
	        int k = (i+j)/2;
	          if (tab.get(k)==val)
	            return k;
	          else
	            if (val<tab.get(k))
	              return getIndice(tab,i,k,val);
	            else
	              return getIndice(tab, k, j, val);
	}
	@Override
	public  void triTab(ArrayList<Integer> t ) {
		
			 for (int i=0 ;i<=(t.size()-2);i++){
	                for(int j=(t.size())-1; j>i ; j--){
	                	if (t.get(j) < t.get(j-1)){
	                        	int x=(int)t.get(j-1);
	                        	t.set(j-1,j);
	                        	t.set(j,x);
	                        }
					}
			 }
		
	}
}
