package com.example.ultra.pageobjects.common;

import io.qameta.atlas.webdriver.ElementsCollection;

import java.util.Random;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;

public interface BaseCollection<E> extends ElementsCollection<E> {
    default E randomItem () {
        this.should(not(empty()));
        int index = new Random().nextInt(this.size());
        return this.get(index);
    }
}
