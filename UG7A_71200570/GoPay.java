package com.ug7.ewallet;

public class GoPay extends eWallet {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(com.ug7.ewallet.User user){
        this user = user;
    }

    public void topup(int jumlah){
        this.feeTopup -= jumlah;
    }

    public void getinfo(){

    }

    public void withdraw(int jumlah){
        this.feeWithdraw += jumlah;
    }

    public void transfer(eWallet eWallet, int jumlah){
        this.feeTransfer -= jumlah;
    }
}
