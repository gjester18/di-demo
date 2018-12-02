package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 5/24/17.
 */

public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    @Autowired
    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
