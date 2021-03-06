package com.qtt.jinrong.http.action;

import android.content.Context;

import com.qtt.jinrong.bean.recommend.AdResponse;
import com.qtt.jinrong.http.Api;
import com.qtt.framework.http.MCListenerObj;

import java.util.HashMap;

import static com.qtt.jinrong.http.action.IWBaseReqsAction.getPostReq7HeardInfo;

/**
 * Created by yanxin on 16/2/23.
 */
public class RecommendAction {

    /**
     * 获取滚动栏
     * @param context
     * @param listener
     */
    public static void requestAd(Context context,MCListenerObj.IObjResListener<AdResponse> listener) {
        getPostReq7HeardInfo(context, Api.ADVERT,new HashMap<String, Object>(),listener,AdResponse.class);
    }

}
