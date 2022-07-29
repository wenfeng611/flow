package com.geekplus.flow.controller;

import com.geekplus.flow.model.ApiResponse;
import com.geekplus.flow.model.FlowItemSearchModel;
import com.geekplus.flow.service.FlowItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenfeng.zhu
 * @description
 */

@RestController
@RequestMapping("api/flowitemdetail")
public class FlowItemDetailController {

    @Autowired
    private FlowItemDetailService flowItemDetailService;

    /**
     *  根据item的id查询细节
     * @param searchModel  flowItemId 和分页信息
     */
    @PostMapping("queryPage")
    public ApiResponse queryPage(@RequestBody FlowItemSearchModel searchModel){
        return flowItemDetailService.queryPage(searchModel);
    }
}
