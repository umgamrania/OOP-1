class ZeroArgumentException extends Exception {
    public ZeroArgumentException(String msg) {
        super(msg);
    }
}

public class Question5 {
    public static void main(String[] args) throws ZeroArgumentException {
        if(args.length > 0) {
            if(args[0].equals("0"))
                throw new ZeroArgumentException("First argument is 0");
        }
        System.out.println("Hello world");
    }
}
