public class FamilyMemeber {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FamilyMemeber(String Name , int Age) {
        this.name = Name;
        this.age = Age;
    }
}
