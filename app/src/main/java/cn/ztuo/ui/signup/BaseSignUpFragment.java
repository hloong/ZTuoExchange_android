package cn.ztuo.ui.signup;

import cn.ztuo.base.BaseTransFragment;

/**
 * Created by Administrator on 2018/2/2.
 */

public abstract class BaseSignUpFragment extends BaseTransFragment {
    public interface OperateCallback {
        void switchType(Type type);
    }

    public enum Type {
        PHONE, EMAIL
    }
}
