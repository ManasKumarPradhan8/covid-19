package logicals2;

public class RandomNumberGenerate {

	public static void main(String[] args) {
		int min=100;
		int max=200;
		int rand=(int) (Math.random()*(max-min+1)+min);
		System.out.println("Random number is "+rand);
}

}
