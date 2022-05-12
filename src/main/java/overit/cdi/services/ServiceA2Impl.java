package overit.cdi.services;

import javax.enterprise.inject.Alternative;

@Alternative
public class ServiceA2Impl implements ServiceA {

    @Override
    public String helloUser(String name, int age) {
        return String.format("Hello %s, your age is %d", name, age);
    }
}
