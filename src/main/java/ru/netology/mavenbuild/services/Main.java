package ru.netology.mavenbuild.services;

import ru.netology.mavenbuild.services.McountService;

public class Main {

    public static void main(String[] args) {
        McountService service = new McountService();
        System.out.println(service.McountService(100_000, 60_000, 150_000));
    }
}