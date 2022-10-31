package org.bot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;

public class Damaria_Bot {

    private final Dotenv config;
    private final ShardManager shardManager;

    public Damaria_Bot() throws LoginException {
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");

        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.GUILD_MESSAGES);
        shardManager = builder.build();

        shardManager.addEventListener(new Player_Backpack());
    }

    public Dotenv getConfig() {
        return config;
    }

    public ShardManager getShardManager() {
        return shardManager;
    }

    public static void main(String[] args) {


        try {
            Damaria_Bot bot = new Damaria_Bot();
        } catch (LoginException e) {
            System.out.println("Error: BOT TOKEN INVALID");
        }

    }
}