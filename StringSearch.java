
public class StringSearch {

	public static void main(String[] args) {

		String[] x = {"Harsh", "Amit", "Anirudh", "kritika", "Devyani"};
		String y = "KRITIKA";
		int i;
		int flag = 0;
		for(i=0;i<x.length;i++)
		{
			if((x[i].compareToIgnoreCase(y))==0)
			{
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1 ) {
			System.out.print(y+ " Found at: " +(i+1));
		}
		else {
			System.out.println("Not found");
		}
	}

}
