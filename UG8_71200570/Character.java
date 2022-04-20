package com.ug8.ObjectAttack;

public abstract class Character implements com.ug8.ObjectAttack {
    public java.lang.Character(String,int,int);

    private protected int damage;
    private protected String name;
    private protected int health;

    public void showCharacterInfo();
    public boolean isDie(){
        if health < =  0
            return true;
        else
            return false;
    }

    public void attacked(int);

}
