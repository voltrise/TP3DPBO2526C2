#pragma once
#include <iostream>
#include <string>

using namespace std;

class Character {
protected:
    string name;
    int level;
    int hp;

public:
    Character() {
        this->name = "";
        this->level = 1;
        this->hp = 100;
    }

    Character(string name, int level, int hp) {
        this->name = name;
        this->level = level;
        this->hp = hp;
    }

    void setName(string name) {
        this->name = name;
    }

    string getName() const {
        return this->name;
    }

    void setLevel(int level) {
        this->level = level;
    }

    int getLevel() const {
        return this->level;
    }

    void setHp(int hp) {
        this->hp = hp;
    }

    int getHp() const {
        return this->hp;
    }

    void displayCharacter() const {
        cout << "Nama: " << name << " | Level: " << level << " | HP: " << hp;
    }

    ~Character() { }
};
