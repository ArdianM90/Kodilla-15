package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("Sharing something on Twitter.");
        return "Sharing something on Twitter.";
    }
}
