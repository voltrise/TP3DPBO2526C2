#pragma once
#include <iostream>
#include <string>

using namespace std;

class GuildHall {
private:
    string hallName;
    int goldReserve;
    int capacity;

public:
    GuildHall() {
        this->hallName = "Aula Dasar";
        this->goldReserve = 0;
        this->capacity = 10;
    }

    GuildHall(string hallName, int goldReserve, int capacity) {
        this->hallName = hallName;
        this->goldReserve = goldReserve;
        this->capacity = capacity;
    }

    void setHallName(string hallName) {
        this->hallName = hallName;
    }

    string getHallName() const {
        return this->hallName;
    }

    void setGoldReserve(int goldReserve) {
        this->goldReserve = goldReserve;
    }

    int getGoldReserve() const {
        return this->goldReserve;
    }

    void setCapacity(int capacity) {
        this->capacity = capacity;
    }

    int getCapacity() const {
        return this->capacity;
    }

    void displayHall() const {
        cout << "Fasilitas Aula: " << hallName 
             << " | Kas Serikat: " << goldReserve << " Gold"
             << " | Kapasitas: " << capacity << " Anggota" << endl;
    }

    ~GuildHall() { }
};
