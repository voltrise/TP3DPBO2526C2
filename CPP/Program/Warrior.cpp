#pragma once
#include <iostream>
#include <string>
#include "Character.cpp"

using namespace std;

class Warrior : public Character {
protected:
    int stamina;
    string weaponType;

public:
    Warrior() : Character() {
        this->stamina = 100;
        this->weaponType = "Pedang Besi";
    }

    Warrior(string name, int level, int hp, int stamina, string weaponType)
        : Character(name, level, hp) {
        this->stamina = stamina;
        this->weaponType = weaponType;
    }

    void setStamina(int stamina) {
        this->stamina = stamina;
    }

    int getStamina() const {
        return this->stamina;
    }

    void setWeaponType(string weaponType) {
        this->weaponType = weaponType;
    }

    string getWeaponType() const {
        return this->weaponType;
    }

    void slashAttack() const {
        cout << "[Skill Warrior] " << name << " melancarkan tebasan pedang dengan " 
             << weaponType << "!" << endl;
    }

    void displayWarrior() const {
        displayCharacter();
        cout << " | Stamina: " << stamina << " | Senjata: " << weaponType << endl;
    }

    ~Warrior() { }
};
