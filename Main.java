
//Jaosn Boyett 8/22/2022 Advanced Java
public class Main {
    static BoyettFamily myFamily = new BoyettFamily();

    public static void main(String[] args) {

        System.out.println("Hi we are the " + myFamily.getFamilyName() + "Family!\n");
        System.out.println("Here are the members of our Family:\n" + myFamily.getAllFamilyNames());
        System.out.println("Here are our ages:\n" + myFamily.getAllFamilyNamesAndAges());
        System.out.println("The average age in our family is " + myFamily.getAverageAge());
    }

}