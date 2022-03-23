package com.ug7.ewallet;

public class ShopeePay extends eWallet {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(com.ug7.ewallet.User user){
        this user = user;
    }

    public void topup(int jumlah){
        this.feeTopup = jumlah;
    }

    public void transfer(eWallet eWallet, int jumlah){
        if(saldo < jumlah){
           System.out.println(isEmailConfirmed);
           this.feeTransfer -= jumlah;
           System.out.println(feeTransfer);

        }


    }

    public void withdraw(int jumlah){
        this.feeWithdraw += jumlah;
    }

    public void getinfo(){

    }

    public void setFeeTopup(void topup , int jumlah){
        topup = jumlah topup + feeTopup;
    }

    public void setFeeTransfer(void transfer, int jumlah){
        transfer = jumlah transfer + feeTransfer;
    }

    public void setFeeWithdraw(void withdraw, int jumlah){
        withdraw = jumlah withdraw + feeWithdraw;
    }

}
