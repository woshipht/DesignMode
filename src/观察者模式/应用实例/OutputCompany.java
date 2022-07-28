package 观察者模式.应用实例;

public class OutputCompany implements Company{
    @Override
    public void response(int num) {
        if(num >= 0){
            System.out.println("人民币汇率升值" + num + "个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        }else {
            System.out.println("人民币汇率贬值" + (-num) + "个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
