import java.util.ArrayList;

public class StringArraySubtract {
	   public static void main(String[]args){
		   String [] s1={"hfy","jgui","uituigui"};
		   String [] s2={"ghj","jgui","olk","pol"};
		   ArrayList<String> s3= new ArrayList<String>();
		  int k=0;
		  int flag=0;
		   for(int i=0;i<s2.length;i++){
		  for(int j=0;j<s1.length;j++){
		      if(s2[i]==s1[j]){

		          flag=0;
		          break;


		      }
		      else{
		          flag=1;
		      }
		  }
		  if (flag==1){
		      s3.add(s2[i]);
		  }

		   }

		   for (int i=0;i<s3.size();i++){
		       System.out.println(s3.get(i));
		   }




		  }
}


