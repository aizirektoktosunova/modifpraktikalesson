public class Cat extends Animal{
    private String paroda;
    private String color;

    public Cat() {
    }
 static  void Catp(){
        Cat cat=new Cat("Ais",4,"as","black");
     System.out.println(cat);

 }
 static void Catc(){
     System.out.println("jbvhbvj");
 }
    public Cat(String name, int age, String paroda, String color) {
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
        return "Cat{" +
                "paroda='" + paroda + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
