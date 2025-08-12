package fr.noalegeek.noafabricmod;

import net.fabricmc.api.ModInitializer;
import fr.noalegeek.noafabricmod.item.ModItems;
import fr.noalegeek.noafabricmod.block.ModBlocks;
import fr.noalegeek.noafabricmod.item.ModItemGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoaFabricMod implements ModInitializer {
	public static final String MOD_ID = "noafabricmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}