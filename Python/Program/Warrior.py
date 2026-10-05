from Character import Character

class Warrior(Character):
    def __init__(self, name="", level=1, hp=100, stamina=100, weapon_type="Pedang Besi"):
        super().__init__(name, level, hp)
        self.__stamina = stamina
        self.__weapon_type = weapon_type

    def set_stamina(self, stamina):
        self.__stamina = stamina

    def get_stamina(self):
        return self.__stamina

    def set_weapon_type(self, weapon_type):
        self.__weapon_type = weapon_type

    def get_weapon_type(self):
        return self.__weapon_type

    def slash_attack(self):
        print(f"[Skill Warrior] {self.get_name()} melancarkan tebasan pedang dengan {self.__weapon_type}!")

    def display_warrior(self):
        print(f"Nama: {self.get_name()} | Level: {self.get_level()} | HP: {self.get_hp()} | Stamina: {self.__stamina} | Senjata: {self.__weapon_type}")
