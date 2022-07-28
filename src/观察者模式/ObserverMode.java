package 观察者模式;

public class ObserverMode {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        RealObserver1 observer1 = new RealObserver1();
        RealObserver2 observer2 = new RealObserver2();
        realSubject.add(observer1);
        realSubject.add(observer2);

        realSubject.notifyAllObserver();
    }
}
