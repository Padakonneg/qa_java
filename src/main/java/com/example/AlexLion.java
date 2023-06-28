package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private final List<String> listFriend = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    private final String location = "Нью-Йоркский зоопарк";

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return listFriend;
    }

    public String getPlaceOfLiving() {
        return location;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
