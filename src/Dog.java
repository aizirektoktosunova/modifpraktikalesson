public class Dog  extends Animal{
    private String paroda;
    private String color;

    public Dog() {
    }
    static void Dogp(){
        Dog dog=new Dog("sadi",3,"muldog","white");
        System.out.println(dog);
    }
    static void Dogc(){
        System.out.println("gggrtgkntk");
    }
    public Dog(String name, int age, String paroda, String color) {
        super(name, age);
        this.paroda = paroda;
        this.color = color;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "paroda='" + paroda + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

