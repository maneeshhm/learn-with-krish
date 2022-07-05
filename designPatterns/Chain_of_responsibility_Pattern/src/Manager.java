public class Manager extends Handler {
    @Override
    public String applyRole(Role role) {
        role.setRoleType("Manager");
        return role.getRoleType();
    }
}
