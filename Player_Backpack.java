package org.bot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;

public class Player_Backpack extends ListenerAdapter {



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getMessage().getContentRaw().toLowerCase().startsWith(";")) {
            ArrayList<Weapons> Weapon_Backpack = new ArrayList<>();

            Weapons sword = new Weapons("sword","melee",5, 5);

           Weapon_Backpack.add(sword);


            for (Weapons thisWeapon : Weapon_Backpack) {
                String WInfo = thisWeapon.getWeapon_Name() + "\n" + thisWeapon.getWeapon_Type() + "\n" +
                        thisWeapon.getWeapon_Damage() + "\n" + thisWeapon.getWeapon_Level();

                event.getChannel().sendMessage(WInfo).queue();

            }
        }


    }

}