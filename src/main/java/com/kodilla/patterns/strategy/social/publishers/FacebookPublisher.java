package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        System.out.println("Sharing something on Facebook.");
        return "Sharing something on Facebook.";
    }
}
