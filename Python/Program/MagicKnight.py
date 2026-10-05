from Warrior import Warrior
from Mage import Mage

class MagicKnight(Warrior, Mage):
    def __init__(self, name="", level=1, hp=100, stamina=100, weapon_type="Pedang Besi",
                 mana=100, spell_element="Api", enchanted_blade="Bilah Sihir Rune"):
        # Inisialisasi eksplisit kedua kelas induk (Multiple Inheritance)
        Warrior.__init__(self, name, level, hp, stamina, weapon_type)
        Mage.__init__(self, name, level, hp, mana, spell_element)
        self.__enchanted_blade = enchanted_blade

    def set_enchanted_blade(self, blade):
        self.__enchanted_blade = blade

    def get_enchanted_blade(self):
        return self.__enchanted_blade

    def elemental_strike(self):
        print(f"[Skill Hybrid] {self.get_name()} melapisi {self.__enchanted_blade} dengan elemen {self.get_spell_element()} lalu menebas musuh!")

    def display_magic_knight(self):
        print(f"Nama: {self.get_name()} | Level: {self.get_level()} | HP: {self.get_hp()} | Stamina: {self.get_stamina()} | Mana: {self.get_mana()} | Bilah: {self.__enchanted_blade} ({self.get_spell_element()})")
