package vazkii.symphony;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Symphony.MOD_ID, name = Symphony.MOD_NAME, version = Symphony.VERSION, dependencies = Symphony.DEPENDENCIES, clientSideOnly = true)
public class Symphony {

	public static final String MOD_ID = "symphony";
	public static final String MOD_NAME = "Symphony";
	public static final String BUILD = "GRADLE:BUILD";
	public static final String VERSION = "GRADLE:VERSION-" + BUILD;	
	public static final String DEPENDENCIES = "";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Symphony is loaded.");
	}
	
}
