package design.pattern.behavioral.template.method;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String decode(String encodedInfo) {
        System.out.println("DefaultGameConnectHelper.decode");
        return encodedInfo;
    }

    @Override
    protected boolean authentication(String id, String pwd) {
        System.out.println("DefaultGameConnectHelper.authentication");
        return true;
    }

    @Override
    protected int authorization(String id) {
        System.out.println("DefaultGameConnectHelper.authorization");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("DefaultGameConnectHelper.connection");
        return "success";
    }
}
