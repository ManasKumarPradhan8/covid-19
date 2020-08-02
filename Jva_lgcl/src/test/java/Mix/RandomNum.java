package Mix;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
Random rand=new Random();
for(int i=0;i<50;i++){
	int temp=rand.nextInt(50);
System.out.println(temp);
	}
}

}
