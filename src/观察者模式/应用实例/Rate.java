package 观察者模式.应用实例;

import java.util.ArrayList;
import java.util.List;

abstract class Rate {
    protected List<Company> companies = new ArrayList<>();

    public void add(Company company){
        companies.add(company);
    }

    public void remove(Company company){
        companies.remove(company);
    }

    abstract void notifyRateChange(int num);
}
