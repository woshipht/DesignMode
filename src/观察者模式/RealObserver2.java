package 观察者模式;

public class RealObserver2 implements Observer {
    @Override
    public void response() {
        System.out.println("RealObserver2 观察到Subject目标发生变化");
    }
}
