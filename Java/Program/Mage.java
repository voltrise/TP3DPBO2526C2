public class Mage extends Character implements MageRole {
    private int mana;
    private String spellElement;

    public Mage() {
        super();
        this.mana = 100;
        this.spellElement = "Api";
    }

    public Mage(String name, int level, int hp, int mana, String spellElement) {
        super(name, level, hp);
        this.mana = mana;
        this.spellElement = spellElement;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int getMana() {
        return this.mana;
    }

    @Override
    public void setSpellElement(String spellElement) {
        this.spellElement = spellElement;
    }

    @Override
    public String getSpellElement() {
        return this.spellElement;
    }

    @Override
    public void castSpell() {
        System.out.println("[Skill Mage] " + getName() + " merapalkan sihir berelemen " + this.spellElement + "!");
    }

    public void displayMage() {
        System.out.println("Nama: " + getName() + " | Level: " + getLevel() + " | HP: " + getHp() + 
                           " | Mana: " + this.mana + " | Elemen: " + this.spellElement);
    }
}
