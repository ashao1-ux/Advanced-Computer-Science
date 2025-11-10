public class Home {
    private String address;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean isScheduled;
   
    public Home(String address, String ownerName, int cleanlinessLevel) {
       this.address = address;
       this.ownerName = ownerName;
       this.cleanlinessLevel = cleanlinessLevel;
       this.username = CleanUtils.generateUsername(ownerName);
       isScheduled = false;
    }

    public Home() {
        this.address = "address";
        this.ownerName = "owner Name";
        this.cleanlinessLevel = 0;
        this.username = CleanUtils.generateUsername(ownerName);
        isScheduled = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = CleanUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setisScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String toString() {
        return "== ABOUT HOME ==" + "\nAddress: " + address + "\nOwner: " + ownerName 
            + "\nUsername: " + username + "\nCleanliness Level: " + cleanlinessLevel + "\nIs scheduled for cleaning?" + isScheduled;
    }

    public boolean equals(Home other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }

    

}
