package fr.noalegeek.noafabricmod.block;

import fr.noalegeek.noafabricmod.NoaFabricMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ModBlocks {
    
    public static final Block CHESSGAMITE_BLOCK = registerBlock("chessgamite_block", 
        new Block(AbstractBlock.Settings.create().strength(8.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block CHESSGAMITE_ORE = registerBlock("chessgamite_ore", 
        new Block(AbstractBlock.Settings.create().strength(13.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NoaFabricMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NoaFabricMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        NoaFabricMod.LOGGER.info("Registering Mod Blocks for " + NoaFabricMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CHESSGAMITE_BLOCK);
            entries.add(CHESSGAMITE_ORE);
        });
    }
}
