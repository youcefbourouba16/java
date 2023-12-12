public class test {

    public static boolean isValid(String s) {
        boolean exist = false;
        int l=s.length();
        int k=1,i = 0;
        while (i < l){
            for (int j = l-1; j > i ; j--){

                if (s.charAt(i) == '(' && s.charAt(j) == ')'||
                        s.charAt(i) == '{' && s.charAt(j) == '}' ||
                        s.charAt(i) == '[' && s.charAt(j) == ']') {
                    exist = true;
                    k=j;
                    System.out.println(i);


                    System.out.println(k);
                }
                else{
                    exist=false;


                }




            }
            if (exist) i+=k;

        }
        System.out.println(exist);
        return exist;









    }














    public static void main(String[] args) {
        String s="(){}}{";
        System.out.println(s);
        System.out.println(isValid(s));
    }
}
