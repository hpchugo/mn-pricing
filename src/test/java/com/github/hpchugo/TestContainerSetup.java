package com.github.hpchugo;

import com.github.hpchugo.quotes.external.ExternalQuoteConsumer;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.inject.Inject;

@Testcontainers
class TestContainerSetup {
    private static final Logger LOG = LoggerFactory.getLogger(ExternalQuoteConsumer.class);

    @Rule
    public KafkaContainer kafka = new KafkaContainer();

    @Test
    void setupWorks(){
        kafka.start();
        LOG.debug("Bootstrap Servers{} ", kafka.getBootstrapServers());
        kafka.stop();
    }

}
