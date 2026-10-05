from Character import Character

class Mage(Character):
    def __init__(self, name="", level=1, hp=100, mana=100, spell_element="Api"):
        super().__init__(name, level, hp)
        self.__mana = mana
        self.__spell_element = spell_element

    def set_mana(self, mana):
        self.__mana = mana

    def get_mana(self):
        return self.__mana

    def set_spell_element(self, spell_element):
        self.__spell_element = spell_element

    def get_spell_element(self):
        return self.__spell_element

    def cast_spell(self):
        print(f"[Skill Mage] {self.get_name()} merapalkan sihir berelemen {self.__spell_element}!")

    def display_mage(self):
        print(f"Nama: {self.get_name()} | Level: {self.get_level()} | HP: {self.get_hp()} | Mana: {self.__mana} | Elemen: {self.__spell_element}")
