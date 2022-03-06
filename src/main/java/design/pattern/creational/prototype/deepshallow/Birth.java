package design.pattern.creational.prototype.deepshallow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Birth {
    private int year;
    private int age;

    @Override
    public String toString() {
        return "Birth{" +
                "year=" + year +
                ", age=" + age +
                '}';
    }
}
