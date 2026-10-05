public class Character {
    private String name;
    private int level;
    private int hp;

    public Character() {
        this.name = "";
        this.level = 1;
        this.hp = 100;
    }

    public Character(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void displayCharacter() {
        System.out.println("Nama: " + this.name + " | Level: " + this.level + " | HP: " + this.hp);
    }
}
