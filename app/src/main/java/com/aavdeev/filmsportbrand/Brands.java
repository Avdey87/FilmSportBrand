package com.aavdeev.filmsportbrand;

public class Brands {
    private String name;
    private String description;


    public static final Brands[] brandList = {
            new Brands("Nike","ike, Inc. — американская компания, всемирно известный производитель спортивной одежды и обуви. Штаб-квартира — в городе Бивертон. По мнению аналитиков, на долю компании Nike приходится почти 95 % рынка баскетбольной обуви в США."),
            new Brands("Adidas","didas AG — немецкий промышленный концерн, специализирующийся на выпуске спортивной обуви, одежды и инвентаря. Генеральный директор компании — Каспер Рорштед."),
            new Brands("Reebok","Reebok — международная компания по производству спортивной одежды и аксессуаров. Штаб-квартира расположена в пригороде Бостона Кэнтоне. В настоящее время является дочерним подразделением компании Adidas"),
    };

    public Brands(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
