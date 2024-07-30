package com.aameen.lmbda;
import java.util.List;

@FunctionalInterface
public interface FilterInterface {
    List<Fruit> filterFruits(List<Fruit> list, String value);
}
