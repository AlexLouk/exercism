class Badge {
    public String print(Integer id, String name, String department) {
        String deptPart = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            return String.format("%s - %s", name, deptPart);
        } else {
            return String.format("[%d] - %s - %s", id, name, deptPart);
        }
    }
}