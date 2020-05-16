package wrappers.settings;

import util.lexEnum.Backgrounds;

public class bgSetting extends settingWrapper<Backgrounds> {
    public bgSetting(String pg, Backgrounds bg){
        this.pgName = pg;
        this.setting = bg;
    }
}
