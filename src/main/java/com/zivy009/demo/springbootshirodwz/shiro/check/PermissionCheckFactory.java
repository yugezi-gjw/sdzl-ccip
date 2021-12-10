package com.zivy009.demo.springbootshirodwz.shiro.check;

import com.zivy009.demo.springbootshirodwz.common.support.CollectionKit;
import com.zivy009.demo.springbootshirodwz.common.support.HttpKit;
import com.zivy009.demo.springbootshirodwz.common.util.SpringContextHolder;
import com.zivy009.demo.springbootshirodwz.core.listener.ConfigListener;
import com.zivy009.demo.springbootshirodwz.persistence.model.SysUser;
import com.zivy009.demo.springbootshirodwz.shiro.ShiroKit;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 权限自定义检查
 */
@Service
@DependsOn("springContextHolder")
@Transactional(readOnly = true)
public class PermissionCheckFactory implements ICheck {

    public static ICheck me() {
        return SpringContextHolder.getBean(ICheck.class);
    }

    @Override
    public boolean check(Object[] permissions) {
        SysUser user = ShiroKit.getUser();
        if (null == user) {
            return false;
        }
        String join = CollectionKit.join(permissions, ",");
        if (ShiroKit.hasAnyRoles(join)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAll() {
        HttpServletRequest request = HttpKit.getRequest();
        SysUser user = ShiroKit.getUser();
        if (null == user) {
            return false;
        }
        String requestURI = request.getRequestURI().replace(ConfigListener.getConf().get("contextPath"), "");
        String[] str = requestURI.split("/");
        if (str.length > 3) {
            requestURI = "/" + str[1] + "/" + str[2];
        }
        if (ShiroKit.hasPermission(requestURI)) {
            return true;
        }
        return false;
    }

}
