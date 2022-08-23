
abstract class Family {
    protected String familyName;
    protected int familySize;
    protected FamilyMemeber[] theFamily;
    protected float averageAge;

    public FamilyMemeber[] getTheFamily() {
        return theFamily;
    }

    public float getAverageAge() {
        int sum = 0;

        for (int i = 0; i < theFamily.length; i++) {
            sum = sum + theFamily[i].getAge();
        }
        return sum / (float) theFamily.length;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    public void setTheFamily(int position, FamilyMemeber memeber) {
        this.theFamily[position] = memeber;
    }

    protected Family(int familySize, String familyName) {// for a user created family
        this.familyName = familyName;
        this.familySize = familySize;
        this.theFamily = new FamilyMemeber[familySize];
        this.averageAge = this.getAverageAge();
    }

    protected Family(int familySize, FamilyMemeber[] theFamily) {// for a hard coded family
        this.familySize = familySize;
        this.theFamily = theFamily;
        this.averageAge = this.getAverageAge();
    }

    protected Family(int myFamilySize) {
        this.theFamily = new FamilyMemeber[familySize];
        this.familySize = myFamilySize;
        this.averageAge = this.getAverageAge();
    }

    public String getAllFamilyNames() {
        String print = "";
        for (int i = 0; i < this.familySize; i++) {
            print = print + this.theFamily[i].getName() + "\n";
        }
        return print;
    }

}