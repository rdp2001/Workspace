
public class ArrayTest {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int[] squares = new int[101];
		while(i<=100) {
			squares[i] = i*i*i;
			i++;
		}
		i=0;
		int[] c = {99,100,55,84,98};
		while(i<c.length) {
			sum += c[i];
			i++;
		}
		System.out.println((double)sum/i);
	}

}