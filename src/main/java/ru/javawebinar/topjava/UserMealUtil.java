package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserMealUtil {
    public static Set<UserMeal> filteredByCycles (Collection<UserMeal> collection, LocalDateTime after, LocalDateTime before) {
        Set<UserMeal> userMeals = new HashSet<>();
        for (UserMeal userMeal : collection) {
            if (TimeUtil.isBetween(userMeal.getDateTime(), after, before))
                userMeals.add(userMeal);
        }
        return userMeals;
    }
}
