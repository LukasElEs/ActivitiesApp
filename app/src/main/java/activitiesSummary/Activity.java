package activitiesSummary;


public class Activity {
    public Activity(){

    }

    String ActivityName;
    String ActivityDescription;
    boolean favourited;
    String[] Tags;

    public void setName(String name) {
        ActivityName =  name;
    }

    public void setDescription(String desc) {
        ActivityDescription =  desc;
    }

    public void setTags(String[] tags) {
        for (int i=0; i < tags.length;i++){
            Tags[i] = tags[i];
            // TODO Save those values in DB
        }
    }
}
