package com.markerhub.utils;

import com.markerhub.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author shkstart
 * @create 2022-09-30 13:19
 */
public class ShiroUtil {

    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
