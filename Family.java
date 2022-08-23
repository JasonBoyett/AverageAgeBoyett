abstract class Family {
    protected String familyName;
    protected int familySize;
    protected FamilyMemeber[] theFamily;
    protected float averageAge;

    public FamilyMemeber[] getTheFamily() {
        return theFamily;
    }

    private float findAverageAge() {
        int sum = 0;

        for (int i = 0; i < theFamily.length; i++) {
            sum = sum + theFamily[i].getAge();
        }
        return sum / (float) theFamily.length;
    }

    public float getAverageAge() {
        return averageAge;
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
        this.averageAge = findAverageAge();
    }

    protected Family(int familySize, FamilyMemeber[] theFamily) {// for a hard coded family
        this.familySize = familySize;
        this.theFamily = theFamily;
        this.averageAge = findAverageAge();
    }

    protected Family(int familySize) {
        this.theFamily = new FamilyMemeber[familySize];
    }

}
