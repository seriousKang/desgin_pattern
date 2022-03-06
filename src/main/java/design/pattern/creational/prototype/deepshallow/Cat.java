package design.pattern.creational.prototype.deepshallow;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat implements Cloneable {
    private String name;
    private Birth birth;

    public Cat copy() throws CloneNotSupportedException {
        Cat cat = (Cat) clone();
        cat.setBirth(new Birth(birth.getYear(), birth.getAge()));

        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
