package design.pattern.behavioral.template.method.main;

import design.pattern.behavioral.template.method.AbstGameConnectHelper;
import design.pattern.behavioral.template.method.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("TestPwd");
    }
}
