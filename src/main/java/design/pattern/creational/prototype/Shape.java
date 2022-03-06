package design.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shape implements Cloneable {
    private String id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
