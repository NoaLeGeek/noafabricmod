package fr.noalegeek.noafabricmod.item;

import fr.noalegeek.noafabricmod.NoaFabricMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MISINI_SHEET = registerItem("misini_sheet", new Item(new Item.Settings()));
    public static final Item RAW_CHESSGAMITE = registerItem("raw_chessgamite", new Item(new Item.Settings()));
    public static final Item CHESSGAMITE_INGOT = registerItem("chessgamite_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NoaFabricMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NoaFabricMod.LOGGER.info("Registering Mod Items for " + NoaFabricMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MISINI_SHEET);
            entries.add(RAW_CHESSGAMITE);
            entries.add(CHESSGAMITE_INGOT);
        });
    }

}
