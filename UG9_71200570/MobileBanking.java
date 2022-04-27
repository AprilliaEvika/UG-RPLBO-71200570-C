package com.ug9.etransactionproject;

public class MobileBanking extends com.ug9.eTransactionProject.DigitalPayment {
    private boolean checkFree;
    private long feeAntarBank = 6000;
    private String noRekening;

    private String nama;
    private long saldo;

    public MobileBanking(String nama, long saldo, String noRekening){
        this.nama = nama;
        this.saldo = saldo;
        this.noRekening = noRekening;

    }
    public String getNoRekening(){
        return noRekening;

    }
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal){
        if saldo <= 0;
        System.out.println("Input tidak valid");

        if saldo >= 0

        if checkFree == true;
        saldo - nominal - feeAntarBank;




    }
    public boolean isCheckFee(){

    }
    public  void setCheckFree(boolean isCheckFee){
        this.checkFree = checkFree;

    }

}
