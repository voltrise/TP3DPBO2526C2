class GuildHall:
    def __init__(self, hall_name="Aula Pemula", gold_reserve=500, capacity=20):
        self.__hall_name = hall_name
        self.__gold_reserve = gold_reserve
        self.__capacity = capacity

    def set_hall_name(self, name):
        self.__hall_name = name

    def get_hall_name(self):
        return self.__hall_name

    def set_gold_reserve(self, gold):
        self.__gold_reserve = gold

    def get_gold_reserve(self):
        return self.__gold_reserve

    def set_capacity(self, capacity):
        self.__capacity = capacity

    def get_capacity(self):
        return self.__capacity

    def display_hall(self):
        print(f"Fasilitas Aula: {self.__hall_name} | Kas Serikat: {self.__gold_reserve} Gold | Kapasitas: {self.__capacity} Anggota")
