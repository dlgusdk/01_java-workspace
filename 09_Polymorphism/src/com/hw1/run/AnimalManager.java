package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("개", "도베르만", 48);
		arr[1] = new Cat("냥이", "샴", "집", "하얀");
		arr[2] = new Dog("개1", "도베르만1", 49);
		arr[3] = new Dog("개2", "도베르만2", 50);
		arr[4] = new Dog("개3", "도베르만3", 51);

		for(Animal g : arr) {
			g.speak();
		}
	}

}
