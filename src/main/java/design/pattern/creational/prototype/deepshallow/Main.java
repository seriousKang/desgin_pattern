package design.pattern.creational.prototype.deepshallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat1 = new Cat();
        cat1.setName("coco");
        cat1.setBirth(new Birth(2015, 5));

        // shallow copy
//        Cat cat2 = cat1;

        // deep copy
        Cat cat2 = cat1.copy();
        cat2.setName("haru");
        cat2.getBirth().setYear(2022);
        cat2.getBirth().setAge(1);

        System.out.println(cat1);
        System.out.println(cat2);
    }
}
