public class Supervisor extends Handler{

    @Override
    public String applyRole(Role role) {
        role.setRoleType("supervisor");
        if (role.getRoleType().equals("supervisor")){
            return role.getRoleType()
        }
        else {
            return successor.applyRole(role);
        }
    }
}
