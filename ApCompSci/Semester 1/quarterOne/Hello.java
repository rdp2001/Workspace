package quarterOne;

public class Hello {

	public static void main(String[] args) {
		/* 1. double[] sgt = new double[800];
		 * 2. 21
		 * 3. for(int i=0; i<800; i++) {
				sgt[i] = Math.sqrt(i);
			  }
		 * 4. length has no brackets.
		 * 5. char[] ch = {'a','b','c','d','e'}
		 * 6. 5
		 * 7. 
		int sum = 0;
		for(int i = 0; i<ref.length; i++) {
			sum += ref[i]*ref[i];
			System.out.println(sum);
		}
		 * 8. Will go out of array range
		 * 9. dbx[], double[] vb;
		 * 10. 56
		 * 11. 23
		 * 12. Error
		 * 13. Makes all values of the array positive.
		 * 14. >>>123int[] test = {1,2,3,4,5,6};
		 * 15. 
		
		* 16. 
		
		*/
//		 double[] sgt = new double[800];
//		for(int i=0; i<800; i++) {
//			sgt[i] = Math.sqrt(i);
//			System.out.println(sgt[i]);
//		  }
		int[] test = {1,2,3,4,-5};
		int indx;
		for(indx = 0; indx<test.length&&test[indx]>=0; indx++);
		System.out.println(indx);
	}

}
