package overit.cdi.services;

public class ServiceBImpl implements ServiceB {

    @Override
    public int duplicate(int number) {
        return number * 2;
    }
}
