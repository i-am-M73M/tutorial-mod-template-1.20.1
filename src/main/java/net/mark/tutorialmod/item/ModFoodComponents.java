package net.mark.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MAPLE_SIRUP_BREAD = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1800, 3), 1f).build();
}
