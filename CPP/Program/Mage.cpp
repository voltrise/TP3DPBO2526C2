#pragma once
#include <iostream>
#include <string>
#include "Character.cpp"

using namespace std;

class Mage : public Character {
protected:
    int mana;
    string spellElement;

public:
    Mage() : Character() {
        this->mana = 100;
        this->spellElement = "Api";
    }

    Mage(string name, int level, int hp, int mana, string spellElement)
        : Character(name, level, hp) {
        this->mana = mana;
        this->spellElement = spellElement;
    }

    void setMana(int mana) {
        this->mana = mana;
    }

    int getMana() const {
        return this->mana;
    }

    void setSpellElement(string spellElement) {
        this->spellElement = spellElement;
    }

    string getSpellElement() const {
        return this->spellElement;
    }

    void castSpell() const {
        cout << "[Skill Mage] " << name << " merapalkan sihir berelemen " 
             << spellElement << "!" << endl;
    }

    void displayMage() const {
        displayCharacter();
        cout << " | Mana: " << mana << " | Elemen: " << spellElement << endl;
    }

    ~Mage() { }
};
