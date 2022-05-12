package overit.cdi.services;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class ServiceAImpl implements ServiceA {

    @Inject
    private ServiceB serviceB;

    @Override
    public String helloUser(String name, int age) {
        return String.format("Hello %s, your current age is %d.<br/>Twice your age is %d", name, age, serviceB.duplicate(age));
    }
}
