package main;

public class ObserverPatternDemo
{

    public static void main(String[] args)
    {
        Subject subject = new Subject();

        HexaObserver hxo = new HexaObserver(subject);
        OctalObserver oco = new OctalObserver(subject);
        BinaryObserver bno = new BinaryObserver(subject);
        DescriptionObserver dso = new DescriptionObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        subject.detach(hxo);

        System.out.println("Third state change: -2");
        subject.setState(-2);
    }
}
