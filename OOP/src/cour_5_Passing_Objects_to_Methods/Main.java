package cour_5_Passing_Objects_to_Methods;




public class Main {
    /*
    static void fun(int n) {
        n++;
    }
     */
    static void fun(number obj) {
        obj.number++;
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        /*
        int n = 1;
        fun(n)
         */


        ///// out put still 1 cuz he take the value 1 not the variable , we need to use like pointers to point to
        //// the adress of the variable and change in it
        number obj = new number();
        obj.number = 1;
        fun(obj);
        System.out.println(obj.number);
        ///// now the out put is 2 so he change it in it actual adress



        /*
        somme of 2 object

        and the some in new object
         */
        int res=add(5, 3);
        somme_classMath n1 = new somme_classMath(3);
        somme_classMath n2 = new somme_classMath(5);
        somme_classMath n4 = new somme_classMath();
        somme_classMath n3 = n4.add(n1 , n2);
        //// if add object was attatic no public we can call it without n4 new class
        //// like this
        ////  somme_classMath n3 = somme_classMath.add(n1 , n2);
        System.out.println(" object addition = "+n3.val);

        /*
        compaire 2 object

         */
        somme_classMath m1 = new somme_classMath(3);
        somme_classMath m2 = new somme_classMath(2);
        if (m1==m2) System.out.println("equal");
        else System.out.println("not equal");
        //////// out put not equal in fact they are eual becus he copared the adress
        if (m1.isEquall(m2)) System.out.println("Equal");
        else System.out.println("ot equal ");






    }

}
