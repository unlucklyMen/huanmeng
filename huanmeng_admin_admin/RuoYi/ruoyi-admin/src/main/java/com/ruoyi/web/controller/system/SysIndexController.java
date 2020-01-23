package com.ruoyi.web.controller.system;

import com.ruoyi.common.config.Global;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.domain.SysRole;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 首页 业务处理
 * 
 * @author ruoyi
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        mmap.put("demoEnabled", Global.isDemoEnabled());
        //判断登录用户角色，不同角色进入不同的首页
        Boolean flag = false;
        for ( SysRole role: user.getRoles()){
            if(role.getRoleId() == 1l)flag = true;
        }
        if(flag){
            return "index";
        }else{
            return "index_admin";
        }

    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 首页
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        //todo 需要修改为活的数据
        //当前月份总发帖数
        int postNum = 15;
        mmap.put("postNum",postNum);
        //发帖数相比上月是否增长
        boolean postAdd = true;
        mmap.put("postAdd",postAdd);
        //发帖数增长/减少比例是百分之多少
        float postRatio = 12.52f;
        mmap.put("postRatio",postRatio);
        //当前月份每天的发帖数
        int[] postNumList = {1,2,5,2,5,8,5,3,1,7};
        mmap.put("postNumList",postNumList);
        //当前月份总活跃用户
        int userNum = 25;
        mmap.put("userNum",userNum);
        //活跃数相比上月是否增长
        boolean userAdd = false;
        mmap.put("userAdd",userAdd);
        //活跃用户数增长/减少比例是百分之多少
        float userRatio = 12.55f;
        mmap.put("userRatio",userRatio);
        //当前月份每天的活跃用户
        int[] userNumList = {1,3,5,2,4,8,5,4,5,7};
        mmap.put("userNumList",userNumList);
        //软件版本信息
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
