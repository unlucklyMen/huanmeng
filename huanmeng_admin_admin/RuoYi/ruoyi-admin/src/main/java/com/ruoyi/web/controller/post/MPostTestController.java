package com.ruoyi.web.controller.post;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.post.domain.MPost;
import com.ruoyi.post.service.IMPostService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 帖子Controller
 * 
 * @author ruoyi
 * @date 2020-01-23
 */
@Controller
@RequestMapping("/post/post")
public class MPostTestController extends BaseController
{
    private String prefix = "post/post";

    @Autowired
    private IMPostService mPostService;

    @RequiresPermissions("post:post:view")
    @GetMapping()
    public String post()
    {
        return prefix + "/post";
    }

    /**
     * 查询帖子列表
     */
    @RequiresPermissions("post:post:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MPost mPost)
    {
        startPage();
        List<MPost> list = mPostService.selectMPostList(mPost);
        return getDataTable(list);
    }

    /**
     * 导出帖子列表
     */
    @RequiresPermissions("post:post:export")
    @Log(title = "帖子", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MPost mPost)
    {
        List<MPost> list = mPostService.selectMPostList(mPost);
        ExcelUtil<MPost> util = new ExcelUtil<MPost>(MPost.class);
        return util.exportExcel(list, "post");
    }

    /**
     * 新增帖子
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存帖子
     */
    @RequiresPermissions("post:post:add")
    @Log(title = "帖子", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MPost mPost)
    {
        return toAjax(mPostService.insertMPost(mPost));
    }

    /**
     * 修改帖子
     */
    @GetMapping("/edit/{postId}")
    public String edit(@PathVariable("postId") Long postId, ModelMap mmap)
    {
        MPost mPost = mPostService.selectMPostById(postId);
        mmap.put("mPost", mPost);
        return prefix + "/edit";
    }

    /**
     * 修改保存帖子
     */
    @RequiresPermissions("post:post:edit")
    @Log(title = "帖子", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MPost mPost)
    {
        return toAjax(mPostService.updateMPost(mPost));
    }

    /**
     * 删除帖子
     */
    @RequiresPermissions("post:post:remove")
    @Log(title = "帖子", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mPostService.deleteMPostByIds(ids));
    }
}
