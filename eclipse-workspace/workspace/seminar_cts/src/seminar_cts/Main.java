package seminar_cts;

import clase.Zookeeper;
import clase.Animal;
import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {

		Zoo z=new Zoo();
		Giraffe giraffe = new giraffe("Giraffe");
		Giraffe Giraffe2 = new Giraffe("Giraffe2");
		
		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
		
		Zebra z1

	}

}
