package ysomap.core.bean;

import ysomap.common.util.Logger;
import ysomap.core.ObjectGadget;
import ysomap.core.util.ReflectionHelper;

/**
 * @author wh1t3P1g
 * @since 2020/2/19
 */
@SuppressWarnings({"rawtypes"})
public abstract class Bullet<T> implements ObjectGadget<T> {

    public Bullet(){ }

    @Override
    public Bullet set(String key, Object value) throws Exception {
        ReflectionHelper.setFieldValue(this, key, value);
        return this;
    }

    public String get(String key) {
        try {
            return (String) ReflectionHelper.getFieldValue(this, key);
        } catch (Exception e) {
            Logger.error("Key "+key+" not found");
            return null;
        }
    }
}
