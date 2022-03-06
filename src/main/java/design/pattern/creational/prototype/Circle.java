package design.pattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Circle extends Shape {
    private int x;
    private int y;
    private int r;

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x += 1;
        circle.y += 1;

        return circle;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d, %d]", x, y, r);
    }
}
