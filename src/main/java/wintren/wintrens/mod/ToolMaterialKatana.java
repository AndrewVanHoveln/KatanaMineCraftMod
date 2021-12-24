package wintren.wintrens.mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialKatana implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 3.0f;
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 1562;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 25;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return Ingredient.ofItems(Items.DIAMOND);
    }
    
}
