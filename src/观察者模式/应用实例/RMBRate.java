package 观察者模式.应用实例;

public class RMBRate extends Rate{

    @Override
    void notifyRateChange(int num) {
        for(Company company : companies){
            company.response(num);
        }
    }
}
