package com.gradleexample.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MessageServiceTest {
    private MessageService messageService;

    @Before
    public void before() {
        messageService = new MessageService();
    }

    @Test
    public void shouldRetriveMessage() {
        assertEquals("Hello Worldj", messageService.getMessage());
    }
}