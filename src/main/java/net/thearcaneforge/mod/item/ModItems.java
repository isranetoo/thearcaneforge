package net.thearcaneforge.mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;

public class ModItems {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheArcaneForge.MOD_ID);

    public  static final RegistryObject<Item> ARCANE_GEMSTONE = ITEMS.register("arcane_gemstone",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> RAW_ARCANE_ORE = ITEMS.register("raw_arcane_ore",
            () -> new Item(new Item.Properties()));

    public  static  void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
