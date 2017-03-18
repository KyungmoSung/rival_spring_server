package com.rival.hs.team;

/**
 * Created by Minwoo on 2017. 3. 18..
 */
public class TeamDo {

    private int team_id;
    private String team_name;
    private String team_member_count;

    public TeamDo(int team_id, String team_name, String team_member_count) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.team_member_count = team_member_count;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_member_count() {
        return team_member_count;
    }

    public void setTeam_member_count(String team_member_count) {
        this.team_member_count = team_member_count;
    }
}
