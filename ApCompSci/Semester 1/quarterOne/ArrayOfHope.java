package quarterOne;

public class ArrayOfHope {

	public static void main(String[] args) {
		int j = 0;
		char[] ch = new char[26];
		for(int i = 65; i<=90; i++) {
			ch[j] = (char)i;
			j++;
		}
		for(int i = 0; i<25; i++)
			System.out.print(ch[i]+", ");
		System.out.println(ch[25]);
	}

}
