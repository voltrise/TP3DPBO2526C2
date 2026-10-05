from GuildHall import GuildHall
from Warrior import Warrior
from Mage import Mage
from MagicKnight import MagicKnight

class Guild:
    def __init__(self, guild_name="Serikat Petualang", hall_name="Aula Pemula", gold_reserve=500, capacity=20):
        self.__guild_name = guild_name
        # Komposisi: Objek GuildHall diinstansiasi langsung di dalam konstruktor Guild
        self.__hall = GuildHall(hall_name, gold_reserve, capacity)
        # Array of Objects: Mengelola koleksi anggota per divisi
        self.__warriors = []
        self.__mages = []
        self.__knights = []

    def set_guild_name(self, name):
        self.__guild_name = name

    def get_guild_name(self):
        return self.__guild_name

    def set_hall(self, hall):
        self.__hall = hall

    def get_hall(self):
        return self.__hall

    def add_warrior(self, warrior):
        self.__warriors.append(warrior)

    def add_mage(self, mage):
        self.__mages.append(mage)

    def add_magic_knight(self, knight):
        self.__knights.append(knight)

    def display_guild(self):
        print("==========================================================")
        print(f"             SERIKAT: {self.__guild_name}")
        print("==========================================================")
        self.__hall.display_hall()
        print("----------------------------------------------------------")

        print(f"[Divisi Warrior ({len(self.__warriors)} Anggota)]")
        if not self.__warriors:
            print("  (Belum ada anggota Warrior)")
        else:
            for idx, w in enumerate(self.__warriors, 1):
                print(f"  {idx}. ", end="")
                w.display_warrior()

        print(f"\n[Divisi Mage ({len(self.__mages)} Anggota)]")
        if not self.__mages:
            print("  (Belum ada anggota Mage)")
        else:
            for idx, m in enumerate(self.__mages, 1):
                print(f"  {idx}. ", end="")
                m.display_mage()

        print(f"\n[Divisi Elit Magic Knight ({len(self.__knights)} Anggota)]")
        if not self.__knights:
            print("  (Belum ada anggota Magic Knight)")
        else:
            for idx, k in enumerate(self.__knights, 1):
                print(f"  {idx}. ", end="")
                k.display_magic_knight()

        print("==========================================================\n")
