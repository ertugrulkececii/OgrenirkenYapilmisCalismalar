package day30_immutableClasses;

public class C01_StringPool {

    String str1 = "Java";
    String str2 = "Java";
    String str3 = new String("Java");
    String str4 = "Ja" + "va";
    String a = "Ja";
    String b = "va";
    String str5 = a+b;
    String str6 = a.concat(b);
}
