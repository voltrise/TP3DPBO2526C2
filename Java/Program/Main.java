public class Main {
    public static void main(String[] args) {
        // Inisialisasi Serikat Petualang
        Guild aethelgard = new Guild("Aethelgard Guild", "Istana Bintang Perak", 15000, 50);

        // Menyiapkan anggota awal
        Warrior w1 = new Warrior("Arthur Pendragon", 35, 1200, 320, "Excalibur Replica");
        Mage m1 = new Mage("Frieren", 80, 750, 950, "Zoltraak Arcana");
        MagicKnight k1 = new MagicKnight("Erza Scarlet", 50, 1600, 500, "Heaven's Wheel", 450, "Cahaya Petir", "Bilah Suci Valkyrie");

        // Mendaftarkan anggota awal ke serikat
        aethelgard.addWarrior(w1);
        aethelgard.addMage(m1);
        aethelgard.addMagicKnight(k1);

        System.out.println(">>> KONDISI SERIKAT SEBELUM PENAMBAHAN ANGGOTA BARU <<<\n");
        aethelgard.displayGuild();

        // Penambahan anggota baru ke dalam koleksi serikat
        Warrior w2 = new Warrior("Guts", 42, 1850, 450, "Dragon Slayer");
        Mage m2 = new Mage("Megumin", 28, 600, 800, "Explosion Magic");
        MagicKnight k2 = new MagicKnight("Rimuru Tempest", 65, 2200, 700, "Demon Katana", 850, "Api Hitam Neraka", "Veldora Blade");

        aethelgard.addWarrior(w2);
        aethelgard.addMage(m2);
        aethelgard.addMagicKnight(k2);

        System.out.println(">>> KONDISI SERIKAT SESUDAH PENAMBAHAN ANGGOTA BARU <<<\n");
        aethelgard.displayGuild();

        // Demonstrasi aksi dan skill masing-masing kelas turunan
        System.out.println(">>> SIMULASI PERTEMPURAN & PENGGUNAAN SKILL KARAKTER <<<\n");
        w1.slashAttack();
        w2.slashAttack();
        System.out.println();

        m1.castSpell();
        m2.castSpell();
        System.out.println();

        k1.slashAttack();
        k1.castSpell();
        k1.elementalStrike();
        System.out.println();

        k2.elementalStrike();
    }
}
