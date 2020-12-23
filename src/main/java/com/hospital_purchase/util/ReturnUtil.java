package com.hospital_purchase.util;

import com.hospital_purchase.vo.Message;

public class ReturnUtil {
    /**
     *
     * @param str 需要在页面显示文字
     * @param count 修改数据库返回的int
     * @return
     */
    public static Message returnDataOperation(String str,Integer count){
        Message message = new Message();
        if (count>0){

            message.setSlogan(str+"成功！！");
            message.setEstimate(true);
            message.setCount(count);
        }else {
            message.setSlogan(str+"失败！！");
            message.setEstimate(false);
        }
        return message;
    }
    /**
     *
     * @param str 需要在页面显示文字
     * @param count 修改数据库返回的int
     * @return
     */
    public static Message returnData(String str,Integer count){
        Message message = new Message();
        if (count>0){

            message.setSlogan(str+"成功！！"+"共"+str+count+"条数据");
            message.setEstimate(true);
            message.setCount(count);
        }else {
            message.setSlogan(str+"失败！！");
            message.setEstimate(false);
        }
        return message;
    }
}
