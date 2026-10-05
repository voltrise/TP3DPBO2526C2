class Character:
    def __init__(self, name="", level=1, hp=100):
        self.__name = name
        self.__level = level
        self.__hp = hp

    def set_name(self, name):
        self.__name = name

    def get_name(self):
        return self.__name

    def set_level(self, level):
        self.__level = level

    def get_level(self):
        return self.__level

    def set_hp(self, hp):
        self.__hp = hp

    def get_hp(self):
        return self.__hp

    def display_character(self):
        print(f"Nama: {self.__name} | Level: {self.__level} | HP: {self.__hp}")
