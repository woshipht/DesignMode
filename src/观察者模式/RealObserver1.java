package 观察者模式;

public class RealObserver1 implements Observer {
    @Override
    public void response() {
        System.out.println("RealObserver1 观察到Subject目标发生变化");
    }
}
