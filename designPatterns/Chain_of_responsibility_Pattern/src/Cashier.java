public class Cashier extends Handler{
    @Override
    public String applyRole(Role role) {
        role.setRoleType("chashier");
        if (role.getRoleType().equals("chashier")){
            return role.getRoleType();
        }
        else {
            return successor.applyRole(role);
        }
    }
}
