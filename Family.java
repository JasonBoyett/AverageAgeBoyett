
abstract class Family {
    protected String familyName;
    protected int familySize;
    protected FamilyMemeber[] theFamily;
    protected double averageAge;

    public FamilyMemeber[] getTheFamily() {// returns an array of FamilyMember objects that contains all the family's
                                           // members
        return theFamily;
    }

    public double getAverageAge() {// averages the ages of the family members and retruns the average age of the
                                   // members of the family
        double sum = 0;
        double denominator = (double) (this.familySize);

        for (int i = 0; i < theFamily.length; i++) {
            sum = sum + theFamily[i].getAge();
        }
        return sum / denominator;
    }

    public int getFamilySize() {// returns the number of members in the family
        return familySize;
    }

    public void setFamilySize(int familySize) {// sets the number of members in the family
        this.familySize = familySize;
    }

    public void setTheFamily(int position, FamilyMemeber memeber) {// adds a member to the array of family members at a
                                                                   // given position
        this.theFamily[position] = memeber;
    }

    public String getFamilyName() {// returns the name of the family
        return familyName;
    }

    protected Family(int familySize, String familyName) {// for a user created family
        this.familyName = familyName;
        this.familySize = familySize;
        this.theFamily = new FamilyMemeber[familySize];
        this.averageAge = this.getAverageAge();
    }

    protected Family(int familySize, FamilyMemeber[] theFamily) {// for a user to create a family that already has
                                                                 // members
        this.familySize = familySize;
        this.theFamily = theFamily;
        this.averageAge = this.getAverageAge();
    }

    protected Family(int myFamilySize) {// for a hard coded family that creates members in a super constructor
        this.theFamily = new FamilyMemeber[familySize];
        this.familySize = myFamilySize;
        this.averageAge = this.getAverageAge();
    }

    public String getAllFamilyNames() {// returns the names of all members of the family
        String print = "";
        for (int i = 0; i < this.familySize; i++) {
            print = print + this.theFamily[i].getName() + "\n";
        }
        return print;
    }

    public String getAllFamilyNamesAndAges() {// returns the names of all the mebers of the family and their ages
        String print = "";
        for (int i = 0; i < this.familySize; i++) {
            print = print + this.theFamily[i].getName() + " is " + this.theFamily[i].getAge() + "\n";
        }
        return print;
    }
}// end of class