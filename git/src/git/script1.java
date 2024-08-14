package git;

public class script1 {

	public static void main(String[] args) 
	{
      String r="hi i am qsp";
      String arr[]=r.split(" ");
      for(int i=0; i<=arr.length-1; i++)
      {
    	  if(i==3)
    	  {
    		  String k=arr[i];
    		  String rev=" ";
    		  for(int j=k.length()-1; j>=0; j-- )
    		  {
    			  rev=rev+k.charAt(j);
    		  }
    		  System.out.println(rev);
    	  }
      }
	}
		}


