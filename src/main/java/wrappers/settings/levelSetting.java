package wrappers.settings;

import util.lexEnum.Classi;

public class levelSetting extends settingWrapper<Integer> {

    private Classi pgClass;

    public levelSetting(String pg, Integer level, Classi pgClass){
        this.pgName = pg;
        this.setting = level;
        this.pgClass = pgClass;

    }

    public Classi getPgClass(){
        return pgClass;
    }
}
