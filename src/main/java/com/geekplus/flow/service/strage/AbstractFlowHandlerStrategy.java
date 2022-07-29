package com.geekplus.flow.service.strage;

import com.geekplus.flow.model.FlowResult;

/**
 * @author wenfeng.zhu
 * @description  默认重启之后走run之后的回调
 */
public abstract class AbstractFlowHandlerStrategy implements IFlowHandleStrategy {

    @Override
    public void callAfterRestart(FlowResult flowResult) {
        callAfterRun(flowResult);
    }
}
