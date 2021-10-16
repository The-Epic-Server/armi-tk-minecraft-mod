package net.tkdkid1000.survivalmod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mod implements ModInitializer {
	
	public static final Logger LOGGER = LogManager.getLogger("survivalmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
