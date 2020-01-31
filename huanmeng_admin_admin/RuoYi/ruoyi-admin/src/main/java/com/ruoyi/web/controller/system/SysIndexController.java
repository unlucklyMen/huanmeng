package com.ruoyi.web.controller.system;

import com.ruoyi.bar.service.IMNewFloorService;
import com.ruoyi.bar.service.IMNewPostService;
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

import java.time.LocalDateTime;
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

    @Autowired
    private IMNewPostService newPostService;

    @Autowired
    private IMNewFloorService newFloorService;

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
        //获取当前日期
        LocalDateTime now = LocalDateTime.now();
        //当前月份总发帖数
        int postNum = newPostService.getMonthAllPostNum(now.getMonthValue(),now.getYear());
        mmap.put("postNum",postNum);

        //发帖数相比上月是否增长
        int LastPostNum = newPostService.getMonthAllPostNum(now.minusMonths(1).getMonthValue(),now.minusMonths(1).getYear());
        boolean postAdd = LastPostNum<postNum;
        mmap.put("postAdd",postAdd);
        //发帖数增长/减少比例是百分之多少
        if(LastPostNum == 0 && postNum == 0){
            mmap.put("postRatio","0");
        }else if(LastPostNum == 0 ){
            mmap.put("postRatio","∞");
        }else{
            float postRatio = (postNum - LastPostNum)/LastPostNum;
            mmap.put("postRatio",postRatio);
        }
        //当前月份每天的发帖数
        mmap.put("postNumList",newPostService.getMonthByDayForList(now.getMonthValue(),now.getYear()));

        //当前月份总活跃用户
        int userNum = newFloorService.getAllActiveUserByMonth(now.getMonthValue(),now.getYear());
        mmap.put("userNum",userNum);
        //活跃数相比上月是否增长
        int LastuserNum = newFloorService.getAllActiveUserByMonth(now.minusMonths(1).getMonthValue(),now.minusMonths(1).getYear());
        boolean userAdd = LastuserNum<userNum;
        mmap.put("userAdd",userAdd);
        //活跃用户数增长/减少比例是百分之多少
        if(LastuserNum == 0 && userNum == 0){
            mmap.put("userRatio","0");
        }else if(LastuserNum == 0 ){
            mmap.put("userRatio","∞");
        }else{
            float userNumRatio = (userNum - LastuserNum)/LastuserNum;
            mmap.put("userRatio",userNumRatio);
        }
        //当前月份每天的活跃用户
        mmap.put("userNumList",newFloorService.getAllActiveUserByMonthForList(now.getMonthValue(),now.getYear()));
        //软件版本信息
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
