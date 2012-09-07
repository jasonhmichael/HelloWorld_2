package com.jason.my;

import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class HelloWorld
{
    private static SAXBuilder builder;
    private static Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args)
    {
        System.out.println("Hello World.  Jason rules.");
        // nothing else
        LOGGER.error("Oh no!");
    }
}
