package design.pattern.behavioral.template.method;

public abstract class AbstGameConnectHelper {
    protected abstract String decode(String encodedInfo);
    protected abstract boolean authentication(String id, String pwd);
    protected abstract int authorization(String id);
    protected abstract String connection(String info);

    // template method
    public String requestConnection(String encodedInfo) {
        String decodedInfo = decode(encodedInfo);
        String id = decodedInfo.substring(0, 4);
        String pwd = decodedInfo.substring(4, 7);

        if(!authentication(id, pwd)) {
            throw new IllegalStateException("authentication info is not valid");
        }

        int authorization = authorization(id);
        switch(authorization) {
            case 0:
                System.out.println("0: manager");
                break;
            case 1:
                System.out.println("1: paid membership");
                break;
            case 2:
                System.out.println("2: free membership");
                break;
            default:
                System.out.println("def: other");
                break;
        }

        return connection(decodedInfo);
    }
}
