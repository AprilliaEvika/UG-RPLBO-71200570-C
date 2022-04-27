package com.ug9.etransactionproject;

public class MobileWallet extends com.ug9.eTransactionProject.DigitalPayment {
    private String noHp;
    private long feeTransferBank;

    private String nama;
    private long saldo;

    public MobileWallet(String nama, long saldo, String noHp){
        this.nama = nama;
        this.saldo = saldo;
        this.noHp = noHp;

    }
    public void setFeeTransferBank(long feeTransferBank){
        this.feeTransferBank = feeTransferBank;

    }
    public String getNoHp(){
        return noHp;

    }
    public void transfer(com.ug9.eTransactionProject.DigitalPayment dp, long nominal){
        if saldo <= 0;
        System.out.println("Input tidak valid");

        else if saldo <= nominal;
        System.out.println("Transfer gagal, Saldo anda tidak mencukupi);


    }
}
