public class GuildHall {
    private String hallName;
    private int goldReserve;
    private int capacity;

    public GuildHall() {
        this.hallName = "Aula Pemula";
        this.goldReserve = 500;
        this.capacity = 20;
    }

    public GuildHall(String hallName, int goldReserve, int capacity) {
        this.hallName = hallName;
        this.goldReserve = goldReserve;
        this.capacity = capacity;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getHallName() {
        return this.hallName;
    }

    public void setGoldReserve(int goldReserve) {
        this.goldReserve = goldReserve;
    }

    public int getGoldReserve() {
        return this.goldReserve;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void displayHall() {
        System.out.println("Fasilitas Aula: " + this.hallName + " | Kas Serikat: " + this.goldReserve + 
                           " Gold | Kapasitas: " + this.capacity + " Anggota");
    }
}
