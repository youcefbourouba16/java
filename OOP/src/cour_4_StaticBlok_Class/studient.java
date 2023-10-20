package cour_4_StaticBlok_Class;

public class studient {
    private int no;
    private String name;

    @Override
    public String toString() {
        return "studient{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", login=" + login +
                '}';
    }

    private String password;
    private boolean login;
    private static int count = 1;
    private static String college = "it";
    private static int minPasswordLenth = 6;


    public studient(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static boolean validationPasword(String password) {

        ////// non static variable cannot be referenced from static context
        if (password.length() >= minPasswordLenth) {
            return true;

        } else return false;

    }

    ///////// inner class and ouuter  class

    static int  x=5;
    public static  class outerclass{
        public static class innnerclass {
            public void print() {
                System.out.println(" x = "+x);
            }
        }
    }
}
