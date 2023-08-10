package day34_Inheritance;

public class EHayvanlar {
//Bir class olusutrulursken ilerde child classlar olabilir diye dusunuyorsaniz,
    //sadece child class'larin ulasmasini istediginiz methodlari protected yapabilirsiniz.
    public void hareket(){
        System.out.println("hareket ederler");
    }
    public void solunum(){
        System.out.println("nefes alirlar");
    }
    public void beslenme(){
        System.out.println("beslenirler");
    }
    public void cogalma(){
        System.out.println("cogalirlar");
    }
    public void omur(){
        System.out.println("yasar ve olurler");
    }
}
