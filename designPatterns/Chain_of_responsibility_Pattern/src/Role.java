public class Role {

    private String roleType;
    private int id;

    public Role((String roleType)){
        this.roleType = roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }
}
