package platinpython.modserver2mod.util.registries;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import platinpython.modserver2mod.ModServer2Mod;
import platinpython.modserver2mod.util.RegistryHandler;

public class ItemRegistry {
	// Music Discs
	public static final RegistryObject<Item> PANEM_MUSIC_DISC = RegistryHandler.ITEMS.register("music_disc_panem",
			() -> new MusicDiscItem(15,
					() -> new SoundEvent(new ResourceLocation(ModServer2Mod.MOD_ID, "music_disc.panem")),
					new Item.Properties().group(ModServer2Mod.ITEM_GROUP_RANDOM).maxStackSize(1)));

	public static void register() {
	}
}
