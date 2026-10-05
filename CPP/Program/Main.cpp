#include <iostream>
#include <string>
#include "Guild.cpp"

using namespace std;

int main() {
    // Inisialisasi Serikat Petualang
    Guild aethelgard("Aethelgard Guild", "Istana Bintang Perak", 15000, 50);

    // Menyiapkan anggota awal
    Warrior w1("Arthur Pendragon", 35, 1200, 320, "Excalibur Replica");
    Mage m1("Frieren", 80, 750, 950, "Zoltraak Arcana");
    MagicKnight k1("Erza Scarlet", 50, 1600, 500, "Heaven's Wheel", 450, "Cahaya Petir", "Bilah Suci Valkyrie");

    // Mendaftarkan anggota awal ke serikat
    aethelgard.addWarrior(w1);
    aethelgard.addMage(m1);
    aethelgard.addMagicKnight(k1);

    cout << ">>> KONDISI SERIKAT SEBELUM PENAMBAHAN ANGGOTA BARU <<<\n" << endl;
    aethelgard.displayGuild();

    // Penambahan anggota baru ke dalam koleksi serikat
    Warrior w2("Guts", 42, 1850, 450, "Dragon Slayer");
    Mage m2("Megumin", 28, 600, 800, "Explosion Magic");
    MagicKnight k2("Rimuru Tempest", 65, 2200, 700, "Demon Katana", 850, "Api Hitam Neraka", "Veldora Blade");

    aethelgard.addWarrior(w2);
    aethelgard.addMage(m2);
    aethelgard.addMagicKnight(k2);

    cout << ">>> KONDISI SERIKAT SESUDAH PENAMBAHAN ANGGOTA BARU <<<\n" << endl;
    aethelgard.displayGuild();

    // Demonstrasi aksi dan skill masing-masing kelas turunan
    cout << ">>> SIMULASI PERTEMPURAN & PENGGUNAAN SKILL KARAKTER <<<\n" << endl;
    w1.slashAttack();
    w2.slashAttack();
    cout << endl;

    m1.castSpell();
    m2.castSpell();
    cout << endl;

    k1.slashAttack();
    k1.castSpell();
    k1.elementalStrike();
    cout << endl;

    k2.elementalStrike();

    return 0;
}
