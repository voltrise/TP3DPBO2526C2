#pragma once
#include <iostream>
#include <vector>
#include <string>
#include "GuildHall.cpp"
#include "Warrior.cpp"
#include "Mage.cpp"
#include "MagicKnight.cpp"

using namespace std;

class Guild {
private:
    string guildName;
    GuildHall hall;
    vector<Warrior> warriors;
    vector<Mage> mages;
    vector<MagicKnight> knights;

public:
    Guild() {
        this->guildName = "Serikat Petualang";
        // Komposisi: Objek GuildHall diinstansiasi langsung di dalam kelas Guild
        this->hall = GuildHall("Aula Pemula", 500, 20);
    }

    Guild(string guildName, string hallName, int goldReserve, int capacity) {
        this->guildName = guildName;
        // Komposisi: Objek GuildHall diciptakan bersamaan dengan objek Guild
        this->hall = GuildHall(hallName, goldReserve, capacity);
    }

    void setGuildName(string name) {
        this->guildName = name;
    }

    string getGuildName() const {
        return this->guildName;
    }

    void setHall(const GuildHall &newHall) {
        this->hall = newHall;
    }

    GuildHall getHall() const {
        return this->hall;
    }

    void addWarrior(const Warrior &w) {
        warriors.push_back(w);
    }

    void addMage(const Mage &m) {
        mages.push_back(m);
    }

    void addMagicKnight(const MagicKnight &k) {
        knights.push_back(k);
    }

    void displayGuild() const {
        cout << "==========================================================" << endl;
        cout << "             SERIKAT: " << guildName << endl;
        cout << "==========================================================" << endl;
        hall.displayHall();
        cout << "----------------------------------------------------------" << endl;

        cout << "[Divisi Warrior (" << warriors.size() << " Anggota)]" << endl;
        if (warriors.empty()) {
            cout << "  (Belum ada anggota Warrior)" << endl;
        } else {
            for (size_t i = 0; i < warriors.size(); i++) {
                cout << "  " << (i + 1) << ". ";
                warriors[i].displayWarrior();
            }
        }

        cout << "\n[Divisi Mage (" << mages.size() << " Anggota)]" << endl;
        if (mages.empty()) {
            cout << "  (Belum ada anggota Mage)" << endl;
        } else {
            for (size_t i = 0; i < mages.size(); i++) {
                cout << "  " << (i + 1) << ". ";
                mages[i].displayMage();
            }
        }

        cout << "\n[Divisi Elit Magic Knight (" << knights.size() << " Anggota)]" << endl;
        if (knights.empty()) {
            cout << "  (Belum ada anggota Magic Knight)" << endl;
        } else {
            for (size_t i = 0; i < knights.size(); i++) {
                cout << "  " << (i + 1) << ". ";
                knights[i].displayMagicKnight();
            }
        }
        cout << "==========================================================\n" << endl;
    }

    ~Guild() { }
};
