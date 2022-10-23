package helpers;

import com.github.javafaker.Faker;
import models.User;

public class UserGenerator {
    /**
     * Генератор случайных данных пользователей для регистрации
     */

    public static User getRandomUser() {
        Faker faker = new Faker();
        return new User()
                .setEmail(faker.internet().emailAddress())
                .setName(faker.name().firstName())
                .setPassword(faker.internet().password());
    }

}