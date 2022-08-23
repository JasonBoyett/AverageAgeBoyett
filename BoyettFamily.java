public class BoyettFamily extends Family {

    public BoyettFamily() {
        super(8);
        this.theFamily = new FamilyMemeber[8];
        this.theFamily[4] = new FamilyMemeber("Jason", 26);
        this.theFamily[7] = new FamilyMemeber("Sharri", 62);
        this.theFamily[2] = new FamilyMemeber("Zach", 21);
        this.theFamily[0] = new FamilyMemeber("Peanut Butter Boyett", 1);
        this.theFamily[1] = new FamilyMemeber("Gypsy", 5);
        this.theFamily[6] = new FamilyMemeber("Steve", 55);
        this.theFamily[3] = new FamilyMemeber("Nathan", 25);
        this.theFamily[5] = new FamilyMemeber("Alexis", 28);
    }

}