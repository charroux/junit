package org.example;

public class Calculatrice {

    String marque;

    public float add(float operande1, float operande2){
        return operande1 + operande2;
    }

    public float div(float numerateur, float denominateur) throws Exception {
        if(denominateur == 0){
            throw new Exception("Div par O");
        }
        return numerateur / denominateur;
    }

}
