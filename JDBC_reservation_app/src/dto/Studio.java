package dto;

public class Studio {
	private int studioId;
    private String studioName;
    private String location;

    public Studio(int studioId, String studioName, String location) {
        this.studioId = studioId;
        this.studioName = studioName;
        this.location = location;
    }

    public int getStudioId() { return studioId; }
    public void setStudioId(int studioId) { this.studioId = studioId; }

    public String getStudioName() { return studioName; }
    public void setStudioName(String studioName) { this.studioName = studioName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

}
