package org.example;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import org.example.crawling.fowCrawling;
import org.example.crawling.scoreCrawling;
import org.example.crawling.scoreCrawling2;
import org.example.crawling.scoreCrawling3;
import org.example.crawling.opggCrawling;

import java.awt.*;

public class Main extends ListenerAdapter {

    private fowCrawling fow;

    private scoreCrawling scoreCrawling;

    private scoreCrawling2 scoreCrawling2;

    private scoreCrawling3 scoreCrawling3;

    private opggCrawling opggCrawling;

    public static void main(String[] args) throws LoginException {

        String token = "";

        JDA jda = JDABuilder.createDefault(token)
                .setActivity(Activity.playing("베이스 연주"))
                .addEventListeners(new Main())
                .enableIntents(GatewayIntent.GUILD_MESSAGES)
                .enableIntents(GatewayIntent.DIRECT_MESSAGES)
                .build();
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String defaul = "봇아 ";
        if(!event.getAuthor().isBot()) {
            String messageSent = event.getMessage().getContentRaw();
            String name = messageSent.substring(messageSent.lastIndexOf("!")+1);
            User user = event.getAuthor();
            if(messageSent.equals(defaul + "안녕")) {
                event.getTextChannel().sendMessage("안녕하세요" + user.getName() + "님.").queue();
            }
            if(messageSent.equals(defaul + "솔랭정보 !" + name)) {
                EmbedBuilder embed = new EmbedBuilder()
                        .setAuthor(name, "https://fow.kr/find/"+name, (String) fow.profileImg(name))
                        .setTitle("랭킹 : " + (String) fow.rank(name))
                        .setDescription("등급 : **" + (String) fow.tier(name) + "**")
                        .addField("리그 포인트 : " + (String) fow.point(name), (String) fow.promotion(name), false)
                        .setThumbnail((String) fow.TierImg(name))
                        .setColor(Color.CYAN);
                event.getTextChannel().sendMessageEmbeds(embed.build()).queue();
            }
            if(messageSent.equals(defaul + "전적검색 !" + name)) {
                    EmbedBuilder scoreEmbed = new EmbedBuilder()
                            .setAuthor(name, "https://fow.kr/find/"+name, (String) fow.profileImg(name))
                            .setTitle(scoreCrawling.winLoss(name) + " / " +  scoreCrawling.mode(name))
                            .addField("KDA", scoreCrawling.point(name),false)
                            .setThumbnail(scoreCrawling.champion(name))
                            .setFooter(scoreCrawling.time(name))
                            .setColor(Color.white);
                    EmbedBuilder scoreEmbed2 = new EmbedBuilder()
                            .setAuthor(name, "https://fow.kr/find/"+name, (String) fow.profileImg(name))
                            .setTitle(scoreCrawling2.winLoss(name) + " / " +  scoreCrawling2.mode(name))
                            .addField("KDA", scoreCrawling2.point(name),false)
                            .setThumbnail(scoreCrawling2.champion(name))
                            .setFooter(scoreCrawling2.time(name))
                            .setColor(Color.white);
                    EmbedBuilder scoreEmbed3 = new EmbedBuilder()
                        .setAuthor(name, "https://fow.kr/find/"+name, (String) fow.profileImg(name))
                        .setTitle(scoreCrawling3.winLoss(name) + " / " +  scoreCrawling3.mode(name))
                        .addField("KDA", scoreCrawling3.point(name),false)
                        .setThumbnail(scoreCrawling3.champion(name))
                        .setFooter(scoreCrawling3.time(name))
                        .setColor(Color.white);
                    event.getTextChannel().sendMessageEmbeds(scoreEmbed.build()).queue();
                    event.getTextChannel().sendMessageEmbeds(scoreEmbed2.build()).queue();
                    event.getTextChannel().sendMessageEmbeds(scoreEmbed3.build()).queue();
            }
            if(messageSent.equals(defaul + "탑챔프 !" + name)) {
                EmbedBuilder champTier = new EmbedBuilder()
                        .setAuthor("TOP", "http://z.fow.kr/img/pos/pos_top.png", "http://z.fow.kr/img/pos/pos_top.png")
                        .setTitle(name)
                        .setDescription(opggCrawling.rank("top", name))
                        .setThumbnail(opggCrawling.champImg("top", name))
                        .setFooter("KR " + opggCrawling.version("top"))
                        .setColor(Color.darkGray);
                event.getTextChannel().sendMessageEmbeds(champTier.build()).queue();
            }
            if(messageSent.equals(defaul + "정글챔프 !" + name)) {
                EmbedBuilder champTier = new EmbedBuilder()
                        .setAuthor("JGL", "http://z.fow.kr/img/pos/pos_jungle.png", "http://z.fow.kr/img/pos/pos_jungle.png")
                        .setTitle(name)
                        .setDescription(opggCrawling.rank("jungle", name))
                        .setThumbnail(opggCrawling.champImg("jungle", name))
                        .setFooter("KR " + opggCrawling.version("jungle"))
                        .setColor(Color.darkGray);
                event.getTextChannel().sendMessageEmbeds(champTier.build()).queue();
            }
            if(messageSent.equals(defaul + "미드챔프 !" + name)) {
                EmbedBuilder champTier = new EmbedBuilder()
                        .setAuthor("MID", "http://z.fow.kr/img/pos/pos_middle.png", "http://z.fow.kr/img/pos/pos_middle.png")
                        .setTitle(name)
                        .setDescription(opggCrawling.rank("mid", name))
                        .setThumbnail(opggCrawling.champImg("mid", name))
                        .setFooter("KR " + opggCrawling.version("mid"))
                        .setColor(Color.darkGray);
                event.getTextChannel().sendMessageEmbeds(champTier.build()).queue();
            }
            if(messageSent.equals(defaul + "원딜챔프 !" + name)) {
                EmbedBuilder champTier = new EmbedBuilder()
                        .setAuthor("ADC", "http://z.fow.kr/img/pos/pos_bottom.png", "http://z.fow.kr/img/pos/pos_bottom.png")
                        .setTitle(name)
                        .setDescription(opggCrawling.rank("adc", name))
                        .setThumbnail(opggCrawling.champImg("adc", name))
                        .setFooter("KR " + opggCrawling.version("adc"))
                        .setColor(Color.darkGray);
                event.getTextChannel().sendMessageEmbeds(champTier.build()).queue();
            }
            if(messageSent.equals(defaul + "서폿챔프 !" + name)) {
                EmbedBuilder champTier = new EmbedBuilder()
                        .setAuthor("SPT", "http://z.fow.kr/img/pos/pos_utility.png", "http://z.fow.kr/img/pos/pos_utility.png")
                        .setTitle(name)
                        .setDescription(opggCrawling.rank("support", name))
                        .setThumbnail(opggCrawling.champImg("support", name))
                        .setFooter("KR " + opggCrawling.version("support"))
                        .setColor(Color.darkGray);
                event.getTextChannel().sendMessageEmbeds(champTier.build()).queue();
            }
        }


    }
}