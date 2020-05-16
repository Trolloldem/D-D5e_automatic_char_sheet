package wrappers.settings;

import wrappers.semanticResult;

public abstract class settingWrapper<T> implements semanticResult {

    protected String pgName;
    protected T setting;

    public String getPgName() {
        return pgName;
    }

    public T getSetting() {
        return setting;
    }

}
