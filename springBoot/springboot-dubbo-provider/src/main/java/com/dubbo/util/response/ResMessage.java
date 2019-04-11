package com.dubbo.util.response;

/*枚举类*/
public enum ResMessage {
    SUCCESS(0, "请求成功"),
    WARN(-1, "网络异常，请稍后重试");

    private int rescode;
    private String resmsg;

    ResMessage(int rescode, String resmsg) {
        this.resmsg = resmsg;
    }

    public int getResCode() {
        return rescode;
    }
    public String getResMsg() {
        return resmsg;
    }
}
