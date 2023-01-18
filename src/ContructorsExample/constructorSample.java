package ContructorsExample;

import ThreeClassSamples.Hello;

public class constructorSample {
    public static void main(String[] args) {
        HelloConstructors hello = new HelloConstructors(13,14);
        constructorSample sample = new constructorSample();
    }
    public constructorSample() {
        System.out.println("Good Morning");
    }
}
