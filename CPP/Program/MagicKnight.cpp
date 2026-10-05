#pragma once
#include <iostream>
#include <string>
#include "Warrior.cpp"
#include "Mage.cpp"

using namespace std;

class MagicKnight : public Warrior, public Mage {
private:
    string enchantedBlade;

public:
    MagicKnight() : Warrior(), Mage() {
        this->enchantedBlade = "Bilah Sihir Rune";
    }

    MagicKnight(string name, int level, int hp, int stamina, string weaponType,
                int mana, string spellElement, string enchantedBlade)
        : Warrior(name, level, hp, stamina, weaponType),
          Mage(name, level, hp, mana, spellElement) {
        this->enchantedBlade = enchantedBlade;
    }

    void setEnchantedBlade(string blade) {
        this->enchantedBlade = blade;
    }

    string getEnchantedBlade() const {
        return this->enchantedBlade;
    }

    void elementalStrike() const {
        // Scope resolution operator menyelesaikan ambiguitas duplikasi anggota Character
        cout << "[Skill Hybrid] " << Warrior::name << " melapisi " << enchantedBlade 
             << " dengan elemen " << spellElement << " lalu menebas musuh!" << endl;
    }

    void displayMagicKnight() const {
        cout << "Nama: " << Warrior::name << " | Level: " << Warrior::level 
             << " | HP: " << Warrior::hp << " | Stamina: " << stamina 
             << " | Mana: " << mana << " | Bilah: " << enchantedBlade 
             << " (" << spellElement << ")" << endl;
    }

    ~MagicKnight() { }
};
