package ru.netology.javaqa.JAVAMvnHomework2.services;

public class Main {
    public static void main(String[] args) {
        WorkScheduleService service = new WorkScheduleService();
        System.out.println(service.calcSchedule(10_000, 3000, 20_000));
    }
}




