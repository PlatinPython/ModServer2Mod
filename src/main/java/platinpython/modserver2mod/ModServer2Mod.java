package platinpython.modserver2mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import platinpython.modserver2mod.util.RegistryHandler;
import platinpython.modserver2mod.util.registries.BlockRegistry;
import platinpython.modserver2mod.util.registries.ItemRegistry;

@Mod("modserver2mod")
public class ModServer2Mod {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "modserver2mod";

	public ModServer2Mod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		RegistryHandler.register();

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockRegistry.TAIGA_BUSH.get(), RenderType.getCutout());
	}

	public static final ItemGroup ITEM_GROUP_RANDOM = new ItemGroup("modserver2modTabRandom") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemRegistry.PANEM_MUSIC_DISC.get());
		}
	};
}
