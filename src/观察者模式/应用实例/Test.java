package 观察者模式.应用实例;

public class Test {
    /*
    利用观察者模式设计一个程序，分析“人民币汇率”的升值或贬值对进口公司进口产品成本或出口公司的出口产品收入以及公司利润率的影响。

    分析：   当“人民币汇率”升值时，进口公司的进口产品成本降低且利润率提升，出口公司的出口产品收入降低且利润率降低；
            当“人民币汇率”贬值时，进口公司的进口产品成本提升且利润率降低，出口公司的出口产品收入提升且利润率提升。
     */
    public static void main(String[] args){
        RMBRate rmbRate = new RMBRate();
        Company company1 = new InputCompany();
        Company company2 = new OutputCompany();
        rmbRate.add(company1);
        rmbRate.add(company2);

        rmbRate.notifyRateChange(2);
        rmbRate.notifyRateChange(-2);
    }
}
