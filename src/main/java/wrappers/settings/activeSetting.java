package wrappers.settings;

public class activeSetting extends settingWrapper<String>{
    public activeSetting(String pg, String nameEquip){
        this.pgName = pg;
        this.setting = nameEquip;
    }
}
