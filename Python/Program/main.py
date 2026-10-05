from Guild import Guild
from Warrior import Warrior
from Mage import Mage
from MagicKnight import MagicKnight

def main():
    # Inisialisasi Serikat Petualang
    aethelgard = Guild("Aethelgard Guild", "Istana Bintang Perak", 15000, 50)

    # Menyiapkan anggota awal
    w1 = Warrior("Arthur Pendragon", 35, 1200, 320, "Excalibur Replica")
    m1 = Mage("Frieren", 80, 750, 950, "Zoltraak Arcana")
    k1 = MagicKnight("Erza Scarlet", 50, 1600, 500, "Heaven's Wheel", 450, "Cahaya Petir", "Bilah Suci Valkyrie")

    # Mendaftarkan anggota awal ke serikat
    aethelgard.add_warrior(w1)
    aethelgard.add_mage(m1)
    aethelgard.add_magic_knight(k1)

    print(">>> KONDISI SERIKAT SEBELUM PENAMBAHAN ANGGOTA BARU <<<\n")
    aethelgard.display_guild()

    # Penambahan anggota baru ke dalam koleksi serikat
    w2 = Warrior("Guts", 42, 1850, 450, "Dragon Slayer")
    m2 = Mage("Megumin", 28, 600, 800, "Explosion Magic")
    k2 = MagicKnight("Rimuru Tempest", 65, 2200, 700, "Demon Katana", 850, "Api Hitam Neraka", "Veldora Blade")

    aethelgard.add_warrior(w2)
    aethelgard.add_mage(m2)
    aethelgard.add_magic_knight(k2)

    print(">>> KONDISI SERIKAT SESUDAH PENAMBAHAN ANGGOTA BARU <<<\n")
    aethelgard.display_guild()

    # Demonstrasi aksi dan skill masing-masing kelas turunan
    print(">>> SIMULASI PERTEMPURAN & PENGGUNAAN SKILL KARAKTER <<<\n")
    w1.slash_attack()
    w2.slash_attack()
    print()

    m1.cast_spell()
    m2.cast_spell()
    print()

    k1.slash_attack()
    k1.cast_spell()
    k1.elemental_strike()
    print()

    k2.elemental_strike()

if __name__ == "__main__":
    main()
