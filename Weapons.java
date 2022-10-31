package org.bot;

public class Weapons {

   private String Weapon_Name;
    private String Weapon_Type;
    private int Weapon_Damage;
   private int Weapon_Level;

    Weapons(String WName, String WType, int WDamage, int WLevel) {

        Weapon_Name = WName;
        Weapon_Type = WType;
        Weapon_Damage = WDamage;
        Weapon_Level = WLevel;

    }
        public String getWeapon_Name(){
            return Weapon_Name;
    }
        public String getWeapon_Type(){
            return Weapon_Type;
        }
        public int getWeapon_Damage(){
            return  Weapon_Damage;
        }
        public int getWeapon_Level(){
            return Weapon_Level;
        }



}

