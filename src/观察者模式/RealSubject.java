package 观察者模式;

public class RealSubject extends Subject{

    @Override
    public void notifyAllObserver() {
        System.out.println("RealSubject目标发生变化！");

        for(Observer observer : observers){
            observer.response();
        }
    }
}
