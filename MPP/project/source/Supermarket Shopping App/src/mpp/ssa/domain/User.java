package mpp.ssa.domain;

import java.util.List;

public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    public User(String username) {
        setUsername(username);
    }

    private List<UserSetting> userSettingList;

    public List<UserSetting> getUserSettingList() {
        return userSettingList;
    }

    public void setUserSettingList(List<UserSetting> userSettingList) {
        this.userSettingList = userSettingList;
    }

    private String username;

    private String password;

    private UserType userType;

    private boolean loginStatus;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
}