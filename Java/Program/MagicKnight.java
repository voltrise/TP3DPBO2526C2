public class MagicKnight extends Warrior implements MageRole {
    private int mana;
    private String spellElement;
    private String enchantedBlade;

    public MagicKnight() {
        super();
        this.mana = 100;
        this.spellElement = "Api";
        this.enchantedBlade = "Bilah Sihir Rune";
    }

    public MagicKnight(String name, int level, int hp, int stamina, String weaponType,
                       int mana, String spellElement, String enchantedBlade) {
        super(name, level, hp, stamina, weaponType);
        this.mana = mana;
        this.spellElement = spellElement;
        this.enchantedBlade = enchantedBlade;
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

    public void setEnchantedBlade(String blade) {
        this.enchantedBlade = blade;
    }

    public String getEnchantedBlade() {
        return this.enchantedBlade;
    }

    @Override
    public void castSpell() {
        System.out.println("[Skill Mage] " + getName() + " merapalkan sihir berelemen " + this.spellElement + "!");
    }

    public void elementalStrike() {
        System.out.println("[Skill Hybrid] " + getName() + " melapisi " + this.enchantedBlade + 
                           " dengan elemen " + this.spellElement + " lalu menebas musuh!");
    }

    public void displayMagicKnight() {
        System.out.println("Nama: " + getName() + " | Level: " + getLevel() + " | HP: " + getHp() + 
                           " | Stamina: " + getStamina() + " | Mana: " + this.mana + 
                           " | Bilah: " + this.enchantedBlade + " (" + this.spellElement + ")");
    }
}
