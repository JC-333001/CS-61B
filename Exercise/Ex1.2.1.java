public class Dog {
    public int weightInPounds;

    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }    
    }


    public static Dog maxDog(Dog d1, Dog d2) {
    if (weightInPounds > d2.weightInPounds) {
        return this;
    }
    return d2;
    }
}


public class DogLauncher{
    public static void main(String[] args) {
        Dog d = new  Dog(15);

        Dog d2 = new Dog(100);

        Dog bigger = Dog.maxDog(d,d2);
        bigger.makeNoise();
    }
}

/** OUTPUT: non-static variable this cannot be referenced from a static context
        return this;*/

