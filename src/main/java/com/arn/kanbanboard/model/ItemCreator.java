package com.arn.kanbanboard.model;

import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

public class ItemCreator implements InstanceCreator {
    @Override
    public Object createInstance(Type type) {
        Item item = new Item("","","");
        return item;
    }
}
