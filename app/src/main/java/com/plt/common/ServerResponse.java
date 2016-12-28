package com.plt.common;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by Dori on 3/10/2016.
 */

public class ServerResponse implements Serializable {

    @SerializedName("message")
    private String message;
    private JSONObject data;
//    @SerializedName("response_code")
//    private int responseCode;
//    @SerializedName("RESULT_CODE")
//    private int RESULT_CODE;
//    @SerializedName("RESULT_MESSAGE")
//    private String RESULT_MESSAGE;
//    @SerializedName("RESULT")
//    private JsonObject RESULT;

    public ServerResponse(String message){
        this.message = message;
//        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
//
//    public int getResponseCode() {
//        return responseCode;
//    }
//
//    public void setResponseCode(int responseCode) {
//        this.responseCode = responseCode;
//    }
//
//    public int getRESULT_CODE() {
//        return RESULT_CODE;
//    }
//
//    public void setRESULT_CODE(int RESULT_CODE) {
//        this.RESULT_CODE = RESULT_CODE;
//    }
//
//    public String getRESULT_MESSAGE() {
//        return RESULT_MESSAGE;
//    }
//
//    public void setRESULT_MESSAGE(String RESULT_MESSAGE) {
//        this.RESULT_MESSAGE = RESULT_MESSAGE;
//    }
//
//    public JsonObject getRESULT() {
//        return RESULT;
//    }
//
//    public void setRESULT(JsonObject RESULT) {
//        this.RESULT = RESULT;
//    }

    public JSONObject getData() {
        return this.data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }
}
