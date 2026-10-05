public class Warrior extends Character {
    private int stamina;
    private String weaponType;

    public Warrior() {
        super();
        this.stamina = 100;
        this.weaponType = "Pedang Besi";
    }

    public Warrior(String name, int level, int hp, int stamina, String weaponType) {
        super(name, level, hp);
        this.stamina = stamina;
        this.weaponType = weaponType;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return this.weaponType;
    }

    public void slashAttack() {
        System.out.println("[Skill Warrior] " + getName() + " melancarkan tebasan pedang dengan " + this.weaponType + "!");
    }

    public void displayWarrior() {
        System.out.println("Nama: " + getName() + " | Level: " + getLevel() + " | HP: " + getHp() + 
                           " | Stamina: " + this.stamina + " | Senjata: " + this.weaponType);
    }
}
