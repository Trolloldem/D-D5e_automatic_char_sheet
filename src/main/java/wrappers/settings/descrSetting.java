package wrappers.settings;

public class descrSetting extends settingWrapper<String>{

    public descrSetting(String pg, String descr){
        this.pgName = pg;
        this.setting = descr;
    }
}
