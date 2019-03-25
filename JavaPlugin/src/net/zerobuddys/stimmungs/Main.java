package net.zerobuddys.stimmungs;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

    public static String Prefix = "§8[§3§lSystem§8] §7| ";
    public static String Dev = "§8[§l§bDev§r§8] §7| ";
    public static String NoPlayer = "§8[§c§lNoPlayer§8] §7| ";
    public static String PluginOn = "§aDas Plugin Wurde Erfolgrich Geladen!";
    public static String PluginOff = "§cDas Plugin Wurde Erfolgrich Gestoppt!";
    public static String NoPlayerMessage = "§cDu Musst Ein Spieler Sein Um Diesen Command Zu Nutzen!";
    public static String SystemPrefix = "§8[§6§lStimmunsSystem§8] §7| ";
    public static String Command = "§8[§6§lCommandHelp§8] §7| ";
    public static String DevMessage = "§7Der Developer Von Diesen Systems Ist §eZeroBuddysYT!";

    @Override
    public void onEnable() {
        getLogger().info(Prefix + PluginOn);
        getLogger().info(Dev + DevMessage);
    }

    @Override
    public boolean onCommand(CommandSender sender, cn.nukkit.command.Command command, String label, String[] args) {
        switch (command.getName().toLowerCase()){
            case "dev":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.sendMessage(Dev + DevMessage);
                break;
            case "plhelp":
                sender.sendMessage(TextFormat.GRAY + "----------------" + Command + TextFormat.GRAY + "--------------------");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/dev" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/happy" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/angry" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/alone" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/love" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/sad" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/nervous" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/frustraed" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(SystemPrefix + TextFormat.YELLOW + "/annoyed" + TextFormat.GRAY + "Infos Zum developer Des Plugins!");
                sender.sendMessage(TextFormat.GRAY + "----------------" + Command + TextFormat.GRAY + "--------------------");
                break;
            case "happy":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.GREEN + "Ist Wohl Grade Froh Drauf!");
                break;

            case "angry":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.RED + "Ist Grade Ein Bisschen Sauer grade!");
                break;

            case "alone":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.GRAY + "Er Ist, grade Ein Bisschen Alone!");
                break;
            case "love":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.DARK_PURPLE + sender.getName() + TextFormat.RED + "Er Ist Wohl in eine Verliebt!");
                break;
            case "sad":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.GRAY + sender.getName() + TextFormat.BLUE + "Er ist grade Ein Bisschen Sad!");
                break;
            case "nervous":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist grade Ein Bisschen nervous");
                break;
            case "frustraed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist Garde Wegen einer Sache frustraed! ");
                break;
            case "annoyed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + NoPlayerMessage);
                    break;
                }
                sender.getName();
                sender.getServer().broadcastMessage(TextFormat.AQUA + sender.getName() + TextFormat.GREEN + "Er Ist grade ein Bisschen verärgert!");
                break;

        }
        return true;
    }
    @Override
    public void onDisable() {
        getLogger().info(Prefix + PluginOff);
        getLogger().info(Dev + DevMessage);
    }
}
