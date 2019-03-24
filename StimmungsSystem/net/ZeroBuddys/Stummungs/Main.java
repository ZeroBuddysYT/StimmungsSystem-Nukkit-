package net.ZeroBuddys.Stummungs;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginLogger;
import cn.nukkit.utils.TextFormat;

public class Main extends cn.nukkit.plugin.PluginBase implements cn.nukkit.event.Listener
{
  public static String Prefix = "§8[§5StimmungsSystem§8] | ";
  public static String HelpList = "§6 StimmungsSystem §7 -> ";
  public static String Command = "§a StimmungsSystem§7 ";
  public static String Off = "§cDas Plugin Wurde Gestoppt!";
  public static String NoPlayer = "§cDu Drafst Nicht Den command Nutzen, Weil Du musst ein Spieler Sein!";
  public static String Dev = "§bDer Developer ist §eZeroBuddysYT";
  
  public Main() {}
  
  public void onEnable() { getLogger().info(Prefix + TextFormat.GREEN + " Das Plugin Wurde Geladen!");
    getLogger().info(Prefix + Dev);
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    switch (command.getName().toLowerCase()) {
    case "dev": 
      sender.sendMessage(Dev);
      break;
    case "plhelp": 
      sender.sendMessage(TextFormat.GRAY + "xX-----------------" + Command + "------------------------Xx");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/dev" + TextFormat.GRAY + " Infos Zum developer des Plugins");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/happy" + TextFormat.GRAY + " Sendet den Server Dass Du gut drauf bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/angry" + TextFormat.GRAY + " Sendet den Server Das Du Sauer Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/alone" + TextFormat.GRAY + " Sendet den Server Das Du Alone Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/love" + TextFormat.GRAY + " Sendet den Server Das Du Verliebt Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/sad" + TextFormat.GRAY + " Sendet den Server Das Du sad Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/nervous" + TextFormat.GRAY + " Sendet den Server Das Du nervous Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/frustraed" + TextFormat.GRAY + " Sendet den Server Das Du frustraed Bist!");
      sender.sendMessage(HelpList + TextFormat.YELLOW + "/annoyed" + TextFormat.GRAY + " Sendet den Server Das Du annoyed Bist!");
      sender.sendMessage(TextFormat.GRAY + "xX-----------------" + Command + "------------------------Xx");
      break;
    case "happy": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else
      {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.BLUE + sender.getName() + TextFormat.GREEN + " Ist Wohl Gut drauf!"); }
      break;
    
    case "angry": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.RED + sender.getName() + TextFormat.AQUA + " Ist Wohl Sauer!"); }
      break;
    
    case "alone": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.BLUE + sender.getName() + TextFormat.GRAY + " Ist Wohl Alleine!"); }
      break;
    
    case "love": 
      sender.getName();
      sender.getServer().broadcastMessage(TextFormat.DARK_PURPLE + sender.getName() + TextFormat.GRAY + " Ist Wohl Verliebt!");
      break;
    
    case "sad": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.GRAY + sender.getName() + TextFormat.GRAY + " Ist Wohl Grade Sad"); }
      break;
    
    case "nervous": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + " Er Ist Wohl grade eine Bissen nervös"); }
      break;
    
    case "frustraed": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + " Er ist Wohl grade Ein Bissen frustriert!"); }
      break;
    
    case "annoyed": 
      if (!(sender instanceof Player)) {
        sender.sendMessage(Prefix + NoPlayer);
      }
      else {
        sender.getName();
        sender.getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.RED + " Er ist Grade Ein Bissen verärgert!");
      }
      break;
    }
    return true;
  }
  
  public void onDisable()
  {
    getLogger().info(Prefix + Off);
    getLogger().info(Prefix + Dev);
  }
}
