public class Calc {


    public void glavcalc(int a, String z, int b) {
        switch (z) {
            case "+" -> metodplus(a, b);
            case "-" -> metodminus(a, b);
            case "*" -> metodumn(a, b);
            case "/" -> metoddel(a, b);

        }

    }

    public void metodplus(int x, int y) {
        System.out.println(x + y);
    }

    public void metodminus(int x, int y) {
        System.out.println(x - y);
    }

    public void metodumn(int x, int y) {
        System.out.println(x * y);
    }

    public void metoddel(int x, int y) {
        float a = x;
        float b = y;
        System.out.println(a / b);
    }

}
