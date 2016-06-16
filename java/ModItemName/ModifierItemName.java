package ModItemName;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mod(modid = ModifierItemName.MOD_ID,
        name = ModifierItemName.MOD_NAME,
        version = ModifierItemName.MOD_VERSION,
        dependencies = ModifierItemName.MOD_DEPENDENCIES,
        useMetadata = true,
        acceptedMinecraftVersions = ModifierItemName.MOD_MC_VERSION)
public class ModifierItemName {
    public static final String MOD_ID = "ModifierItemName";
    public static final String MOD_NAME = "ModifierItemName";
    public static final String MOD_VERSION = "@VERSION@";
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[11.14.0.1237,)";
    public static final String MOD_MC_VERSION = "[1.8,1.8.9]";
    public static HashMap<String, List<String>> modStringMap = new HashMap<>();
    public static HashMap<String, List<String>> modStringJpMap = new HashMap<>();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new PickUpEventHooks());
        this.addModName();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
//		this.checkMap();
    }

    public void addModName() {
        List<String> list0 = new ArrayList<>();
        List<String> listJp0 = new ArrayList<>();
        listJp0.add("鉄壁な");
        listJp0.add("堅固な");
        listJp0.add("頑丈な");
        list0.add("hard");
        list0.add("impregnable");
        list0.add("strong");
        modStringJpMap.put(Enchantment.protection.getName(), listJp0);
        modStringMap.put(Enchantment.protection.getName(), list0);
        List<String> list1 = new ArrayList<>();
        List<String> listJp1 = new ArrayList<>();
        listJp1.add("防炎処理された");
        listJp1.add("炎を防ぎし");
        list1.add("fireproof");
        modStringJpMap.put(Enchantment.fireProtection.getName(), listJp1);
        modStringMap.put(Enchantment.fireProtection.getName(), list1);
        List<String> list2 = new ArrayList<>();
        List<String> listJp2 = new ArrayList<>();
        listJp2.add("羽を持つ");
        listJp2.add("体が軽くなる");
        list2.add("feather");
        modStringJpMap.put(Enchantment.featherFalling.getName(), listJp2);
        modStringMap.put(Enchantment.featherFalling.getName(), list2);
        List<String> list3 = new ArrayList<>();
        List<String> listJp3 = new ArrayList<>();
        listJp3.add("耐爆処理された");
        listJp3.add("ボマー用の");
        list3.add("explosion proof");
        modStringJpMap.put(Enchantment.blastProtection.getName(), listJp3);
        modStringMap.put(Enchantment.blastProtection.getName(), list3);
        List<String> list4 = new ArrayList<>();
        List<String> listJp4 = new ArrayList<>();
        listJp4.add("防弾処理された");
        listJp4.add("飛び道具に強い");
        list4.add("bulletproof");
        modStringJpMap.put(Enchantment.projectileProtection.getName(), listJp4);
        modStringMap.put(Enchantment.projectileProtection.getName(), list4);
        List<String> list5 = new ArrayList<>();
        List<String> listJp5 = new ArrayList<>();
        listJp5.add("呼吸補助の付いた");
        listJp5.add("息が長く続く");
        list5.add("breath help");
        modStringJpMap.put(Enchantment.respiration.getName(), listJp5);
        modStringMap.put(Enchantment.respiration.getName(), list5);
        List<String> list6 = new ArrayList<>();
        List<String> listJp6 = new ArrayList<>();
        listJp6.add("水中作業可能な");
        list6.add("watarworkable");
        modStringJpMap.put(Enchantment.aquaAffinity.getName(), listJp6);
        modStringMap.put(Enchantment.aquaAffinity.getName(), list6);
        List<String> list7 = new ArrayList<>();
        List<String> listJp7 = new ArrayList<>();
        listJp7.add("棘のある");
        listJp7.add("自動反撃する");
        list7.add("thorn-added");
        modStringJpMap.put(Enchantment.thorns.getName(), listJp7);
        modStringMap.put(Enchantment.thorns.getName(), list7);
        List<String> list16 = new ArrayList<>();
        List<String> listJp16 = new ArrayList<>();
        listJp16.add("鋭利な");
        listJp16.add("よく研がれた");
        list16.add("sharp");
        modStringJpMap.put(Enchantment.sharpness.getName(), listJp16);
        modStringMap.put(Enchantment.sharpness.getName(), list16);
        List<String> list17 = new ArrayList<>();
        List<String> listJp17 = new ArrayList<>();
        listJp17.add("死者殺しと言われる");
        list17.add("undead-killer");
        modStringJpMap.put(Enchantment.smite.getName(), listJp17);
        modStringMap.put(Enchantment.smite.getName(), list17);
        List<String> list18 = new ArrayList<>();
        List<String> listJp18 = new ArrayList<>();
        listJp18.add("虫狩りと呼ばれる");
        list18.add("arthropods-killer");
        modStringJpMap.put(Enchantment.baneOfArthropods.getName(), listJp18);
        modStringMap.put(Enchantment.baneOfArthropods.getName(), list18);
        List<String> list19 = new ArrayList<>();
        List<String> listJp19 = new ArrayList<>();
        listJp19.add("飛ばしに使われる");
        list19.add("knockback");
        modStringJpMap.put(Enchantment.knockback.getName(), listJp19);
        modStringMap.put(Enchantment.knockback.getName(), list19);
        List<String> list20 = new ArrayList<>();
        List<String> listJp20 = new ArrayList<>();
        listJp20.add("炎を纏いし");
        list20.add("flamed");
        modStringJpMap.put(Enchantment.fireAspect.getName(), listJp20);
        modStringMap.put(Enchantment.fireAspect.getName(), list20);
        List<String> list21 = new ArrayList<>();
        List<String> listJp21 = new ArrayList<>();
        listJp21.add("分捕りに最適な");
        list21.add("looting");
        modStringJpMap.put(Enchantment.looting.getName(), listJp21);
        modStringMap.put(Enchantment.looting.getName(), list21);
        List<String> list32 = new ArrayList<>();
        List<String> listJp32 = new ArrayList<>();
        listJp32.add("効率的な");
        listJp32.add("時間節約になる");
        list32.add("efficiently workable");
        modStringJpMap.put(Enchantment.efficiency.getName(), listJp32);
        modStringMap.put(Enchantment.efficiency.getName(), list32);
        List<String> list33 = new ArrayList<>();
        List<String> listJp33 = new ArrayList<>();
        listJp33.add("そのまま採れる");
        list33.add("shape-keeping");
        modStringJpMap.put(Enchantment.silkTouch.getName(), listJp33);
        modStringMap.put(Enchantment.silkTouch.getName(), list33);
        List<String> list34 = new ArrayList<>();
        List<String> listJp34 = new ArrayList<>();
        listJp34.add("壊れにくい");
        list34.add("unbreaking");
        modStringJpMap.put(Enchantment.unbreaking.getName(), listJp34);
        modStringMap.put(Enchantment.unbreaking.getName(), list34);
        List<String> list35 = new ArrayList<>();
        List<String> listJp35 = new ArrayList<>();
        listJp35.add("幸運になる");
        list35.add("fortune");
        modStringJpMap.put(Enchantment.fortune.getName(), listJp35);
        modStringMap.put(Enchantment.fortune.getName(), list35);
        List<String> list48 = new ArrayList<>();
        List<String> listJp48 = new ArrayList<>();
        listJp48.add("強弓と自慢できる");
        list48.add("power shootable");
        modStringJpMap.put(Enchantment.power.getName(), listJp48);
        modStringMap.put(Enchantment.power.getName(), list48);
        List<String> list49 = new ArrayList<>();
        List<String> listJp49 = new ArrayList<>();
        listJp49.add("吹き飛ばせる");
        list49.add("arrow-punching");
        modStringJpMap.put(Enchantment.punch.getName(), listJp49);
        modStringMap.put(Enchantment.punch.getName(), list49);
        List<String> list50 = new ArrayList<>();
        List<String> listJp50 = new ArrayList<>();
        listJp50.add("炎を帯びし矢を放つ");
        list50.add("flamed arrow shootable");
        modStringJpMap.put(Enchantment.flame.getName(), listJp50);
        modStringMap.put(Enchantment.flame.getName(), list50);
        List<String> list51 = new ArrayList<>();
        List<String> listJp51 = new ArrayList<>();
        listJp51.add("撃ち放題な");
        list51.add("infinite arrow");
        modStringJpMap.put(Enchantment.infinity.getName(), listJp51);
        modStringMap.put(Enchantment.infinity.getName(), list51);
        List<String> list61 = new ArrayList<>();
        List<String> listJp61 = new ArrayList<>();
        listJp61.add("良いものが釣れる");
        list61.add("good-fishing");
        modStringJpMap.put(Enchantment.luckOfTheSea.getName(), listJp61);
        modStringMap.put(Enchantment.luckOfTheSea.getName(), list61);
        List<String> list62 = new ArrayList<>();
        List<String> listJp62 = new ArrayList<>();
        listJp62.add("釣りやすい");
        list62.add("easy-fishing");
        modStringJpMap.put(Enchantment.lure.getName(), listJp62);
        modStringMap.put(Enchantment.lure.getName(), list62);
    }

    public class PickUpEventHooks {
        @SubscribeEvent
        public void PickUp(EntityItemPickupEvent event) {
            if (!event.item.getEntityItem().hasDisplayName() && event.item.getEntityItem().isItemEnchanted()) {
                String str = "";
                String mn = null;
                List<String> list;
                int lv;
                int size;
                for (Enchantment enchantment : Enchantment.enchantmentsBookList) {
                    if (EnchantmentHelper.getEnchantmentLevel(enchantment.effectId, event.item.getEntityItem()) > 0) {
                        list = ModifierItemName.modStringJpMap.get(enchantment.getName());
                        if (list != null) {
                            size = list.size();
                            System.out.println(size);
                            mn = list.get(event.entityPlayer.worldObj.rand.nextInt(size));
                        } else {
                            mn = "不思議な";
                        }
                        if (mn != null)
                            str = str + mn;
                    }
                }
                str = str + event.item.getEntityItem().getDisplayName();
                event.item.getEntityItem().setStackDisplayName(str);
            }
        }
    }
}