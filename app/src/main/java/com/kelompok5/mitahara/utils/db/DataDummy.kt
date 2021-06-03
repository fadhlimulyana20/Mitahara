package com.kelompok5.mitahara.utils.db

import com.kelompok5.mitahara.R
import com.kelompok5.mitahara.data.model.DietPlanModel
import com.kelompok5.mitahara.data.model.IngredientsModel
import com.kelompok5.mitahara.data.model.NutritionsModel

class DataDummy {

    val listDietPlan = listOf(
        DietPlanModel("Telur Orak Arik", "Breakfast", "148 kCal", R.drawable.image_telur),
        DietPlanModel("Capcay", "Dinner", "120 kCal", R.drawable.image_capcay),
        DietPlanModel("Telur Orak Arik", "Breakfast", "148 kCal", R.drawable.image_telur),
        DietPlanModel("Capcay", "Dinner", "120 kCal", R.drawable.image_capcay),
        DietPlanModel("Telur Orak Arik", "Breakfast", "148 kCal", R.drawable.image_telur),
    )

    val listNutritionsCapcay = listOf(
        NutritionsModel("Calories", "97", "kcal"),
        NutritionsModel("Protein", "5,80", "gr"),
        NutritionsModel("Fat", "6,30", "gr"),
        NutritionsModel("Carbo", "4,20", "gr"),
    )

    val listNutritionsTelur = listOf(
        NutritionsModel("Calories", "90", "kcal"),
        NutritionsModel("Protein", "13,87", "gr"),
        NutritionsModel("Fat", "6,16", "gr"),
        NutritionsModel("Carbo", "19,8", "gr"),
    )

    val listIngredientsCapcay = listOf(
        IngredientsModel("1 ounce of cabbage, cut"),
        IngredientsModel("1 ounce broccoli, cut"),
        IngredientsModel("1 ounce carrots, sliced"),
        IngredientsModel("Garlic and onion to taste"),
        IngredientsModel("1 tsp oyster sauce"),
        IngredientsModel("1 tsp tomato sauce"),
        IngredientsModel("400 ml of water"),
        IngredientsModel("Mushrooms, chicken and meatballs according to taste"),
    )

    val listIngredientsTelur = listOf(
        IngredientsModel("1 clove garlic"),
        IngredientsModel("1 clove onion"),
        IngredientsModel("2 tomatoes, cut into rounds"),
        IngredientsModel("Chili if you like"),
        IngredientsModel("30 g mustard greens, sliced"),
        IngredientsModel("Salt, mushroom broth, sugar and pepper to taste"),
        IngredientsModel("1 whole egg"),
        IngredientsModel("1 egg white"),
    )

    val stepCapcay = """    
        <p>
        1. Pour a little water into the pan<br>
        2. Add the chopped onion and mashed garlic<br>
        3. Stir until smell nice<br>
        4. Add chicken and meatballs<br>
        5. Add carrots, mushrooms and more water +- 300 ml<br>
        6. Stir everything and wait for the water to boiled<br>
        7. Add cabbage, broccoli, sauces and flavorings<br>
        8. Wait a minute and Capcay is ready to eat<br>
        </p>        
        """

    val stepTelur = """    
        <p>
        1. Smash and chop the garlic and onio<br>
        2. Heat the tomatoes in a pan until it release water, stir so they don't burn<br>
        3. Break the eggs and then pour into the pan<br>
        4. Add the mustard greens and chilies<br>
        5. Add spices like salt, mushroom broth, sugar and pepper<br>
        6. Stir and let it cook<br>
        7. Scrambled eggs are ready to eat
        </p>        
        """
}