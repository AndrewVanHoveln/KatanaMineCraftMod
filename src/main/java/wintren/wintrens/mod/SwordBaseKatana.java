package wintren.wintrens.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBaseKatana extends SwordItem{

    public SwordBaseKatana(ToolMaterial toolMaterial) {
        super(toolMaterial, 4, -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
    }
    
}
