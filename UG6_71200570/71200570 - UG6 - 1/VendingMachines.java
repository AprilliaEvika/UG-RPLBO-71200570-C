import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int useCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<double>acceptanceBalance;
    private double consumenMoney;

    public VendingMachines(){

    }
    public VendingMachines(int code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }
    public VendingMachines(int code, int capacity, Goods goods, double[] accpetanceBalance){

    }
    public void procedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){

    }
    private void giveGood(double goodsPrice, String goodsName){

    }
    public double withdrawMoney();
    public void inputGoods(Goods goods){

    }
}
