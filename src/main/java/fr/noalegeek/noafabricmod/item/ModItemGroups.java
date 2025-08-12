package fr.noalegeek.noafabricmod.item;


import fr.noalegeek.noafabricmod.NoaFabricMod;
import fr.noalegeek.noafabricmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHESSGAME_GROUP = Registry.register(Registries.ITEM_GROUP, 
        Identifier.of(NoaFabricMod.MOD_ID, "chessgame_group"), 
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHESSGAMITE_INGOT))
        .displayName(Text.translatable("itemGroup.noafabricmod.chessgame_group"))
        .entries((context, entries) -> {
            entries.add(ModItems.MISINI_SHEET);
            entries.add(ModItems.RAW_CHESSGAMITE);
            entries.add(ModItems.CHESSGAMITE_INGOT);
            entries.add(ModBlocks.CHESSGAMITE_BLOCK);
            entries.add(ModBlocks.CHESSGAMITE_ORE);
        }).build());

    public static void registerItemGroups() {
        NoaFabricMod.LOGGER.info("Registering Item Groups for " + NoaFabricMod.MOD_ID);
    }
    
}
