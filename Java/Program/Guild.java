import java.util.ArrayList;

public class Guild {
    private String guildName;
    private GuildHall hall;
    private ArrayList<Warrior> warriors;
    private ArrayList<Mage> mages;
    private ArrayList<MagicKnight> knights;

    public Guild() {
        this.guildName = "Serikat Petualang";
        // Komposisi: Objek GuildHall diinstansiasi langsung di dalam kelas Guild
        this.hall = new GuildHall("Aula Pemula", 500, 20);
        this.warriors = new ArrayList<Warrior>();
        this.mages = new ArrayList<Mage>();
        this.knights = new ArrayList<MagicKnight>();
    }

    public Guild(String guildName, String hallName, int goldReserve, int capacity) {
        this.guildName = guildName;
        // Komposisi: Objek GuildHall diciptakan bersamaan dengan objek Guild
        this.hall = new GuildHall(hallName, goldReserve, capacity);
        this.warriors = new ArrayList<Warrior>();
        this.mages = new ArrayList<Mage>();
        this.knights = new ArrayList<MagicKnight>();
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public String getGuildName() {
        return this.guildName;
    }

    public void setHall(GuildHall hall) {
        this.hall = hall;
    }

    public GuildHall getHall() {
        return this.hall;
    }

    public void addWarrior(Warrior warrior) {
        this.warriors.add(warrior);
    }

    public void addMage(Mage mage) {
        this.mages.add(mage);
    }

    public void addMagicKnight(MagicKnight knight) {
        this.knights.add(knight);
    }

    public void displayGuild() {
        System.out.println("==========================================================");
        System.out.println("             SERIKAT: " + this.guildName);
        System.out.println("==========================================================");
        this.hall.displayHall();
        System.out.println("----------------------------------------------------------");

        System.out.println("[Divisi Warrior (" + this.warriors.size() + " Anggota)]");
        if (this.warriors.isEmpty()) {
            System.out.println("  (Belum ada anggota Warrior)");
        } else {
            for (int i = 0; i < this.warriors.size(); i++) {
                System.out.print("  " + (i + 1) + ". ");
                this.warriors.get(i).displayWarrior();
            }
        }

        System.out.println("\n[Divisi Mage (" + this.mages.size() + " Anggota)]");
        if (this.mages.isEmpty()) {
            System.out.println("  (Belum ada anggota Mage)");
        } else {
            for (int i = 0; i < this.mages.size(); i++) {
                System.out.print("  " + (i + 1) + ". ");
                this.mages.get(i).displayMage();
            }
        }

        System.out.println("\n[Divisi Elit Magic Knight (" + this.knights.size() + " Anggota)]");
        if (this.knights.isEmpty()) {
            System.out.println("  (Belum ada anggota Magic Knight)");
        } else {
            for (int i = 0; i < this.knights.size(); i++) {
                System.out.print("  " + (i + 1) + ". ");
                this.knights.get(i).displayMagicKnight();
            }
        }
        System.out.println("==========================================================\n");
    }
}
