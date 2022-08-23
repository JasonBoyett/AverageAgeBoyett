
//Jaosn Boyett 8/22/2022 Advanced Java
public class Main {
    static BoyettFamily myFamily = new BoyettFamily();

    public static void main(String[] args) {

        String testSize = Integer.toString(myFamily.getFamilySize());

        System.out.println(myFamily.getAllFamilyNames());
    }

}