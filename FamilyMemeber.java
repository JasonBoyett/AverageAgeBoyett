
public class FamilyMemeber {
    private int age;
    private String name;

    public int getAge() {//returns the age of the family member
        return age;
    }

    public void setAge(int age) {//sets the age of the family member
        this.age = age;
    }

    public String getName() {//returns the name of the family member
        return name;
    }

    public void setName(String name) {//returns the name of the family member
        this.name = name;
    }

    public FamilyMemeber(String Name, int Age) {//constructor for a FamilyMember object
        this.name = Name;
        this.age = Age;
    }
}
