
public class StringSort {

	public static void main(String[] args) {

		String[] x = {"Harsh", "Amit", "Anirudh", "Kritika", "Devyani"};
		for(int i=0;i<x.length-1;i++) {
			for(int j = i+1;j<x.length;j++) {
				if(x[i].compareTo(x[j])>0) {
					String temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			
			
			
			}
		for (int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		
	}

}
