package cour_5_Passing_Objects_to_Methods;

public class somme_classMath {
    int val;

    public somme_classMath(int val) {
        this.val = val;
    }
    public somme_classMath(){}


    somme_classMath add(somme_classMath n1, somme_classMath n2) {
        somme_classMath n3 = new somme_classMath(0);
        n3.val = n1.val + n2.val;
        return n3;

    }

    boolean isEquall(somme_classMath n2) {
        /*
        if (n1.val== n2.val) return true;
        else return false;
         */
        return this.val == n2.val;
    }
}
