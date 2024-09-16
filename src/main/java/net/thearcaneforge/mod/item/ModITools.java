package net.thearcaneforge.mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thearcaneforge.mod.TheArcaneForge;
import net.thearcaneforge.mod.item.custom.ArcaneChiselItem;
import net.thearcaneforge.mod.item.custom.BismuthChiselItem;
import net.thearcaneforge.mod.item.custom.GarnetChiselItem;

public class ModITools {
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheArcaneForge.MOD_ID);

    public static final RegistryObject<Item> ARCANE_CHISEL = ITEMS.register("arcane_chisel",
            () -> new ArcaneChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> GARNET_CHISEL = ITEMS.register("garnet_chisel",
            () -> new GarnetChiselItem(new Item.Properties().durability(30)));

    public static final RegistryObject<Item> BISMUTH_CHISEL = ITEMS.register("bismuth_chisel",
            () -> new BismuthChiselItem(new Item.Properties().durability(28)));

    public  static  void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
