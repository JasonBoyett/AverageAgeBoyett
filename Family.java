
abstract class Family {
    private String familyName;
    private int familySize;
    private FamilyMemeber theFamily[];
    private float averageAge;

    public FamilyMemeber[] getTheFamily() { 
        return  theFamily; 
    }

    private float findAverageAge(){
        int sum = 0;
        float avg = 0;
        for(int i=0;i<theFamily.length;i++){
            sum = sum + theFamily[i].getAge();
        }
        return avg / (float)theFamily.length;
    }

    public float getAverageAge() {
        return averageAge;
    }

    public int getFamilySize() {    
        return  familySize; 
    }
    
    public Family(int FamilySize, String familyName){//for a user created family
        this.familyName = familyName;
        this.familySize = FamilySize;
        this.theFamily = new FamilyMemeber[familySize];
        this.averageAge = findAverageAge();
    }

    public Family(int familySize, FamilyMemeber[] theFamily){//for a hard coded family
        this.familySize = familySize;
        this.theFamily = theFamily;
        this.averageAge = findAverageAge();
    }

        
}
