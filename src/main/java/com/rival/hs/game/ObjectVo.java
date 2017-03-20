package com.rival.hs.game;

import java.util.ArrayList;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
public class ObjectVo {
    private boolean success;
    private ArrayList<GameDo> list;
    private int total_count;
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public ArrayList<GameDo> getList() {
        return list;
    }
    public void setList(ArrayList<GameDo> list) {
        this.list = list;
    }
    public int getTotal_count() {
        return total_count;
    }
    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }
}

