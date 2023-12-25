package com.example.netclanexplorer;
public class ExploreModal {
    private int imageResource;
    private String personName;
    private String personAddress;
    private String  distance;
    private String  friendship;
    private String Community;

    public ExploreModal(int imageResource, String personName, String personAddress, String distance, String friendship, String community) {
        this.imageResource = imageResource;
        this.personName = personName;
        this.personAddress = personAddress;
        this.distance = distance;
        this.friendship = friendship;
        Community = community;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFriendship() {
        return friendship;
    }

    public void setFriendship(String friendship) {
        this.friendship = friendship;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String community) {
        Community = community;
    }
}
