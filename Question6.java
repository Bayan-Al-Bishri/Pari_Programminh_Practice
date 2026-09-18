public class Question6{
  public static void main(String[]args){
      int x =15;
			    int scale=2;
			    double income=12000.0;
			    int number=6;
			    int i=10;
			    int j=20;
			    double score=0;
			    double tax=0;
			    if (x>10) {
			    	score=3*scale;
			    } else {
			    	score=4*scale;
			    }
			    System.out.println("score: " + score);//6.0
			    if (income>10000) {
			    	tax=income*0.2;
			    } else {
			    	tax=income*0.17 +1000;
			    }
			    System.out.println("tax: " + tax);//2400.0
			    if(number %3==0) {
			    	System.out.println(i);//10
			    } else {
			    	System.out.println(j);
			    }
	  }
}
