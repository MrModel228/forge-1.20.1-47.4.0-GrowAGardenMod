package net.MrModel.GrowAGardenMod.item;

import net.MrModel.GrowAGardenMod.GrowAGardenMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GrowAGardenMod.MOD_ID);

    public static final RegistryObject<Item> CARROT_SEED = ITEMS.register("carrotseed",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
