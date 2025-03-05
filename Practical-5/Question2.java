interface I1 {
    public void methodI1();
}

interface I2 {
    public void methodI2();
}

interface I3 extends I1, I2 {
    public void methodI3();
}

interface I4 {
    public void methodI4();
}

class X implements I3 {
    public void methodI1() {
        System.out.println("This method is from interface I1");
    }

    public void methodI2() {
        System.out.println("This method is from interface I2");
    }

    public void methodI3() {
        System.out.println("This method is from interface I3");
    }

    public void methodX() {
        System.out.println("This method is from class X");
    }
}

class W extends X implements I4 {
    public void methodI4() {
        System.out.println("This method is from interface I4");
    }

    public void methodY() {
        System.out.println("This method is from class Y");
    }
}

public class Question2 {
    public static void main(String[] args) {
        W w = new W();

        System.out.println("w is instanceof I1: " + (w instanceof I1));
        System.out.println("w is instanceof I2: " + (w instanceof I2));
        System.out.println("w is instanceof I3: " + (w instanceof I3));
        System.out.println("w is instanceof I4: " + (w instanceof I4));
        System.out.println("w is instanceof X: " + (w instanceof X));
    }
}
