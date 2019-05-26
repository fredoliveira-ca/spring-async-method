package com.fredoliveira;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final AsyncService asyncService;

    public AppRunner(AsyncService gitHubLookupService) {
        this.asyncService = gitHubLookupService;
    }

    @Override
    public void run(String... args) throws Exception {

        asyncService.executeAsync("Call 1");
        asyncService.executeAsync("Call 2");
        asyncService.executeAsync("Call 3");
        asyncService.executeAsync("Call 4");
        asyncService.executeAsync("Call 5");
        asyncService.executeAsync("Call 6");
        asyncService.executeAsync("Call 7");
        asyncService.executeAsync("Call 8");
        asyncService.executeAsync("Call 9");
        asyncService.executeAsync("Call 10");

    }

}
