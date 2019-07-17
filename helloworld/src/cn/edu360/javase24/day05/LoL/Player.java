package cn.edu360.javase24.day05.LoL;

import java.util.ArrayList;
import java.util.Set;

public class Player {
    private String account;
    private String missionId;
    private String Hero;
    private ArrayList<String> equipments;
    private int assistants;
    private int kills;
    private int killedSoldiers;
    private int missionScore;
    private int amountScore;
    private int HeroLevel;

    public void setAmountScore(boolean flages) {
        if(flages) {
            this.amountScore += 100;
        }
        else {
            this.amountScore += 1;
        }
    }
    public void showInfo(){
        System.out.println("用户名: " + this.account + "\n英雄: " + this.Hero + "\n人头: " + this.kills +
                "\n助攻数: " + this.assistants + "\n补刀数: " + this.killedSoldiers + "\n等级: " +
                this.HeroLevel + "\n金币: " + this.missionScore);
    }
    public Player(String account){
        this.account = account;
        this.missionId = "";
        this.Hero = "";
        this.equipments = new ArrayList<String>();
        this.killedSoldiers = 0;
        this.kills = 0;
        this.amountScore = 0;
        this.assistants = 0;
        this.missionScore = 0;
        this.HeroLevel = 0;
    }

    public void setMissionId(String missionId){
        this.missionId = missionId;
    }
    public void setHero(String hero){
        this.Hero = hero;
    }

    public void addEquipment(String ename){
        this.equipments.add(ename);
        // 每增加一件装备 当局等分+5
        this.missionScore += 5;
        this.setHeroLevel();
    }

    public void addKills(){
        this.kills ++;
        this.missionScore += 20;
        this.setHeroLevel();
    }
    public void addKillSoldier(){
        this.killedSoldiers ++;
        this.missionScore += 2;
        this.setHeroLevel();
    }

    public void addAssistant(){
        this.assistants ++;
        // 每增加一个助攻 当局等分+10
        this.missionScore += 10;
        this.setHeroLevel();
    }

    private void setHeroLevel(){
        if (this.missionScore < 150){
            this.HeroLevel = 1;
        }
        if (this.missionScore >= 150 && this.missionScore < 300){
            this.HeroLevel = 2;
        }
        if (this.missionScore >= 300 && this.missionScore < 500){
            this.HeroLevel = 3;
        }
        if (this.missionScore >= 500){
            this.HeroLevel = 4;
        }
    }
}
