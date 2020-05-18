package util.lexEnum;

public enum Abilities {
    STR(11,"Strength"),
    DEX(18,"Dexterity"),
    CON(19,"Constitution"),
    WIS(20,"Intelligence"),
    INT(21,"Wisdom"),
    CHA(22,"Charisma");

    private int pdfFormCheckBox;
    private String descr;

    Abilities(int checkbox,String name) {
        pdfFormCheckBox = checkbox;
        descr = name;
    }

    public int getPdfFormCheckBox() {
        return pdfFormCheckBox;
    }

    public String getDescr(){
        return descr;
    }
}
