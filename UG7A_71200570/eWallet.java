package com.ug7.ewallet;

public class eWallet {
    private com.ug7.ewallet.User user;
    private int saldo;

    public eWallet(com.ug7.ewallet.User user){
        this User = user;

    }

    public void topup(int jumlah){
        this.saldo -= jumlah;

    }

    public void transfer(eWallet eWallet, int jumlah){
        this.saldo -= jumlah;

    }

    public void withdraw(int jumlah){
        this.saldo += jumlah;

    }

    public void getinfo(){

    }
}
