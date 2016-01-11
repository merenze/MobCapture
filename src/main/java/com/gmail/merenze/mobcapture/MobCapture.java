package com.gmail.merenze.mobcapture;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.SpawnEgg;
import org.bukkit.plugin.java.JavaPlugin;

public class MobCapture extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
	    getServer().getPluginManager().registerEvents(this, this);
	}
	@Override
	public void onDisable() {
		getLogger().info("MobCapture plugin has terminated!");
	}
	@EventHandler
	public void onProjectileHit(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Egg) { //If the damager is an egg
			if (!(e.getEntity() instanceof Player)) { //If the entity is not a player
				if (e.getEntity() instanceof LivingEntity) { //If the entity is living
					attemptCapture(e); //Attempt to capture the entity
				}
			}
		}
	}
	
	//Static methods for capturing LivingEntity:
	//Each mob needs a certain minimum experience level in order to be caught. At minimum level, the player has a 50% chance of
	//capturing the mob. For each successive level, the player has another 10% chance of capture. At five or more levels above
	//minimum, the player has a 100% chance of capturing the mob. No experience is lost when attempting to capture a mob.
	public static void attemptCapture(EntityDamageByEntityEvent e) {
		Player thrower = (Player) ((Projectile)e.getDamager()).getShooter();
		int type = e.getEntity().getType().getTypeId();
		int level = thrower.getLevel();
		Random random = new Random();
		
		if (type==65 || type==93 || type==101 || type==60 || type==60 || type==67) { //Bat, Chicken, Rabbit, Silverfish, Endermite
			if (level==5) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 5
			} else if (level==6) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 6
			} else if (level==7) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 7
			} else if (level==8) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 8
			} else if (level==9) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 9
			} else if (level>=10) {
				dropEgg(e);								 //100% chance at levels 10 and above
			}
		} else if (type==90 || type==91 || type==52 || type==55 || type==59 || type==62) { //Pig, Sheep, Spider, Slime, Cave Spider, Magma Cube
			if (level==10) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 10
			} else if (level==11) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 11
			} else if (level==12) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 12
			} else if (level==13) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 13
			} else if (level==14) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 14
			} else if (level>=15) {
				dropEgg(e);								 //100% chance at levels 15 and above
			}
		} else if (type==92) { //Cow
			if (level==15) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 15
			} else if (level==16) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 16
			} else if (level==17) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 17
			} else if (level==18) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 18
			} else if (level==19) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 19
			} else if (level>=20) {
				dropEgg(e);								 //100% chance at levels 20 and above
			}
		} else if (type==95 || type==98 || type==51 || type==54 || type==61 || type==68) { //Wolf, Ocelot, Skeleton, Zombie, Blaze, Guardian
			if (level==20) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 20
			} else if (level==21) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 21
			} else if (level==22) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 22
			} else if (level==23) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 23
			} else if (level==24) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 24
			} else if (level>=25) {
				dropEgg(e);								 //100% chance at levels 25 and above
			}
		} else if (type==100 || type==50 || type==56 || type==57 || type==58 || type== 66) { //Horse, Creeper, Ghast, Zombie Pigman, Enderman, Witch
			if (level==25) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 25
			} else if (level==26) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 26
			} else if (level==27) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 27
			} else if (level==28) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 28
			} else if (level==29) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 29
			} else if (level>=30) {
				dropEgg(e);								 //100% chance at levels 30 and above
			}
		} else if (type==96 || type==120) { //Mooshroom, Villager
			if (level==30) {
				if (random.nextDouble()<0.5) dropEgg(e); //50% chance at level 30
			} else if (level==31) {
				if (random.nextDouble()<0.6) dropEgg(e); //60% chance at level 31
			} else if (level==32) {
				if (random.nextDouble()<0.7) dropEgg(e); //70% chance at level 32
			} else if (level==33) {
				if (random.nextDouble()<0.8) dropEgg(e); //80% chance at level 33
			} else if (level==34) {
				if (random.nextDouble()<0.9) dropEgg(e); //90% chance at level 34
			} else if (level>=35) {
				dropEgg(e);								 //100% chance at levels 35 and above
			}
		}
	}
	public static void dropEgg(EntityDamageByEntityEvent e) {
		World world = e.getEntity().getWorld();
		Location loc = e.getEntity().getLocation();
					
		ItemStack egg = new ItemStack(Material.MONSTER_EGG, 1);
		egg.setDurability(e.getEntityType().getTypeId());
		
		e.getEntity().remove(); //Removes entity
		world.dropItem(loc, egg); //Drops entity egg
	}
}
